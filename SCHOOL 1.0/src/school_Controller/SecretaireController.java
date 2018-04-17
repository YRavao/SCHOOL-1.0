/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school_Controller;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;

/**
 * FXML Controller class
 *
 * @author Yolive
 */
public class SecretaireController implements Initializable {

      @FXML
    private Button boutonclasse;

    @FXML
    private Button boutonetudiant;

    @FXML
    private Button boutonenseignant;

    @FXML
    private Tab classe;

    @FXML
    private Tab etudiant;

    @FXML
    private Tab enseignant;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}