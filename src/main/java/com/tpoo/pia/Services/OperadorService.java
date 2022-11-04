package com.tpoo.pia.Services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tpoo.pia.Models.Operador;
import com.tpoo.pia.Repositories.OperadorRepository;

@Service
public class OperadorService {
    
    @Autowired
    OperadorRepository operadorRepository;

    public ArrayList<Operador> obtenerOperadores(){
        return ( ArrayList<Operador> ) operadorRepository.findAll();
    }

    public Operador guardarOperador( Operador operador ){
        return operadorRepository.save(operador);
    }

}
