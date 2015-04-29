package com.catastro.entities;
// Generated 27-abr-2015 10:16:11 by Hibernate Tools 3.6.0


import java.util.Date;

/**
 * Detallefichaindividual generated by hbm2java
 */
public class Detallefichaindividual  implements java.io.Serializable {


     private long iddetallefichaindividual;
     private Fichaindividual fichaindividual;
     private String nroresolexoneracion;
     private String nroboletpensionista;
     private Date fechainicioexoneracion;
     private Date fechavencimiento;
     private String codigouso;
     private String descripcionuso;
     private String estructuracion;
     private String zonificacion;
     private Double areaterrtitulo;
     private Double areaterrdeclarada;
     private Double areaterrverificada;
     private String nrohabitantes;
     private String nrofamilias;
     private String observaciones;
     private Integer clasificacionpredio;
     private Integer prediocatastraln;

    public Detallefichaindividual() {
    }

	
    public Detallefichaindividual(long iddetallefichaindividual) {
        this.iddetallefichaindividual = iddetallefichaindividual;
    }
    public Detallefichaindividual(long iddetallefichaindividual, Fichaindividual fichaindividual, String nroresolexoneracion, String nroboletpensionista, Date fechainicioexoneracion, Date fechavencimiento, String codigouso, String descripcionuso, String estructuracion, String zonificacion, Double areaterrtitulo, Double areaterrdeclarada, Double areaterrverificada, String nrohabitantes, String nrofamilias, String observaciones, Integer clasificacionpredio, Integer prediocatastraln) {
       this.iddetallefichaindividual = iddetallefichaindividual;
       this.fichaindividual = fichaindividual;
       this.nroresolexoneracion = nroresolexoneracion;
       this.nroboletpensionista = nroboletpensionista;
       this.fechainicioexoneracion = fechainicioexoneracion;
       this.fechavencimiento = fechavencimiento;
       this.codigouso = codigouso;
       this.descripcionuso = descripcionuso;
       this.estructuracion = estructuracion;
       this.zonificacion = zonificacion;
       this.areaterrtitulo = areaterrtitulo;
       this.areaterrdeclarada = areaterrdeclarada;
       this.areaterrverificada = areaterrverificada;
       this.nrohabitantes = nrohabitantes;
       this.nrofamilias = nrofamilias;
       this.observaciones = observaciones;
       this.clasificacionpredio = clasificacionpredio;
       this.prediocatastraln = prediocatastraln;
    }
   
    public long getIddetallefichaindividual() {
        return this.iddetallefichaindividual;
    }
    
    public void setIddetallefichaindividual(long iddetallefichaindividual) {
        this.iddetallefichaindividual = iddetallefichaindividual;
    }
    public Fichaindividual getFichaindividual() {
        return this.fichaindividual;
    }
    
    public void setFichaindividual(Fichaindividual fichaindividual) {
        this.fichaindividual = fichaindividual;
    }
    public String getNroresolexoneracion() {
        return this.nroresolexoneracion;
    }
    
    public void setNroresolexoneracion(String nroresolexoneracion) {
        this.nroresolexoneracion = nroresolexoneracion;
    }
    public String getNroboletpensionista() {
        return this.nroboletpensionista;
    }
    
    public void setNroboletpensionista(String nroboletpensionista) {
        this.nroboletpensionista = nroboletpensionista;
    }
    public Date getFechainicioexoneracion() {
        return this.fechainicioexoneracion;
    }
    
    public void setFechainicioexoneracion(Date fechainicioexoneracion) {
        this.fechainicioexoneracion = fechainicioexoneracion;
    }
    public Date getFechavencimiento() {
        return this.fechavencimiento;
    }
    
    public void setFechavencimiento(Date fechavencimiento) {
        this.fechavencimiento = fechavencimiento;
    }
    public String getCodigouso() {
        return this.codigouso;
    }
    
    public void setCodigouso(String codigouso) {
        this.codigouso = codigouso;
    }
    public String getDescripcionuso() {
        return this.descripcionuso;
    }
    
    public void setDescripcionuso(String descripcionuso) {
        this.descripcionuso = descripcionuso;
    }
    public String getEstructuracion() {
        return this.estructuracion;
    }
    
    public void setEstructuracion(String estructuracion) {
        this.estructuracion = estructuracion;
    }
    public String getZonificacion() {
        return this.zonificacion;
    }
    
    public void setZonificacion(String zonificacion) {
        this.zonificacion = zonificacion;
    }
    public Double getAreaterrtitulo() {
        return this.areaterrtitulo;
    }
    
    public void setAreaterrtitulo(Double areaterrtitulo) {
        this.areaterrtitulo = areaterrtitulo;
    }
    public Double getAreaterrdeclarada() {
        return this.areaterrdeclarada;
    }
    
    public void setAreaterrdeclarada(Double areaterrdeclarada) {
        this.areaterrdeclarada = areaterrdeclarada;
    }
    public Double getAreaterrverificada() {
        return this.areaterrverificada;
    }
    
    public void setAreaterrverificada(Double areaterrverificada) {
        this.areaterrverificada = areaterrverificada;
    }
    public String getNrohabitantes() {
        return this.nrohabitantes;
    }
    
    public void setNrohabitantes(String nrohabitantes) {
        this.nrohabitantes = nrohabitantes;
    }
    public String getNrofamilias() {
        return this.nrofamilias;
    }
    
    public void setNrofamilias(String nrofamilias) {
        this.nrofamilias = nrofamilias;
    }
    public String getObservaciones() {
        return this.observaciones;
    }
    
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    public Integer getClasificacionpredio() {
        return this.clasificacionpredio;
    }
    
    public void setClasificacionpredio(Integer clasificacionpredio) {
        this.clasificacionpredio = clasificacionpredio;
    }
    public Integer getPrediocatastraln() {
        return this.prediocatastraln;
    }
    
    public void setPrediocatastraln(Integer prediocatastraln) {
        this.prediocatastraln = prediocatastraln;
    }




}


