/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school_classes;

import java.util.Date;

/**
 *
 * @author Yolive
 */
public class Materiel {
    
    private int idMateriel;
    private String nomMateriel;
    private String marqueMateriel;
    private String refMateriel;
    private Etablissement etab;
    private Date dateAMateriel;
    private Date datePMateriel;
    private Date dateRemiseMateriel;
    private Date dateRenduMateriel;
  

    public Materiel() {
    }

    public Materiel(int idMateriel, String nomMateriel, String marqueMateriel, String refMateriel, Date dateAMateriel, Etablissement etab) {
        this.idMateriel = idMateriel;
        this.nomMateriel = nomMateriel;
        this.marqueMateriel = marqueMateriel;
        this.refMateriel = refMateriel;
        this.dateAMateriel = dateAMateriel;
        this.etab=etab;
    }

    public Etablissement getEtablissement() {
        return etab;
    }

    public void setEtablissement(Etablissement etab) {
        this.etab = etab;
    }

    public int getIdMateriel() {
        return idMateriel;
    }

    public void setIdMateriel(int idMateriel) {
        this.idMateriel = idMateriel;
    }

    
    public String getnomMateriel() {
        return nomMateriel;
    }

    public void setnomMateriel(String nMateriel) {
        this.nomMateriel = nMateriel;
    }

    public String getMarqueMateriel() {
        return marqueMateriel;
    }

    public void setMarqueMateriel(String marqueMateriel) {
        this.marqueMateriel = marqueMateriel;
    }

    public String getRefMateriel() {
        return refMateriel;
    }

    public void setRefMateriel(String refMateriel) {
        this.refMateriel = refMateriel;
    }

    public Date getDateAMateriel() {
        return dateAMateriel;
    }

    public void setDateAMateriel(Date dateAMateriel) {
        this.dateAMateriel = dateAMateriel;
    }

    public Date getDatePMateriel() {
        return datePMateriel;
    }

    public void setDatePMateriel(Date datePMateriel) {
        this.datePMateriel = datePMateriel;
    }

    public Date getDateRemiseMateriel() {
        return dateRemiseMateriel;
    }

    public void setDateRemiseMateriel(Date dateRemiseMateriel) {
        this.dateRemiseMateriel = dateRemiseMateriel;
    }

    public Date getDateRenduMateriel() {
        return dateRenduMateriel;
    }

    public void setDateRenduMateriel(Date dateRenduMateriel) {
        this.dateRenduMateriel = dateRenduMateriel;
    }
}