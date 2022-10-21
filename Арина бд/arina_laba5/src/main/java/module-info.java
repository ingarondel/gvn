module com.example.laba5 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.laba5 to javafx.fxml;
    exports com.example.laba5;
}