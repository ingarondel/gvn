package com.example.demo;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;



public class HelloController implements Initializable {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<Exams, Integer> Math;

    @FXML
    private TableColumn<Education, Integer> Math_marks;

    @FXML
    private TableColumn<Exams, Integer> Physics;

    @FXML
    private TableColumn<Education, Integer> Physics_marks;

    @FXML
    private TableColumn<Exams, Integer> Ukraine_language;

    @FXML
    private TableColumn<Education, Integer> Ukraine_language_marks;

    @FXML
    private TableColumn<Entrant, String> address;

    @FXML
    private TableColumn<Education, Float> average_mark;

    @FXML
    private TableColumn<Entrant, String> benefits;

    @FXML
    private TableColumn<Entrant, String> birth_date;

    @FXML
    private Button btnConnection;

    @FXML
    private Button btnSELECT;

    @FXML
    private TableColumn<Education, String> education_establishment;

    @FXML
    private TableColumn<Education, Integer> education_id;

    @FXML
    private TableColumn<Entrant, Integer> educations_id;

    @FXML
    private TableColumn<Education, String> entrant_group;

    @FXML
    private TableColumn<Entrant, Integer> entrant_id;

    @FXML
    private TableColumn<Entrant, String> entrant_name;

    @FXML
    private TableColumn<Exams, String> exams_date;

    @FXML
    private TableColumn<Exams, Integer> exams_id;

    @FXML
    private TableColumn<Entrant, Integer> examss_id;

    @FXML
    private TableColumn<Entrant, Integer> reg_number;

    @FXML
    private TableColumn<Education, Float> reputation;

    @FXML
    private TableView<Education> tblEducation;

    @FXML
    private TableView<Entrant> tblEntrant;

    @FXML
    private TableView<Exams> tblExams;

    @FXML
    private TextField txtDatabase;

    @FXML
    private TextArea txtLIST;

    @FXML
    private TextField txttablename;

    @FXML
    void onConnectButtonClick(ActionEvent event) {

    }


    @FXML
    void initialize() {
        assert Math != null : "fx:id=\"Math\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert Math_marks != null : "fx:id=\"Math_marks\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert Physics != null : "fx:id=\"Physics\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert Physics_marks != null : "fx:id=\"Physics_marks\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert Ukraine_language != null : "fx:id=\"Ukraine_language\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert Ukraine_language_marks != null : "fx:id=\"Ukraine_language_marks\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert address != null : "fx:id=\"address\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert average_mark != null : "fx:id=\"average_mark\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert benefits != null : "fx:id=\"benefits\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert birth_date != null : "fx:id=\"birth_date\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert btnConnection != null : "fx:id=\"btnConnection\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert btnSELECT != null : "fx:id=\"btnSELECT\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert education_establishment != null : "fx:id=\"education_establishment\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert education_id != null : "fx:id=\"education_id\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert educations_id != null : "fx:id=\"educations_id\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert entrant_group != null : "fx:id=\"entrant_group\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert entrant_id != null : "fx:id=\"entrant_id\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert entrant_name != null : "fx:id=\"entrant_name\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert exams_date != null : "fx:id=\"exams_date\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert exams_id != null : "fx:id=\"exams_id\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert examss_id != null : "fx:id=\"examss_id\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert reg_number != null : "fx:id=\"reg_number\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert reputation != null : "fx:id=\"reputation\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert tblEducation != null : "fx:id=\"tblEducation\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert tblEntrant != null : "fx:id=\"tblEntrant\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert tblExams != null : "fx:id=\"tblExams\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert txtDatabase != null : "fx:id=\"txtDatabase\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert txtLIST != null : "fx:id=\"txtLIST\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert txttablename != null : "fx:id=\"txttablename\" was not injected: check your FXML file 'hello-view.fxml'.";

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        entrant_id.setCellValueFactory(new PropertyValueFactory<Entrant, Integer>("entrant_id"));
        educations_id.setCellValueFactory(new PropertyValueFactory<Entrant, Integer>("educations_id"));
        examss_id.setCellValueFactory(new PropertyValueFactory<Entrant, Integer>("examss_id"));
        address.setCellValueFactory(new PropertyValueFactory<Entrant, String>("address"));
        reg_number.setCellValueFactory(new PropertyValueFactory<Entrant, Integer>("reg_number"));
        birth_date.setCellValueFactory(new PropertyValueFactory<Entrant, String>("birth_date"));
        entrant_name.setCellValueFactory(new PropertyValueFactory<Entrant, String>("entrant_name"));
        benefits.setCellValueFactory(new PropertyValueFactory<Entrant, String>("benefits"));
        education_id.setCellValueFactory(new PropertyValueFactory<Education, Integer>("education_id"));
        entrant_group.setCellValueFactory(new PropertyValueFactory<Education, String>("entrant_group"));
        education_establishment.setCellValueFactory(new PropertyValueFactory<Education, String>("education_establishment"));
        reputation.setCellValueFactory(new PropertyValueFactory<Education, Float>("reputation"));
        average_mark.setCellValueFactory(new PropertyValueFactory<Education, Float>("average_mark"));
        Math_marks.setCellValueFactory(new PropertyValueFactory<Education, Integer>("Math_marks"));
        Physics_marks.setCellValueFactory(new PropertyValueFactory<Education, Integer>("Physics_marks"));
        Ukraine_language_marks.setCellValueFactory(new PropertyValueFactory<Education, Integer>("Ukraine_language_marks"));
        exams_id.setCellValueFactory(new PropertyValueFactory<Exams, Integer>("exams_id"));
        Math.setCellValueFactory(new PropertyValueFactory<Exams, Integer>("Math"));
        exams_id.setCellValueFactory(new PropertyValueFactory<Exams, Integer>("Physics"));
        exams_id.setCellValueFactory(new PropertyValueFactory<Exams, Integer>("Ukraine_language"));
        exams_date.setCellValueFactory(new PropertyValueFactory<Exams, String>("exams_date"));
    }
    @FXML
    private void onConnectButtonClick() throws SQLException {
        tblEntrant.setVisible(false);
        tblEducation.setVisible(false);
        tblExams.setVisible(false);
        DB.dataBaseName = txtDatabase.getText();
        DB.connect();
        txtLIST.clear();
        txtLIST.setText(DB.tablesNames);
    }
    public void onSelectButtonClick(ActionEvent actionEvent) throws SQLException {
        String tableName = txttablename.getText();
        DB.select(tableName);
        if (tableName.equals("Exams")) {
            tblExams.setItems(DB.listExams);
            tblExams.setVisible(true);
            tblEducation.setVisible(false);
           tblEntrant.setVisible(false);
        } else if (tableName.equals("Education")) {
            tblEducation.setItems(DB.listEducation);
            tblEducation.setVisible(true);
            tblEntrant.setVisible(false);
            tblExams.setVisible(false);
        } else if (tableName.equals("Entrant")) {
            tblEntrant.setItems(DB.listEntrant);
            tblEntrant.setVisible(true);
            tblExams.setVisible(false);
            tblEducation.setVisible(false);
        } else {
            txtLIST.setText("Connection Error");
            tblEntrant.setVisible(false);
            tblExams.setVisible(false);
            tblEducation.setVisible(false);
        }
    }

}