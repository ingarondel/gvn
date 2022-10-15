package com.example.demo;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB {
    static ObservableList<Education> listEducation;
    static ObservableList<Exams> listExams;
    static ObservableList<Entrant> listEntrant;
    static String tablesNames;
    static String dataBaseName;


    public static Connection connection;
    public static Statement statement;
    public static ResultSet resultSet;

    public static Connection connect() throws SQLException {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/"
                    + dataBaseName, "enga_makara", "4997");
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT TABLE_NAME FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_SCHEMA=\""
                    + dataBaseName + "\"AND TABLE_TYPE = \"BASE TABLE\"");
            tablesNames = "";
            while (resultSet.next()) {
                tablesNames += resultSet.getString("TABLE_NAME") + "\n";
            }
        } catch (Exception e) {
            e.printStackTrace();
            tablesNames = "Connection Error";
        }
        try {
            resultSet = statement.executeQuery("select * from" + dataBaseName + "." + tablesNames);
        } catch (Exception e) {
            resultSet = null;
        }
        return null;
    }

    public static void select(String tableName) {
        try {
            try {
                resultSet = statement.executeQuery("select * from " + dataBaseName + "." + tableName);
            } catch (Exception e) {
                resultSet = null;
            }
            if (tableName.equals("Education")) {
                listEducation = FXCollections.observableArrayList();
                while (resultSet.next()) {
                    Education newEducation = new Education(
                            resultSet.getInt("education_id"),
                            resultSet.getString("entrant_group"),
                            resultSet.getString("education_establishment"),
                            resultSet.getInt("reputation"),
                            resultSet.getFloat("average_mark"),
                            resultSet.getInt("Math_marks"),
                            resultSet.getInt("Physics_marks"),
                            resultSet.getInt("Ukraine_language_marks"));
                    listEducation.add(newEducation);
                }
            } else if (tableName.equals("customers")) {
                listEntrant = FXCollections.observableArrayList();
                while (resultSet.next()) {
                    Entrant newEntrant = new Entrant(
                            resultSet.getInt("entrant_id"),
                            resultSet.getInt("educations_id"),
                            resultSet.getString("address"),
                            resultSet.getInt("reg_number"),
                            resultSet.getString("birth_date"),
                            resultSet.getString("entrant_name"),
                            resultSet.getString("benefits"));
                    listEntrant.add(newEntrant);
                }
            } else if (tableName.equals("contract")) {
                listExams = FXCollections.observableArrayList();
                while (resultSet.next()) {
                    Exams newExams = new Exams(
                            resultSet.getInt("exams_id"),
                            resultSet.getInt("Math"),
                            resultSet.getInt("Physics"),
                            resultSet.getInt("Ukraine_language"),
                            resultSet.getString("exams_date"));
                    listExams.add(newExams);
                }
            }
        } catch (Exception ex) {

            ex.printStackTrace();
        }
    }
}
