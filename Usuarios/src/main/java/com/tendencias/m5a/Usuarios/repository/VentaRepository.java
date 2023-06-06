/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tendencias.m5a.Usuarios.repository;

import com.tendencias.m5a.Usuarios.model.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author USUARIO
 */
public interface VentaRepository extends JpaRepository<Venta,Integer>{
    @Query (value = "Select * from usuario u where u.nombre = :nombre", nativeQuery = true)
    public Venta buscar_venta(String nombre);
}
