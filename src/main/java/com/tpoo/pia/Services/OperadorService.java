package com.tpoo.pia.Services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.tpoo.pia.Models.Operador;
import com.tpoo.pia.Repositories.OperadorRepository;

public class OperadorService {

    @Autowired
    OperadorRepository operadorRepository;
    
    public ArrayList<Operador> obtenerOperadores(){
        return ( ArrayList<Operador>) operadorRepository.findAll();
    }

    public Operador guardarOperador( Operador operador ){
        return operadorRepository.save(operador);
    }

    public Optional<Operador> obtenerPorId( Integer id ){
        return operadorRepository.findById(id);
    }

}
