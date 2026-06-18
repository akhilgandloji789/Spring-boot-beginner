package com.being_infinity.springboot_beginner.models;

public class User {
    //id
    //name
    //gender
    //image
    private int id;
    private String name;
    private String gender;
    private String image;

    //default constructor
    public User() {
    }

    //parameterized constructor
    public User(int id, String name, String gender, String image) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.image = image;
    }

    //getters and setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id=id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender=gender;
    }
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image=image;
    }
}
