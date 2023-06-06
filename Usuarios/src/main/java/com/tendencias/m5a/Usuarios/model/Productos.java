/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tendencias.m5a.Usuarios.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

/**
 *
 * @author USUARIO
 */
@Data
@Entity
public class Productos {
    
    //relacionarle con USURARIO proveedor
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private int id_producto;
    
    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "descripcion")
    private String descripcion;
    
    @Column(name = "categoria")
    private String categoria;
    
    @Column(name = "precio_emprendedor")
    private Double precio_emprendedor;
    
    @Column(name = "cantidad_inventario")
    private int cantidad_inventario;
    
    
    
    @ManyToOne
    @JoinColumn(name="id_usuario",referencedColumnName = "id_usuario")
    private Usuario usuario;
    
}
