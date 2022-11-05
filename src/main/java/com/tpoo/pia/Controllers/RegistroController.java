package com.tpoo.pia.Controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tpoo.pia.Models.Registro;
import com.tpoo.pia.Services.RegistroService;

@RestController
@RequestMapping( "/api" )
public class RegistroController {
    
    @Autowired
    RegistroService registroService;

    //http://localhost:8080/api/registros
    @GetMapping( "/registros" )
    public ArrayList<Registro> obtenerRegistros(){
        return registroService.obtenerRegistros();
    }

    /*
     * {
            "fecha_rgtro": null,
            "rmsn_rgrto": null,
            "nomcli_rgtro": null,
            "sku_rgtro": null,
            "lote_rgtro": null,
            "cjs_rgtro": null,
            "kilos_rgtro": null,
            "puni_rgtro": null,
            "totkg_rgtro": null,
            "mtotl_rgtro": null
        }
     */

    @PostMapping( "/registro" )
    public Registro guardarRegistro(@RequestBody Registro registro ){
        return registroService.guardarRegistro(registro);
    }

}
