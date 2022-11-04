package com.tpoo.pia.Controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tpoo.pia.Models.Operador;
import com.tpoo.pia.Services.OperadorService;

@RestController
@RequestMapping( "/api" )
public class OperadorController {

    @Autowired
    OperadorService operadorService;

    @GetMapping( "/operadores" )
    public ArrayList<Operador> obtenerOperadores(){
        return operadorService.obtenerOperadores();
    }

    //http://localhost:8080/api/operador
    @PostMapping( "/operador" )
    public Operador guardarOperador( @RequestBody Operador operador ){
        return operadorService.guardarOperador(operador);
    }

}
