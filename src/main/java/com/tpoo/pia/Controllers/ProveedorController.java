package com.tpoo.pia.Controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tpoo.pia.Models.Proveedor;
import com.tpoo.pia.Services.ProveedorService;

@RestController
@RequestMapping( "/api" )
public class ProveedorController {
    
    @Autowired
    ProveedorService proveedorService;

    //http://localhost:8080/api/proveedores
    @GetMapping( "/proveedores" )
    public ArrayList<Proveedor> obtenerProveedores(){
        return proveedorService.obtenerProveedores();
    }

    /*
     * {
     *      "nombre" : ""
     * }
     */

    //http://localhost:8080/api/proveedor
    @PostMapping( "/proveedor" )
    public Proveedor guardarOperador( @RequestBody Proveedor proveedor ){
        return proveedorService.guardarProveedor(proveedor);
    }

    //http://localhost:8080/api/proveedor/${id}
    @GetMapping( path = "/proveedor/{id}" )
    public Optional<Proveedor> obtenerPorId( @PathVariable("id") Integer id ){
        return proveedorService.obtenerPorId(id);
    }

}
