package com.example.laba5;

public class Car {
    private int car_id;
    private String car_brand;
    private String car_model;
    private String engine_number;
    private int issue_year;
    private String inspection_date;

    public Car(int car_id, String car_brand, String car_model, String engine_number, int issue_year, String inspection_date) {
        this.car_id =car_id;
        this.car_brand=car_brand;
        this.car_model =car_model;
        this.engine_number =engine_number;
        this.issue_year =issue_year;
        this.inspection_date =inspection_date;

    }
    public int getCar_id() {
        return car_id;
    }

    public String getCar_brand() {
        return car_brand;
    }

    public String getCar_model() {
        return car_model;
    }

    public String getEngine_number() {
        return engine_number;
    }

    public int getIssue_year() {
        return issue_year;
    }

    public String getInspection_date() {
        return inspection_date;
    }
}