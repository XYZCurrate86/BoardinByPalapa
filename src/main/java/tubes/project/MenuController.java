package tubes.project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;


public class MenuController {
    @FXML
    private Button btnkos;

    @FXML
    private Button btnpenghuni;

    @FXML
    private Button btnpayment;

    @FXML
    private Button btnstock;

    @FXML
    private Button btnbalance;

    @FXML
    private Button btnhistory;

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void kostclicked(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Kost.fxml"));
        stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void penghuniclicked(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Penghuni.fxml"));
        stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void paymentclicked(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("payment.fxml"));
        stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void stockclicked(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Inventaris.fxml"));
        stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void balanceclicked(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("balance.fxml"));
        stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void historyclicked(ActionEvent actionEvent) {

    }

    public void clickLogout(ActionEvent event)throws IOException {
        root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
