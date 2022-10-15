package com.example.demo;

public class Exams {
    private int exams_id;



    private int Math;
    private int Physics;
    private int Ukraine_language;
    private String exams_date;

    public Exams(int exams_id, int math, int physics, int ukraine_language, String exams_date) {
        this.exams_id =exams_id;
        this.Math =math;
        this.Physics =physics;
        this.Ukraine_language =ukraine_language;
        this.exams_date =exams_date;

    }
    public int getExams_id() {
        return exams_id;
    }

    public int getMath() {
        return Math;
    }

    public int getPhysics() {
        return Physics;
    }

    public int getUkraine_language() {
        return Ukraine_language;
    }

    public String getExams_date() {
        return exams_date;
    }
}
