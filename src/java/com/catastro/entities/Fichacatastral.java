package com.catastro.entities;
// Generated 27-abr-2015 10:16:11 by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * Fichacatastral generated by hbm2java
 */
public class Fichacatastral  implements java.io.Serializable {


     private long idfichacatastral;
     private Titular titular;
     private String nroficha;
     private String cuc;
     private String codigohojacatastral;
     private String nroregistro;
     private String observaciones;
     private Set<Contenedor> contenedors = new HashSet<Contenedor>(0);
     private Set<Fichaindividual> fichaindividuals = new HashSet<Fichaindividual>(0);
     private Set<Certificadorficha> certificadorfichas = new HashSet<Certificadorficha>(0);

    public Fichacatastral() {
    }

	
    public Fichacatastral(long idfichacatastral) {
        this.idfichacatastral = idfichacatastral;
    }
    public Fichacatastral(long idfichacatastral, Titular titular, String nroficha, String cuc, String codigohojacatastral, String nroregistro, String observaciones, Set<Contenedor> contenedors, Set<Fichaindividual> fichaindividuals, Set<Certificadorficha> certificadorfichas) {
       this.idfichacatastral = idfichacatastral;
       this.titular = titular;
       this.nroficha = nroficha;
       this.cuc = cuc;
       this.codigohojacatastral = codigohojacatastral;
       this.nroregistro = nroregistro;
       this.observaciones = observaciones;
       this.contenedors = contenedors;
       this.fichaindividuals = fichaindividuals;
       this.certificadorfichas = certificadorfichas;
    }
   
    public long getIdfichacatastral() {
        return this.idfichacatastral;
    }
    
    public void setIdfichacatastral(long idfichacatastral) {
        this.idfichacatastral = idfichacatastral;
    }
    public Titular getTitular() {
        return this.titular;
    }
    
    public void setTitular(Titular titular) {
        this.titular = titular;
    }
    public String getNroficha() {
        return this.nroficha;
    }
    
    public void setNroficha(String nroficha) {
        this.nroficha = nroficha;
    }
    public String getCuc() {
        return this.cuc;
    }
    
    public void setCuc(String cuc) {
        this.cuc = cuc;
    }
    public String getCodigohojacatastral() {
        return this.codigohojacatastral;
    }
    
    public void setCodigohojacatastral(String codigohojacatastral) {
        this.codigohojacatastral = codigohojacatastral;
    }
    public String getNroregistro() {
        return this.nroregistro;
    }
    
    public void setNroregistro(String nroregistro) {
        this.nroregistro = nroregistro;
    }
    public String getObservaciones() {
        return this.observaciones;
    }
    
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    public Set<Contenedor> getContenedors() {
        return this.contenedors;
    }
    
    public void setContenedors(Set<Contenedor> contenedors) {
        this.contenedors = contenedors;
    }
    public Set<Fichaindividual> getFichaindividuals() {
        return this.fichaindividuals;
    }
    
    public void setFichaindividuals(Set<Fichaindividual> fichaindividuals) {
        this.fichaindividuals = fichaindividuals;
    }
    public Set<Certificadorficha> getCertificadorfichas() {
        return this.certificadorfichas;
    }
    
    public void setCertificadorfichas(Set<Certificadorficha> certificadorfichas) {
        this.certificadorfichas = certificadorfichas;
    }




}


