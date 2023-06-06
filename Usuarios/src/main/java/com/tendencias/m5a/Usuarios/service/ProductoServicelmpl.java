/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tendencias.m5a.Usuarios.service;

import com.tendencias.m5a.Usuarios.model.Productos;
import com.tendencias.m5a.Usuarios.repository.ProductosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author USUARIO
 */
@Service
public class ProductoServicelmpl extends GenericServiceImpl<Productos,Integer> implements GenericService<Productos,Integer>{
@Autowired
ProductosRepository productosRespository;
    @Override
    public CrudRepository<Productos, Integer> getDao() {
return productosRespository;
    }
    
}
