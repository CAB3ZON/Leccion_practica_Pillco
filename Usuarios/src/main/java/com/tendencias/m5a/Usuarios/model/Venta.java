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
import jakarta.persistence.OneToOne;
import java.util.Date;
import lombok.Data;

/**
 *
 * @author USUARIO
 */
 @Data
@Entity
public class Venta {
  //SE RELACIONA CON producto
     //se relaciona con persona
       @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_venta")
    private int id_venta;
       
       @Column(name = "fecha_venta")
    private Date fecha_venta;
       
       @Column(name = "cantidad")
    private int cantidad;
       
       @Column(name = "PVP")
    private Double PVP;
    
    @Column(name = "ganancia_porcentual")
    private Double ganancia_porcentual;
       
    
    @OneToOne(mappedBy="venta")   
    private Persona persona;
       
       
   
}
