/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tendencias.m5a.Usuarios.repository;

import com.tendencias.m5a.Usuarios.model.Productos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author USUARIO
 */
public interface ProductosRepository  extends JpaRepository<Productos,Integer> {
     @Query(value = "Select * from productos r where r.nombre = :nombre", nativeQuery = true)
    public Productos buscarProductos(String nombre);
    
}
