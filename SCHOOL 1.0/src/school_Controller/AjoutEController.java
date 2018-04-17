/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school_Controller;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;
import static javafx.application.Platform.exit;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import school_classes.DBCon;
/**
 * FXML Controller class
 *
 * @author Yolive
 */
public class AjoutEController implements Initializable {

    
    
    
    @FXML private Button add;
    @FXML private Button annuler;
    
    
    @FXML private TextField addNom;
    @FXML private TextField addPrenom;
    @FXML private TextField addMail;
    @FXML private TextField addNumero;
    @FXML private TextField addClasse;
    @FXML private TextField addAdresse;
    
      @FXML
    private ComboBox<String> statut;

    @FXML
    
    private TextField addId;
     @FXML private AnchorPane Window;

    @FXML
    private TextField addMdp;


    
    @FXML void annulerAjout(ActionEvent event) {
        
        

    }
    @FXML
    void validerAjouter(ActionEvent event) {
        
        Connection conn = null;
        PreparedStatement ps = null;
        PreparedStatement ps2 = null;

        if (!addNom.getText().equals("") && !addPrenom.getText().equals("") && !addMail.getText().equals("")
                && !addNumero.getText().equals("") && !addClasse.getText().equals("") && !addAdresse.getText().equals("") && !statut.getValue().equals("") && !addId.getText().equals("") && !addMdp.getText().equals("")) {
            try {
                conn = DBCon.getConnection();

                String query = "INSERT INTO individu(nom, prenom, adresse, telephone, mail, classe , statut , identifiant, Mdp) "
                        + "VALUES (?,?,?,?,?,?,?,?,?)";

                ps2 = conn.prepareStatement(query);

                ps2.setString(1, addNom.getText());
                ps2.setString(2, addPrenom.getText());
                ps2.setString(3, addAdresse.getText());
                ps2.setString(4, addNumero.getText());
                ps2.setString(5, addMail.getText());
                ps2.setString(6, addClasse.getText());                       
                ps2.setString(7, statut.getValue());
                ps2.setString(8, addId.getText());
                ps2.setString(9, addMdp.getText());

                ps2.executeUpdate();

                addNom.clear();
                addPrenom.clear();
                addAdresse.clear();
                addNumero.clear();
                addMail.clear();
                addId.clear();
                addMdp.clear();
                statut.setValue("Statut");

                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Succes");
                alert.setHeaderText(null);
                alert.setContentText("Inscription réussi");

                alert.showAndWait();
                

            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } else {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error Dialog");
            alert.setHeaderText("Problème d'inscription");
            alert.setContentText("Veuillez remplir tous les champss");

            alert.showAndWait();
        }
        
       

    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList<String> stat= FXCollections.observableArrayList("Administrateur","Directeur","Secretaire","Enseignant","Etudiant");
            statut.setItems(stat);
    }    
    
}