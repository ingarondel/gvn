package com.example.laba5;

public class Payment {
    private int payment_id;
    private int cars_id;
    private int clients_id;
    private String arrival_date;
    private String departure_date;
    private float price;

    public Payment(int payment_id, int cars_id, int clients_id,String arrival_date, String departure_date, float price) {
        this.payment_id =payment_id;
        this.cars_id =cars_id;
        this.clients_id =clients_id;
        this.arrival_date =arrival_date;
        this.departure_date =departure_date;
        this.price =price;
    }

    public int getPayment_id() {
        return payment_id;
    }

    public int getCars_id() {
        return cars_id;
    }

    public int getClients_id() {
        return clients_id;
    }

    public String getArrival_date() {
        return arrival_date;
    }

    public String getDeparture_date() {
        return departure_date;
    }

    public String getEntrant_name() {
        return entrant_name;
    }

    public float getPrice() {
        return price;
    }
}