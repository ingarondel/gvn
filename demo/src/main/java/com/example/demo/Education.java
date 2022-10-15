package com.example.demo;

public class Education {
    private int education_id;
    private  String entrant_group;
    private String education_establishment;
    private int reputation;
    private float average_mark;
    private int Math_marks;
    private int Physics_marks;
    private int Ukraine_language_marks;

    public Education(int education_id, String entrant_group, String education_establishment, int reputation, float average_mark, int math_marks, int physics_marks, int ukraine_language_marks) {
        this.education_id =education_id;
        this.entrant_group =entrant_group;
        this.education_establishment =education_establishment;
        this.reputation =reputation;
        this.average_mark =average_mark;
        this.Math_marks =math_marks;
        this.Physics_marks =physics_marks;
        this.Ukraine_language_marks =ukraine_language_marks;
    }

    public int getEducation_id() {
        return education_id;
    }

    public String getEntrant_group() {
        return entrant_group;
    }

    public String getEducation_establishment() {
        return education_establishment;
    }

    public int getReputation() {
        return reputation;
    }

    public float getAverage_mark() {
        return average_mark;
    }

    public int getMath_marks() {
        return Math_marks;
    }

    public int getPhysics_marks() {
        return Physics_marks;
    }

    public int getUkraine_language_marks() {
        return Ukraine_language_marks;
    }
}
