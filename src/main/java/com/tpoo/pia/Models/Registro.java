package com.tpoo.pia.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "registro" )
public class Registro {
    
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column( name = "id" )
    private Integer id_rgtro;

    @Column( name = "fecha" ,columnDefinition = "char(50)")
    private String fecha_rgtro;

    @Column( name = "remision" ,columnDefinition = "char(50)")
    private String rmsn_rgrto;

    @Column( name = "nombre_cliente" ,columnDefinition = "char(50)")
    private String nomcli_rgtro;

    @Column( name = "nombre_operador" ,columnDefinition = "char(50)")
    private String nomop_rgtro;

    @Column( name = "sku" ,columnDefinition = "char(50)")
    private String sku_rgtro;

    @Column( name = "lote" ,columnDefinition = "char(50)")
    private String lote_rgtro;

    @Column( name = "cajas" ,columnDefinition = "char(50)")
    private String cjs_rgtro;

    @Column( name = "kilos" ,columnDefinition = "char(50)")
    private String kilos_rgtro;

    @Column( name = "proveedor" ,columnDefinition = "char(50)")
    private String prov_rgtro;

    @Column( name = "precio_unitario" ,columnDefinition = "char(50)")
    private String puni_rgtro;

    @Column( name = "total_kilos" ,columnDefinition = "char(50)")
    private String totkg_rgtro;

    @Column( name = "monto_total" ,columnDefinition = "char(50)")
    private String mtotl_rgtro;

    public Integer getId(){
        return this.id_rgtro;
    }

    public String getFecha(){
        return this.fecha_rgtro;
    }

    public void setFecha( String fecha_rgtro ){
        this.fecha_rgtro = fecha_rgtro;
    }

    public String getRemision(){
        return this.rmsn_rgrto;
    }

    public void setRemision( String rmsn_rgtro ){
        this.rmsn_rgrto = rmsn_rgtro;
    }

    public String getNombreCliente(){
        return this.nomcli_rgtro;
    }

    public void setNombreCliente( String nomcli_rgtro ){
        this.nomcli_rgtro = nomcli_rgtro;
    }

    public String getNombreOperador(){
        return this.nomop_rgtro;
    }

    public void setNombreOperador( String nomop_rgtro ){
        this.nomop_rgtro = nomop_rgtro;
    }

    public String getSku(){
        return this.sku_rgtro;
    }

    public void setSku( String sku_rgtro ){
        this.sku_rgtro = sku_rgtro;
    }

    public String getLote(){
        return this.fecha_rgtro;
    }

    public void setLote( String lote_rgtro ){
        this.lote_rgtro = lote_rgtro;
    }

    public String getCajas(){
        return this.cjs_rgtro;
    }

    public void setCajas( String cjs_rgtro ){
        this.cjs_rgtro = cjs_rgtro;
    }

    public String getKilos(){
        return this.kilos_rgtro;
    }

    public void setKilos( String kilos_rgtro ){
        this.kilos_rgtro = kilos_rgtro;
    }

    public String getProveedor(){
        return this.prov_rgtro;
    }

    public void setProveedor( String prov_rgtro ){
        this.prov_rgtro = prov_rgtro;
    }

    public String getPrecioUnitario(){
        return this.puni_rgtro;
    }

    public void setPrecioUnitario( String puni_rgtro ){
        this.puni_rgtro = puni_rgtro;
    }

    public String getTotalKilos(){
        return this.totkg_rgtro;
    }

    public void setTotalKilos( String totkg_rgtro ){
        this.totkg_rgtro = totkg_rgtro;
    }

    public String getMontoTotal(){
        return this.mtotl_rgtro;
    }

    public void setMontoTotal( String mtotl_rgtro ){
        this.mtotl_rgtro = mtotl_rgtro;
    }

}
