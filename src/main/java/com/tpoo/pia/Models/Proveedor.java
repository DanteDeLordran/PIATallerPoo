package com.tpoo.pia.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "proveedor" )
public class Proveedor {
    
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column( name = "id_proveedor",unique = true, nullable = false )
    private Integer id_prov;

    @Column( name = "nombre_proveedor" ,columnDefinition = "char(50)")
    private String nom_prov;

    public Proveedor(){}

    public Proveedor( String nom_prov ){
        this.nom_prov = nom_prov;
    }

    public Integer getId(){
        return this.id_prov;
    }

    public String getNombre(){
        return this.nom_prov;
    }

    public void setNombre( String nom_prov ){
        this.nom_prov = nom_prov;
    }

}
