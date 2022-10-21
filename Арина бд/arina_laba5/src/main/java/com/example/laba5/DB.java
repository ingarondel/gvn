package com.example.laba5;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.*;

public class DB {
    static ObservableList<Payment> listPayment;
    static ObservableList<Client> listClient;
    static ObservableList<Car> listCar;
    static String tablesNames;
    static String dataBaseName;
    static String searchString;

    public static Connection connection;
    public static Statement statement;
    public static ResultSet resultSet ;

    public static Connection connect() throws SQLException {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/"
                    + dataBaseName, "enga_makara", "4997");
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT TABLE_NAME FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_SCHEMA=\""
                    + dataBaseName + "\"AND TABLE_TYPE = \"BASE TABLE\"");
            tablesNames="";
            while (resultSet.next()) {
                tablesNames+=resultSet.getString("TABLE_NAME") + "\n";
            }
        } catch (Exception e) {
            e.printStackTrace();
            tablesNames = "Connection Error";
        }
        return null;
    }

    public static void select(String tableName) {
        try {
            try {
                resultSet = statement.executeQuery("select * from " +dataBaseName+"."+ tableName);
            } catch (Exception e) {
                resultSet=null;
            }
            if (tableName.equals("Payment"))
            {
                listPayment = FXCollections.observableArrayList();
                while (resultSet.next()) {
                    Payment newPayment = new Payment(
                            resultSet.getInt("payment_id"),
                            resultSet.getInt("cars_id"),
                            resultSet.getInt("clients_id"),
                            resultSet.getString("arrival_date"),
                            resultSet.getString("departure_date"),
                            resultSet.getFloat("price"));
                    listPayment.add(newPayment);
                }
            }
            else if (tableName.equals("Car")) {
                listCar = FXCollections.observableArrayList();
                while (resultSet.next()) {
                   Car newCar = new Car(
                            resultSet.getInt("car_id"),
                            resultSet.getString("car_brand"),
                            resultSet.getString("car_model"),
                            resultSet.getString("engine_number"),
                            resultSet.getInt("issue_year"),
                           resultSet.getString("inspection_date"),);
                    listCar.add(newCar);
                }
            }
            else if (tableName.equals("Client")) {
                listClient = FXCollections.observableArrayList();
                while (resultSet.next()) {
                    Client newClient = new Client(
                            resultSet.getInt("client_id"),
                            resultSet.getString("surname"),
                            resultSet.getString("name"),
                            resultSet.getString("patronym"),
                            resultSet.getString("address"),
                            resultSet.getString("current_account"),
                            resultSet.getInt("birth_year"));
                    listClient.add(newClient);
                }
            }
        } catch (Exception ex) {

            ex.printStackTrace();
        }
    }

    public static void search(String searchString, String tableName) {
        try {
            try {
                if (tableName.equals("Payment")) {
                    resultSet = statement.executeQuery("select * from " +dataBaseName+"."+ tableName
                            + " where arrival_date like '%" + searchString +"%' or departure_date like '%" + searchString +"%'");
                }
                else if (tableName.equals("Client")) {
                    resultSet = statement.executeQuery("select * from " +dataBaseName+"."+ tableName
                            + " where name like '%" + searchString +"%' or surname like '%" + searchString +"%'" +
                            " or patronym like '%" + searchString +"%'");
                }
                else if (tableName.equals("Car")) {
                    resultSet = statement.executeQuery("select * from " +dataBaseName+"."+ tableName
                            + " where car_brand like '%" + searchString +"%' or car_model'%"  + searchString +"%'");
                }
                else return;
            } catch (Exception e) {
                resultSet=null;
            }
            if (tableName.equals("Payment"))
            {
                listPayment = FXCollections.observableArrayList();
                while (resultSet.next()) {
                    Payment newPayment = new Payment(
                            resultSet.getInt("payment_id"),
                            resultSet.getInt("cars_id"),
                            resultSet.getInt("clients_id"),
                            resultSet.getString("arrival_date"),
                            resultSet.getString("departure_date"),
                            resultSet.getFloat("price"));
                    listPayment.add(newPayment);
                }
            }
            else if (tableName.equals("Car")) {
                listCar = FXCollections.observableArrayList();
                while (resultSet.next()) {
                    Car newCar = new Car(
                            resultSet.getInt("car_id"),
                            resultSet.getString("car_brand"),
                            resultSet.getString("car_model"),
                            resultSet.getString("engine_number"),
                            resultSet.getInt("issue_year"),
                            resultSet.getString("inspection_date"),);
                    listCar.add(newCar);
                }
            }
            else if (tableName.equals("Client")) {
                listClient = FXCollections.observableArrayList();
                while (resultSet.next()) {
                    Client newClient = new Client(
                            resultSet.getInt("client_id"),
                            resultSet.getString("surname"),
                            resultSet.getString("name"),
                            resultSet.getString("patronym"),
                            resultSet.getString("address"),
                            resultSet.getString("current_account"),
                            resultSet.getInt("birth_year"));
                    listClient.add(newClient);
                }
            }
        } catch (Exception ex) {

            ex.printStackTrace();
        }

    }

}