package com.catastro.entities;
// Generated 27-abr-2015 10:16:11 by Hibernate Tools 3.6.0


import java.util.Date;

/**
 * Obrascomplotrasinstalaciones generated by hbm2java
 */
public class Obrascomplotrasinstalaciones  implements java.io.Serializable {


     private long idobrascomplotasinstalaciones;
     private Fichaindividual fichaindividual;
     private Integer codigo;
     private String descripcion;
     private Date fechacont;
     private Double dimveriflargo;
     private Double dimverifancho;
     private Double dimverifalto;
     private Double dimverifproductototal;
     private Double uca;

    public Obrascomplotrasinstalaciones() {
    }

	
    public Obrascomplotrasinstalaciones(long idobrascomplotasinstalaciones) {
        this.idobrascomplotasinstalaciones = idobrascomplotasinstalaciones;
    }
    public Obrascomplotrasinstalaciones(long idobrascomplotasinstalaciones, Fichaindividual fichaindividual, Integer codigo, String descripcion, Date fechacont, Double dimveriflargo, Double dimverifancho, Double dimverifalto, Double dimverifproductototal, Double uca) {
       this.idobrascomplotasinstalaciones = idobrascomplotasinstalaciones;
       this.fichaindividual = fichaindividual;
       this.codigo = codigo;
       this.descripcion = descripcion;
       this.fechacont = fechacont;
       this.dimveriflargo = dimveriflargo;
       this.dimverifancho = dimverifancho;
       this.dimverifalto = dimverifalto;
       this.dimverifproductototal = dimverifproductototal;
       this.uca = uca;
    }
   
    public long getIdobrascomplotasinstalaciones() {
        return this.idobrascomplotasinstalaciones;
    }
    
    public void setIdobrascomplotasinstalaciones(long idobrascomplotasinstalaciones) {
        this.idobrascomplotasinstalaciones = idobrascomplotasinstalaciones;
    }
    public Fichaindividual getFichaindividual() {
        return this.fichaindividual;
    }
    
    public void setFichaindividual(Fichaindividual fichaindividual) {
        this.fichaindividual = fichaindividual;
    }
    public Integer getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Date getFechacont() {
        return this.fechacont;
    }
    
    public void setFechacont(Date fechacont) {
        this.fechacont = fechacont;
    }
    public Double getDimveriflargo() {
        return this.dimveriflargo;
    }
    
    public void setDimveriflargo(Double dimveriflargo) {
        this.dimveriflargo = dimveriflargo;
    }
    public Double getDimverifancho() {
        return this.dimverifancho;
    }
    
    public void setDimverifancho(Double dimverifancho) {
        this.dimverifancho = dimverifancho;
    }
    public Double getDimverifalto() {
        return this.dimverifalto;
    }
    
    public void setDimverifalto(Double dimverifalto) {
        this.dimverifalto = dimverifalto;
    }
    public Double getDimverifproductototal() {
        return this.dimverifproductototal;
    }
    
    public void setDimverifproductototal(Double dimverifproductototal) {
        this.dimverifproductototal = dimverifproductototal;
    }
    public Double getUca() {
        return this.uca;
    }
    
    public void setUca(Double uca) {
        this.uca = uca;
    }




}


