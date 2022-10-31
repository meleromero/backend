/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.Interface;

import com.example.demo.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    //Traer personas

    /**
     *
     * @return 
     */
    public List<Persona> getPersona();
    
    //Guardar persona
    public void savePersona(Persona persona);
    
    //Eliminar usuario. buscar por id
    public void deletePersona(Long id);
    
    //Buscar persona por id
    public Persona findPersona(Long id);
}
