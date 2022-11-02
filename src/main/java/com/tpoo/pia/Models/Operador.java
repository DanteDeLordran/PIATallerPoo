package com.tpoo.pia.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "operador" )
public class Operador {
    
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column( unique = true, nullable = false ,name = "id" ,columnDefinition = "tinyint")
    private Integer id_opdr;

    @Column( nullable = false, name = "nombre" , columnDefinition = "char(50)" )
    private String nom_opdr;

    public Operador(){}

    public Operador(String nom_opd){
        this.nom_opdr = nom_opd;
    }

    public Integer getId(){
        return this.id_opdr;
    }

    public String getNombre(){
        return this.nom_opdr;
    }

    public void setNombre( String nom_opdr ){
        this.nom_opdr = nom_opdr;
    }

}