package ru.dvfu.mrcpk.restapi.model;

import java.io.Serializable;

public class User implements Serializable {

    private int id;

    private String firstname;

    private String lastname;

    private String password;

    private UserCategory userCategory;

    public User() { }

    public User(int id, String firstname, String lastname, String password, UserCategory userCategory) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.password = password;
        this.userCategory = userCategory;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserCategory getUserCategory() {
        return userCategory;
    }

    public void setUserCategory(UserCategory userCategory) {
        this.userCategory = userCategory;
    }
}
