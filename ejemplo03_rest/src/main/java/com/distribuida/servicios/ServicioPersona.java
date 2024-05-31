package com.distribuida.servicios;


import com.distribuida.db.Persona;

import java.util.List;

public interface ServicioPersona {

    Persona findById(int id);
    List<Persona> findAll();


}
