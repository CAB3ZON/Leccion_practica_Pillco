/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tendencias.m5a.Usuarios.service;

import com.tendencias.m5a.Usuarios.model.Rol;
import com.tendencias.m5a.Usuarios.repository.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author USUARIO
 */
@Service
public class RolServicelmpl extends GenericServiceImpl<Rol, Integer> implements GenericService<Rol, Integer> {

    @Autowired
    RolRepository rolRepository;
    
    @Override
    public CrudRepository<Rol, Integer> getDao() {
return rolRepository;
        }
    
}
