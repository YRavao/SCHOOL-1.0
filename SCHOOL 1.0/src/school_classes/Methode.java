/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school_classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Yolive
 */
public class Methode implements Interface{
    
        ArrayList<Directeur> ListD  = new ArrayList<Directeur>();
	ArrayList<Secretaire> ListS = new ArrayList<Secretaire>();
	ArrayList<Etudiant> ListE   = new ArrayList<Etudiant>();
	ArrayList<Classe> ListC     = new ArrayList<Classe>();
	ArrayList<Groupe> ListG     = new ArrayList<Groupe>();
        ArrayList<Materiel> ListM   = new ArrayList<Materiel>();
        ArrayList<Etablissement> ListEtab= new ArrayList <Etablissement>();
        
    @Override
    public void ajoutIndividu(Individu i) {
		Connection c = DBCon.getConnection();
		try {
			PreparedStatement  s = c.prepareStatement("INSERT INTO `individu`(`nom`,`prenom`,`adresse`,`telephone`,`mail`,`statut`,`identifiant`,`Mdp`) "
					+ "VALUES (?,?,?,?,?,?,?,?)");
			s.setString(1, i.getNom());
                        s.setString(2, i.getPrenom());
                        s.setString(3, i.toString());
                        s.setInt(4, i.getNumeroTel());
                        s.setString(5, i.getEmail());
                        s.setString(6, i.getStatut());
                        s.setString(7, i.getIdentifiant());
                        s.setString(8, i.getModDePasse());
			s.executeUpdate();
			s.close();
	
		} catch (SQLException e) {
		}
		
	}

    @Override
    public void supprimerIndividu(int idIndividu) {
        Connection c = DBCon.getConnection();
            try {
		PreparedStatement  stat = c.prepareStatement("DELETE FROM individu where id=? ;");
                stat.setInt(1, idIndividu);
                stat.executeUpdate();
            } catch (SQLException e) {
            }
    }
    
    

    @Override
    public void addMateriel(Materiel mat) {
         
		Connection c = DBCon.getConnection();
		try {
			PreparedStatement  s = c.prepareStatement("INSERT INTO `materiel`(`libel`,`marque`,`refer`,`dateAcqu`,`datePerte`,`dateRemise`,`dateRestit`) "
					+ "VALUES (?,?,?,?,?,?,?)");
			s.setString(1, mat.getnomMateriel());
                        s.setString(2, mat.getMarqueMateriel());
                        s.setString(3, mat.getRefMateriel());
                        s.setDate(4, (java.sql.Date) (Date) mat.getDateAMateriel());
                        s.setDate(5, (java.sql.Date) (Date) mat.getDatePMateriel());
                        s.setDate(6, (java.sql.Date) (Date) mat.getDateRemiseMateriel());
                        s.setDate(7, (java.sql.Date) (Date) mat.getDateRenduMateriel());
			s.executeUpdate();
			s.close();
	
		} catch (SQLException e) {
		}
    }

    @Override
    public void supprimerMateriel(int idMat) {
    Connection cnx = DBCon.getConnection();
            try {
		PreparedStatement  stat = cnx.prepareStatement("DELETE FROM materiel where id=? ;");
                stat.setInt(1, idMat);
                stat.executeUpdate();
            } catch (SQLException e) {
            }   
    }

    @Override
    public void ajoutEtablissement(Etablissement e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void supprimerEtablissement(Etablissement e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editerIndividu(Individu i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editerClasse(Classe c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Directeur> listeDirecteur(Directeur d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Secretaire> listeSecretaire(Secretaire s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Etudiant> listeEtudiant(Etudiant e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Classe> listeClasse(Classe c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Groupe> listeGroupe(Groupe g) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Materiel> listeMateriel(Materiel m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Etablissement> listeEtablissement(Etablissement e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    

}