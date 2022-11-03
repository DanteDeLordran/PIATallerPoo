package com.tpoo.pia.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table( name = "registro" )
public class Registro {
    
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column( name = "id" ,unique = true, nullable = false)
    private Integer id_rgtro;

    @Column( name = "fecha" ,columnDefinition = "char(50)")
    private String fecha_rgtro;

    @Column( name = "remision" ,columnDefinition = "char(50)")
    private String rmsn_rgrto;

    @Column( name = "nombre_cliente" ,columnDefinition = "char(50)")
    private String nomcli_rgtro;

    //FK Aqui con ID Operador
    @ManyToOne
    @JoinColumn( name = "operador",referencedColumnName = "id_operador" )
    private Operador opdr_rgtro;

    @Column( name = "sku" ,columnDefinition = "char(50)")
    private String sku_rgtro;

    @Column( name = "lote" ,columnDefinition = "char(50)")
    private String lote_rgtro;

    @Column( name = "cajas" ,columnDefinition = "char(50)")
    private String cjs_rgtro;

    @Column( name = "kilos" ,columnDefinition = "char(50)")
    private String kilos_rgtro;

    //FK aqui con ID Proveedor
    @ManyToOne
    @JoinColumn( name = "proovedor",referencedColumnName = "id_proveedor" )
    private Proveedor prov_rgtro;

    @Column( name = "precio_unitario" ,columnDefinition = "char(50)")
    private String puni_rgtro;

    @Column( name = "total_kilos" ,columnDefinition = "char(50)")
    private String totkg_rgtro;

    @Column( name = "monto_total" ,columnDefinition = "char(50)")
    private String mtotl_rgtro;

    public Registro(){}

    public Registro(Integer id_rgtro, String fecha_rgtro, String rmsn_rgrto, String nomcli_rgtro, Operador opdr_rgtro,
            String sku_rgtro, String lote_rgtro, String cjs_rgtro, String kilos_rgtro, Proveedor prov_rgtro,
            String puni_rgtro, String totkg_rgtro, String mtotl_rgtro) {
        this.id_rgtro = id_rgtro;
        this.fecha_rgtro = fecha_rgtro;
        this.rmsn_rgrto = rmsn_rgrto;
        this.nomcli_rgtro = nomcli_rgtro;
        this.opdr_rgtro = opdr_rgtro;
        this.sku_rgtro = sku_rgtro;
        this.lote_rgtro = lote_rgtro;
        this.cjs_rgtro = cjs_rgtro;
        this.kilos_rgtro = kilos_rgtro;
        this.prov_rgtro = prov_rgtro;
        this.puni_rgtro = puni_rgtro;
        this.totkg_rgtro = totkg_rgtro;
        this.mtotl_rgtro = mtotl_rgtro;
    }

}
