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
public class Enseignant extends Individu{
    
    private String Cours;

    
    public String getCours() {
        return Cours;
    }

    public void setCours(String cours) {
        this.Cours = cours;
    }

    public Enseignant(String cours, int idindividu, String nom, String prenom, int numeroTel, String email) {
        super(idindividu, nom, prenom, numeroTel, email);
        this.Cours = cours;
    }
    
    public Enseignant() {
    }

    public Enseignant(String nom, String prenom, String adresse, int telephone, String mail, String statut, String identifiant, String motDePasse) {
        super(nom, prenom, adresse, telephone, mail, statut, identifiant, motDePasse);
    }
    
}
