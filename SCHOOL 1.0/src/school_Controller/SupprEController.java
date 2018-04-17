/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school_Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author Yolive
 */
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import school_classes.DBCon;


public class SupprEController implements Initializable {

    @FXML private Button confirmer;
    @FXML private Button cancel;
    @FXML private TextField Idsup;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML private void validerAjouter(ActionEvent event) {
        
          Connection conn = null;
        PreparedStatement ps = null;
        PreparedStatement ps2 = null;

        if (!Idsup.getText().equals("") ) {
            try {
                conn = DBCon.getConnection();

                String query = "DELETE FROM `individu` WHERE id ="+Idsup.getText()+"";

                ps2 = conn.prepareStatement(query);
                ps2.executeUpdate();

             

                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Success");
                alert.setHeaderText(null);
                alert.setContentText("Suppression réussi");

                alert.showAndWait();

            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } else {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error Dialog");
            alert.setHeaderText("Problème d'inscription");
            alert.setContentText("Veuillez entrer l'identifiant de l'étudiant à supprimer");

            alert.showAndWait();
        }

    }

        
       

    @FXML private void annulerSuppr(ActionEvent event) {
    }
    
}
