package com.tpoo.pia.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tpoo.pia.Models.Registro;

@Repository
public interface RegistroRepository extends CrudRepository<Registro,Integer>{
    
}
