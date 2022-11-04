package com.tpoo.pia.Services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.tpoo.pia.Models.Proveedor;
import com.tpoo.pia.Repositories.ProveedorRepository;

public class ProveedorService {
    
    @Autowired
    ProveedorRepository proveedorRepository;

    public ArrayList<Proveedor> obtenerOperadores(){
        return ( ArrayList<Proveedor> ) proveedorRepository.findAll();
    }

    public Proveedor guardarOperador( Proveedor proveedor ){
        return proveedorRepository.save(proveedor);
    }

    public Optional<Proveedor> obtenerPorId( Integer id ){
        return proveedorRepository.findById(id);
    }

}
