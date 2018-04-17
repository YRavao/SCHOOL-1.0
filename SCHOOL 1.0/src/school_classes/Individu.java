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
public class Individu {
    private int idindividu;
    private String nom;
    private String prenom;
    private String adresse;
    private int telephone;
    private String mail;
    private String statut;
    private String identifiant;
    private String Mdp;
    private String classe;

    
    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }
    
    public String getMotDePasse() {
        return Mdp;
    }

    public void setMotDePasse(String motDePasse) {
        this.Mdp = motDePasse;
    }

   

    public Individu(int idindividu, String nom, String prenom, String adresse, int Tel, String Email, String classe) {
        this.idindividu = idindividu;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.telephone = Tel;
        this.mail = Email;
        this.classe = classe;
    }
    
    public Individu() {
    }

    public Individu(int idindividu, String nom, String prenom, int Tel, String Email) {
        this.idindividu = idindividu;
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = Tel;
        this.mail = Email;
        
    }
    
    

    public Individu(String nom, String prenom, String adresse, int Tel, String Email, String statut, String identifiant, String motDePasse) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.telephone = Tel;
        this.mail = Email;
        this.statut = statut;
        this.identifiant = identifiant;
        this.Mdp = motDePasse;
    }


    public int getIdindividu() {
        return idindividu;
    }
     
    public void setIdindividu(int idindividu) {
        this.idindividu = idindividu;
    }

    public String getNom() {
        return nom;
    }
   
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }
   
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }
    
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getNumeroTel() {
        return telephone;
    }
 
    public void setNumeroTel(int Tel) {
        this.telephone = Tel;
    }
   

    public String getStatut() {
        return statut;
    }
    
    public void setStatut(String statut) {
        this.statut = statut;
    }

    

    

    

      public String getEmail() {
        return mail;
    }
    
    public void setEmail(String Email) {
        this.mail = Email;
    }

  
     public String getIdentifiant() {
        return identifiant;
    }
    
    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

   
    public String getModDePasse() {
        return Mdp;
    }
    
    public void setModDePasse(String modDePasse) {
        this.Mdp = modDePasse;
    }
    
    
}
