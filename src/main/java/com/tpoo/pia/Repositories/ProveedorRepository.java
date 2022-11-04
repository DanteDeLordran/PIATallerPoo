package com.tpoo.pia.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tpoo.pia.Models.Proveedor;

@Repository
public interface ProveedorRepository extends CrudRepository<Proveedor,Integer>{
    
}
