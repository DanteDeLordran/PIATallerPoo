package com.tpoo.pia.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "registro")
public class Registro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_registro", unique = true, nullable = false)
    private Integer id_rgtro;

    @Column(name = "fecha", columnDefinition = "char(50)" , nullable = false)
    private String fecha_rgtro;

    @Column(name = "remision", columnDefinition = "char(50)", nullable = false)
    private String rmsn_rgrto;

    @Column(name = "nombre_cliente", columnDefinition = "char(50)", nullable = false)
    private String nomcli_rgtro;

    // FK Aqui con ID Operador
    // @ManyToOne(fetch = FetchType.LAZY)
    // @JoinColumn(name = "operador", referencedColumnName = "id_operador")
    // private Operador opdr_rgtro;

    @Column(name = "sku", columnDefinition = "char(50)", nullable = false)
    private String sku_rgtro;

    @Column(name = "lote", columnDefinition = "char(50)", nullable = false)
    private String lote_rgtro;

    @Column(name = "cajas", columnDefinition = "char(50)", nullable = false)
    private String cjs_rgtro;

    @Column(name = "kilos", columnDefinition = "char(50)", nullable = false)
    private String kilos_rgtro;

    // FK aqui con ID Proveedor
    // @ManyToOne(fetch = FetchType.LAZY)
    // @JoinColumn(name = "proovedor", referencedColumnName = "id_proveedor")
    // private Proveedor prov_rgtro;

    @Column(name = "precio_unitario", columnDefinition = "char(50)", nullable = false)
    private String puni_rgtro;

    @Column(name = "total_kilos", columnDefinition = "char(50)", nullable = false)
    private String totkg_rgtro;

    @Column(name = "monto_total", columnDefinition = "char(50)", nullable = false)
    private String mtotl_rgtro;

    public Registro() {
    }

    public Registro(Integer id_rgtro, String fecha_rgtro, String rmsn_rgrto, String nomcli_rgtro,
            String sku_rgtro, String lote_rgtro, String cjs_rgtro, String kilos_rgtro,
            String puni_rgtro, String totkg_rgtro, String mtotl_rgtro) {
        this.id_rgtro = id_rgtro;
        this.fecha_rgtro = fecha_rgtro;
        this.rmsn_rgrto = rmsn_rgrto;
        this.nomcli_rgtro = nomcli_rgtro;
        //this.opdr_rgtro = opdr_rgtro;
        this.sku_rgtro = sku_rgtro;
        this.lote_rgtro = lote_rgtro;
        this.cjs_rgtro = cjs_rgtro;
        this.kilos_rgtro = kilos_rgtro;
        //this.prov_rgtro = prov_rgtro;
        this.puni_rgtro = puni_rgtro;
        this.totkg_rgtro = totkg_rgtro;
        this.mtotl_rgtro = mtotl_rgtro;
    }

    public Integer getId_rgtro() {
        return id_rgtro;
    }

    public String getFecha_rgtro() {
        return fecha_rgtro;
    }

    public void setFecha_rgtro(String fecha_rgtro) {
        this.fecha_rgtro = fecha_rgtro;
    }

    public String getRmsn_rgrto() {
        return rmsn_rgrto;
    }

    public void setRmsn_rgrto(String rmsn_rgrto) {
        this.rmsn_rgrto = rmsn_rgrto;
    }

    public String getNomcli_rgtro() {
        return nomcli_rgtro;
    }

    public void setNomcli_rgtro(String nomcli_rgtro) {
        this.nomcli_rgtro = nomcli_rgtro;
    }

    // public Operador getOpdr_rgtro() {
    //     return opdr_rgtro;
    // }

    // public void setOpdr_rgtro(Operador opdr_rgtro) {
    //     this.opdr_rgtro = opdr_rgtro;
    // }

    public String getSku_rgtro() {
        return sku_rgtro;
    }

    public void setSku_rgtro(String sku_rgtro) {
        this.sku_rgtro = sku_rgtro;
    }

    public String getLote_rgtro() {
        return lote_rgtro;
    }

    public void setLote_rgtro(String lote_rgtro) {
        this.lote_rgtro = lote_rgtro;
    }

    public String getCjs_rgtro() {
        return cjs_rgtro;
    }

    public void setCjs_rgtro(String cjs_rgtro) {
        this.cjs_rgtro = cjs_rgtro;
    }

    public String getKilos_rgtro() {
        return kilos_rgtro;
    }

    public void setKilos_rgtro(String kilos_rgtro) {
        this.kilos_rgtro = kilos_rgtro;
    }

    // public Proveedor getProv_rgtro() {
    //     return prov_rgtro;
    // }

    // public void setProv_rgtro(Proveedor prov_rgtro) {
    //     this.prov_rgtro = prov_rgtro;
    // }

    public String getPuni_rgtro() {
        return puni_rgtro;
    }

    public void setPuni_rgtro(String puni_rgtro) {
        this.puni_rgtro = puni_rgtro;
    }

    public String getTotkg_rgtro() {
        return totkg_rgtro;
    }

    public void setTotkg_rgtro(String totkg_rgtro) {
        this.totkg_rgtro = totkg_rgtro;
    }

    public String getMtotl_rgtro() {
        return mtotl_rgtro;
    }

    public void setMtotl_rgtro(String mtotl_rgtro) {
        this.mtotl_rgtro = mtotl_rgtro;
    }

}
