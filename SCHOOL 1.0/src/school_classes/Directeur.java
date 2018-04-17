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
public class Directeur extends Individu{
    private String nEtablissement;

    public Directeur() {
    }

    public Directeur(String nomEtablissement, int idindividu, String nom, String prenom, int telephone, String mail) {
        super(idindividu, nom, prenom, telephone,mail);
        this.nEtablissement = nomEtablissement;
    }

    
    public String getNomEtablissement() {
        return nEtablissement;
    }

    
    public void setNomEtablissement(String nomEtablissement) {
        this.nEtablissement = nomEtablissement;
    }
    
    
    
}