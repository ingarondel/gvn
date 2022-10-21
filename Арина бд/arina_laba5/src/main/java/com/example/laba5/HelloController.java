package com.example.laba5;
package com.example.laba5;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<Client, String> address;

    @FXML
    private TableColumn<Payment, String> arrival_date;

    @FXML
    private TableColumn<Client, String> birth_year;

    @FXML
    private Button btnConnection;

    @FXML
    private Button btnSELECT;

    @FXML
    private TableColumn<Car, String> car_brand;

    @FXML
    private TableColumn<Car, Integer> car_id;

    @FXML
    private TableColumn<Car, String> car_model;

    @FXML
    private TableColumn<Payment, Integer> cars_id;

    @FXML
    private TableColumn<Client, Integer> client_id;

    @FXML
    private TableColumn<Payment, Integer> clients_id;

    @FXML
    private TableColumn<Client, String> current_account;

    @FXML
    private TableColumn<Payment, String> departure_date;

    @FXML
    private TableColumn<Car, String> engine_number;

    @FXML
    private TableColumn<Car, String> inspection_date;

    @FXML
    private TableColumn<Car, Integer> issue_year;

    @FXML
    private TableColumn<Client, String> name;

    @FXML
    private TableColumn<Client, String> patronym;

    @FXML
    private TableColumn<Payment, Integer> payment_id;

    @FXML
    private TableColumn<Payment, Float> price;

    @FXML
    private TableColumn<Client, String> surname;

    @FXML
    private TableView<Car> tblCar;

    @FXML
    private TableView<Client> tblClient;

    @FXML
    private TableView<Payment> tblPayment;

    @FXML
    private TextField txtDatabase;

    @FXML
    private TextArea txtLIST;

    @FXML
    private TextField txtSeach;

    @FXML
    private TextField txttablename;

    @FXML
    void onConnectButtonClick(ActionEvent event) {

    }

    @FXML
    void onSelectButtonClick(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert address != null : "fx:id=\"address\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert arrival_date != null : "fx:id=\"arrival_date\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert birth_year != null : "fx:id=\"birth_year\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert btnConnection != null : "fx:id=\"btnConnection\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert btnSELECT != null : "fx:id=\"btnSELECT\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert car_brand != null : "fx:id=\"car_brand\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert car_id != null : "fx:id=\"car_id\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert car_model != null : "fx:id=\"car_model\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert cars_id != null : "fx:id=\"cars_id\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert client_id != null : "fx:id=\"client_id\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert clients_id != null : "fx:id=\"clients_id\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert current_account != null : "fx:id=\"current_account\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert departure_date != null : "fx:id=\"departure_date\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert engine_number != null : "fx:id=\"engine_number\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert inspection_date != null : "fx:id=\"inspection_date\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert issue_year != null : "fx:id=\"issue_year\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert name != null : "fx:id=\"name\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert patronym != null : "fx:id=\"patronym\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert payment_id != null : "fx:id=\"payment_id\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert price != null : "fx:id=\"price\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert surname != null : "fx:id=\"surname\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert tblCar != null : "fx:id=\"tblCar\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert tblClient != null : "fx:id=\"tblClient\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert tblPayment != null : "fx:id=\"tblPayment\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert txtDatabase != null : "fx:id=\"txtDatabase\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert txtLIST != null : "fx:id=\"txtLIST\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert txtSeach != null : "fx:id=\"txtSeach\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert txttablename != null : "fx:id=\"txttablename\" was not injected: check your FXML file 'hello-view.fxml'.";

    }




    @FXML
    private void onConnectButtonClick() throws SQLException {
        tblPayment.setVisible(false);
        tblCar.setVisible(false);
        tblClient.setVisible(false);
        DB.dataBaseName = txtDatabase.getText();
        DB.connect();
        txtLIST.clear();
        txtLIST.setText(DB.tablesNames);
    }
    public void onSelectButtonClick(ActionEvent actionEvent) throws SQLException {
        String tableName = txttablename.getText();
        DB.select(tableName);
        if (tableName.equals("Client")) {
            tblClient.setItems(DB.listClient);
            tblClient.setVisible(true);
            tblCar.setVisible(false);
            tblPayment.setVisible(false);
        } else if (tableName.equals("Car")) {
            tblCar.setItems(DB.listCar);
            tblCar.setVisible(true);
            tblClient.setVisible(false);
            tblPayment.setVisible(false);
        } else if (tableName.equals("Payment")) {
            tblPayment.setItems(DB.listPayment);
            tblPayment.setVisible(true);
            tblCar.setVisible(false);
            tblClient.setVisible(false);
        } else {
            txtLIST.setText("Connection Error");
            tblClient.setVisible(false);
            tblCar.setVisible(false);
            tblPayment.setVisible(false);
        }
    }
    public void startSearch(){
        String tableName = txttablename.getText();
        DB.search(txtSeach.getText(), txtLIST.getText());
        if (tableName.equals("Client")){
            tblClient.setItems(DB.listClient);
        } else if (tableName.equals("Car")){
            tblCar.setItems(DB.listCar);
        }else if (tableName.equals("Payment")){
            tblPayment.setItems(DB.listPayment);
        }
        else{
            txtLIST.setText("ConnectionError");
        }
    }

}