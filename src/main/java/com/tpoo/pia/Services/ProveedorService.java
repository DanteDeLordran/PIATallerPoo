package com.tpoo.pia.Services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tpoo.pia.Models.Proveedor;
import com.tpoo.pia.Repositories.ProveedorRepository;

@Service
public class ProveedorService {
    
    @Autowired
    ProveedorRepository proveedorRepository;

    public ArrayList<Proveedor> obtenerProveedores(){
        return ( ArrayList<Proveedor> ) proveedorRepository.findAll();
    }

    public Proveedor guardarProveedor( Proveedor proveedor ){
        return proveedorRepository.save(proveedor);
    }

    public Optional<Proveedor> obtenerPorId( Integer id ){
        return proveedorRepository.findById(id);
    }

}
