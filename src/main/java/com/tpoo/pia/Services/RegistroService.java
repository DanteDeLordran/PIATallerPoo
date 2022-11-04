package com.tpoo.pia.Services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tpoo.pia.Models.Registro;
import com.tpoo.pia.Repositories.RegistroRepository;

@Service
public class RegistroService {
    
    @Autowired
    RegistroRepository registroRepository;

    public ArrayList<Registro> obtenerRegistros(){
        return ( ArrayList<Registro> ) registroRepository.findAll();
    }

    public Registro guardarRegistro( Registro registro ){
        return registroRepository.save(registro);
    }

    public Optional<Registro> obtenerPorId( Integer id ){
        return registroRepository.findById(id);
    }

}
