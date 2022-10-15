package com.example.demo;

public class Entrant {
    private int entrant_id;
    private int educations_id;
    private int examss_id;
    private String address;
    private int reg_number;
    private String birth_date;
    private String entrant_name;
    private String benefits;

    public Entrant(int entrant_id, int educations_id, String address, int reg_number, String birth_date, String entrant_name, String benefits) {
        this.entrant_id =entrant_id;
        this.educations_id =educations_id;
        this.address =address;
        this.reg_number =reg_number;
        this.birth_date =birth_date;
        this.entrant_name =entrant_name;
        this.benefits =benefits;
    }

    public int getEntrant_id() {
        return entrant_id;
    }

    public int getEducations_id() {
        return educations_id;
    }

    public int getExamss_id() {
        return examss_id;
    }

    public String getAddress() {
        return address;
    }

    public int getReg_number() {
        return reg_number;
    }

    public String getBirth_date() {
        return birth_date;
    }

    public String getEntrant_name() {
        return entrant_name;
    }

    public String getBenefits() {
        return benefits;
    }
}
