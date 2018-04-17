/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school_classes;

/**
 *
 * @author Yolive
 */
public class Salle {
    private int idSalle;
    private String Nom;
    private boolean dispo;
    private int cap;

    public Salle() {
    }

    public Salle(int idSalle, String nom, boolean disponibilite, int capacite) {
        this.idSalle = idSalle;
        this.Nom = nom;
        this.dispo = disponibilite;
        this.cap = capacite;
    }

    public int getIdSalle() {
        return idSalle;
    }

    public void setIdSalle(int idSalle) {
        this.idSalle = idSalle;
    }

    
    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        this.Nom = nom;
    }

   
    public boolean Dispo() {
        return dispo;
    }

    public void setDispo(boolean disponibilite) {
        this.dispo = disponibilite;
    }

   
    public int getCapacite() {
        return cap;
    }

    public void setCapacite(int capacite) {
        this.cap = capacite;
    }
    
  }
