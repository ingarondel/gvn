package com.example.laba5;

public class Client {
    private int client_id;
    private  String surname;
    private String name;
    private String patronym;
    private String address;
    private String current_account;
    private int birth_year;


    public Client(int client_id, String surname, String name, String patronym, String address,String current_account, int birth_year) {
        this.client_id =client_id;
        this.name =name;
        this.surname =surname;
        this.patronym =patronym;
        this.address =address;
        this.current_account =current_account;
        this.birth_year =birth_year;
    }

    public int getClient_id() {
        return client_id;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public int getPatronym() {
        return patronym;
    }

    public float getAddress() {
        return address;
    }

    public int getCurrent_account() {
        return current_account;
    }

    public int getBirth_year() {
        return birth_year;
    }
}