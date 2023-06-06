/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tendencias.m5a.Usuarios.service;

import com.tendencias.m5a.Usuarios.model.Persona;
import com.tendencias.m5a.Usuarios.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author USUARIO
 */
@Service
public class PersonaServicelmpl extends GenericServiceImpl<Persona,Integer> implements GenericService<Persona,Integer> {
@Autowired
PersonaRepository personaRepository;
    @Override
    public CrudRepository<Persona, Integer> getDao() {
return personaRepository;
        }
    
}
