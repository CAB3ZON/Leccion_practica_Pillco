/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tendencias.m5a.Usuarios.controller;

import com.tendencias.m5a.Usuarios.model.Venta;
import com.tendencias.m5a.Usuarios.service.VentaServicelmpl;
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
@RequestMapping("/venta")
public class VentaController {
    @Autowired 
    VentaServicelmpl ventaService;
    
    @Operation(summary = "Se obtiene la lista de Usuarios")
    @GetMapping("/listar")
    public ResponseEntity<List<Venta>> listaUsuarios() {
        return new ResponseEntity<>(ventaService.findByAll(), HttpStatus.OK);
    }

    @Operation(summary = "Debe enviar los campos de la venta")
    @PostMapping("/crear")
    public ResponseEntity<Venta> crearUsuario(@RequestBody Venta u) {
        return new ResponseEntity<>(ventaService.save(u), HttpStatus.CREATED);
    }

   
    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Venta> eliminarUsuario(@PathVariable Integer id) {
        ventaService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
