package com.cs.oop.techgiant.studentprofile;

public class Student {
    public String name;
    public String id;
    public String dob;
    public String nationality;
    public String gender;

    public Student(String name, String id, String dob, String nationality, String gender) {
        this.name = name;
        this.id = id;
        this.dob = dob;
        this.nationality = nationality;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "ID: " + id + "\n" +
                "DOB: " + dob + "\n" +
                "Nationality: " + nationality + "\n" +
                "Gender: " + gender + "\n\n";
    }
}
