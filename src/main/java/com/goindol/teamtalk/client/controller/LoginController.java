package com.goindol.teamtalk.client.controller;

import com.goindol.teamtalk.HelloApplication;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController{

    @FXML public Pane pane;
    @FXML public TextField Id;
    @FXML public TextField Password;

    public void loginButtonAction() {
        String id = Id.getText();
        String password = Password.getText();
        boolean isLoginSuccess = false;

        //TODO : 디비랑 아이디 비번 비교

        if (isLoginSuccess) {
            try {
                Stage stage = (Stage) Id.getScene().getWindow();
                Parent root = FXMLLoader.load(HelloApplication.class.getResource("views/MainView.fxml"));
                stage.setScene(new Scene(root, 400, 600));
                stage.setTitle("Team Talk");
                stage.setOnCloseRequest(event -> {System.exit(0);});
                stage.setResizable(false);
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("warning");
            alert.setHeaderText("Log In Error");
            alert.setContentText("Wrong Id or Password");
            alert.show();


        }
    }

    public void signupButtonAction() {
        try {
            Stage stage = (Stage) Id.getScene().getWindow();
            Parent root = FXMLLoader.load(HelloApplication.class.getResource("views/SignUpView.fxml"));
            stage.setScene(new Scene(root, 400, 600));
            stage.setTitle("Team Talk");
            stage.setOnCloseRequest(event -> {System.exit(0);});
            stage.setResizable(false);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
