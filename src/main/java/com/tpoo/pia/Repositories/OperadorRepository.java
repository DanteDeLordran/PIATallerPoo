package com.tpoo.pia.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tpoo.pia.Models.Operador;

@Repository
public interface OperadorRepository extends CrudRepository<Operador,Integer>{
    
}
