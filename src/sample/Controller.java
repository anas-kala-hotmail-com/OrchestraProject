package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class Controller {
    @FXML
    private Text loginText;
    @FXML
    private TextField userField;
    @FXML
    private TextField passwordField;
    @FXML
    private Button loginBtn;

    public void checking(){
        String userName=userField.getText();
        String password=passwordField.getText();
        if(userName.equalsIgnoreCase("abcd") && password.equalsIgnoreCase("efgh")){
            loginText.setText("Login erfolgreich");
        }else{
            loginText.setText("Falsche eingaben");
            loginText.setFill(Color.RED);
        }
    }
}
