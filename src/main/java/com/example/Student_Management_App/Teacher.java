package com.example.Student_Management_App;

public class Teacher {
    private int id;

    private String name;

    private int age;

    private int numberOfStudents;

    public Teacher() {
    }

    public Teacher(int id, String name, int age, int numberOfStudents) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.numberOfStudents = 0;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }
}
