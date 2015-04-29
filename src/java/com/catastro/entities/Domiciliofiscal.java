package com.catastro.entities;
// Generated 27-abr-2015 10:16:11 by Hibernate Tools 3.6.0



/**
 * Domiciliofiscal generated by hbm2java
 */
public class Domiciliofiscal  implements java.io.Serializable {


     private long iddomiciliofiscal;
     private Ubigeo ubigeo;
     private Fichaindividual fichaindividual;
     private String telefono;
     private String anexo;
     private String fax;
     private String correoelectronico;
     private String codigovia;
     private String nromunicipal;
     private String nombreedificacion;
     private Integer nrointeriores;
     private String codigohu;
     private String nombrehabilitacionurbana;
     private String zonasectoretapa;
     private String manzana;
     private String lote;
     private String sublote;
     private Long tipovia;

    public Domiciliofiscal() {
    }

	
    public Domiciliofiscal(long iddomiciliofiscal) {
        this.iddomiciliofiscal = iddomiciliofiscal;
    }
    public Domiciliofiscal(long iddomiciliofiscal, Ubigeo ubigeo, Fichaindividual fichaindividual, String telefono, String anexo, String fax, String correoelectronico, String codigovia, String nromunicipal, String nombreedificacion, Integer nrointeriores, String codigohu, String nombrehabilitacionurbana, String zonasectoretapa, String manzana, String lote, String sublote, Long tipovia) {
       this.iddomiciliofiscal = iddomiciliofiscal;
       this.ubigeo = ubigeo;
       this.fichaindividual = fichaindividual;
       this.telefono = telefono;
       this.anexo = anexo;
       this.fax = fax;
       this.correoelectronico = correoelectronico;
       this.codigovia = codigovia;
       this.nromunicipal = nromunicipal;
       this.nombreedificacion = nombreedificacion;
       this.nrointeriores = nrointeriores;
       this.codigohu = codigohu;
       this.nombrehabilitacionurbana = nombrehabilitacionurbana;
       this.zonasectoretapa = zonasectoretapa;
       this.manzana = manzana;
       this.lote = lote;
       this.sublote = sublote;
       this.tipovia = tipovia;
    }
   
    public long getIddomiciliofiscal() {
        return this.iddomiciliofiscal;
    }
    
    public void setIddomiciliofiscal(long iddomiciliofiscal) {
        this.iddomiciliofiscal = iddomiciliofiscal;
    }
    public Ubigeo getUbigeo() {
        return this.ubigeo;
    }
    
    public void setUbigeo(Ubigeo ubigeo) {
        this.ubigeo = ubigeo;
    }
    public Fichaindividual getFichaindividual() {
        return this.fichaindividual;
    }
    
    public void setFichaindividual(Fichaindividual fichaindividual) {
        this.fichaindividual = fichaindividual;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getAnexo() {
        return this.anexo;
    }
    
    public void setAnexo(String anexo) {
        this.anexo = anexo;
    }
    public String getFax() {
        return this.fax;
    }
    
    public void setFax(String fax) {
        this.fax = fax;
    }
    public String getCorreoelectronico() {
        return this.correoelectronico;
    }
    
    public void setCorreoelectronico(String correoelectronico) {
        this.correoelectronico = correoelectronico;
    }
    public String getCodigovia() {
        return this.codigovia;
    }
    
    public void setCodigovia(String codigovia) {
        this.codigovia = codigovia;
    }
    public String getNromunicipal() {
        return this.nromunicipal;
    }
    
    public void setNromunicipal(String nromunicipal) {
        this.nromunicipal = nromunicipal;
    }
    public String getNombreedificacion() {
        return this.nombreedificacion;
    }
    
    public void setNombreedificacion(String nombreedificacion) {
        this.nombreedificacion = nombreedificacion;
    }
    public Integer getNrointeriores() {
        return this.nrointeriores;
    }
    
    public void setNrointeriores(Integer nrointeriores) {
        this.nrointeriores = nrointeriores;
    }
    public String getCodigohu() {
        return this.codigohu;
    }
    
    public void setCodigohu(String codigohu) {
        this.codigohu = codigohu;
    }
    public String getNombrehabilitacionurbana() {
        return this.nombrehabilitacionurbana;
    }
    
    public void setNombrehabilitacionurbana(String nombrehabilitacionurbana) {
        this.nombrehabilitacionurbana = nombrehabilitacionurbana;
    }
    public String getZonasectoretapa() {
        return this.zonasectoretapa;
    }
    
    public void setZonasectoretapa(String zonasectoretapa) {
        this.zonasectoretapa = zonasectoretapa;
    }
    public String getManzana() {
        return this.manzana;
    }
    
    public void setManzana(String manzana) {
        this.manzana = manzana;
    }
    public String getLote() {
        return this.lote;
    }
    
    public void setLote(String lote) {
        this.lote = lote;
    }
    public String getSublote() {
        return this.sublote;
    }
    
    public void setSublote(String sublote) {
        this.sublote = sublote;
    }
    public Long getTipovia() {
        return this.tipovia;
    }
    
    public void setTipovia(Long tipovia) {
        this.tipovia = tipovia;
    }




}


