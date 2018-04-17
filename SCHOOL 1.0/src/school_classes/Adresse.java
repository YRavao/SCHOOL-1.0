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
public class Adresse {
    private int Rue;
    private String adresse;
    private String ville;
    private int codePostal;
    private String Pays;

    public Adresse() {
    }

    public Adresse(int Rue, String adresse, String ville, int codePostal, String Pays) {
        this.Rue = Rue;
        this.adresse = adresse;
        this.ville = ville;
        this.codePostal = codePostal;
        this.Pays = Pays;
    }

    public int getRue() {
        return Rue;
    }

    public void setRue(int Rue) {
        this.Rue = Rue;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    
    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    
    public int getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }

    public String getPays() {
        return Pays;
    }

    public void setPays(String Pays) {
        this.Pays = Pays;
    }

    @Override
    public String toString() {
        return "Adresse{" +Rue+ "Rue= " + adresse + ville +  + codePostal + ", Pays= " + Pays + '}';
    }
    
}