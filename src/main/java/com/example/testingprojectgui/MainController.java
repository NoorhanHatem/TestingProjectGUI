package com.example.testingprojectgui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void goToSignUpOrLogIn(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("SignUpOrLogIn.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void goToSignUp(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("SignUp.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void goToLogIn(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Log.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void goToDashboard(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("AccountDashboard.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void goToBalance(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Balance.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void goToBankStatement(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("BankStatement.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void goToTransactions(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Transactions.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void goToDOW(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("DepositOrWithdraw.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void goToFirst(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("First.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void goToStore(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Store.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}