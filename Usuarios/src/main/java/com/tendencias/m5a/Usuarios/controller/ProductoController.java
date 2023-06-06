/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tendencias.m5a.Usuarios.controller;

import com.tendencias.m5a.Usuarios.model.Productos;
import com.tendencias.m5a.Usuarios.service.ProductoServicelmpl;
import io.swagger.v3.oas.annotations.Operation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author USUARIO
 */
@RestController
@RequestMapping("/producto")
public class ProductoController {
    @Autowired
    ProductoServicelmpl productoService;
    
    @Operation(summary = "Se obtiene la lista de productos")
    @GetMapping("/listar")
    public ResponseEntity<List<Productos>> listaPersona() {
        return new ResponseEntity<>(productoService.findByAll(), HttpStatus.OK);
    }

    @Operation(summary = "Debe enviar los campos del producto")
    @PostMapping("/crear")
    public ResponseEntity<Productos> crearPersona(@RequestBody Productos u) {
        return new ResponseEntity<>(productoService.save(u), HttpStatus.CREATED);
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Productos> actualizarPersona(@PathVariable Integer id, @RequestBody Productos u) {
        Productos persona = productoService.findById(id);
        if (persona != null) {
            try {
                persona.setNombre(u.getNombre());
                persona.setPrecio_emprendedor(u.getPrecio_emprendedor());
                persona.setDescripcion(u.getDescripcion());
                persona.setCategoria(u.getCategoria());
                persona.setCantidad_inventario(u.getCantidad_inventario());
                
                return new ResponseEntity<>(productoService.save(persona), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }

        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Productos> eliminarPersona(@PathVariable Integer id) {
        productoService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
}
