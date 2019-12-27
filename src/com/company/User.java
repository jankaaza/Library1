package com.company;

import java.util.List;

public abstract class User {
    private String first_name;
    private String last_name;
    private String phone_number;

    public User(String first_name, String last_name, String phone_number) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.phone_number = phone_number;
    }

    public User() {
        first_name = "UNKNOWN";
        last_name = "UNKNOWN";
        phone_number = "UNKNOWN";
    }

    public String getFirstName() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLastName() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

}
