package com.epam.project.entities;

import java.io.Serializable;

public class User implements Serializable{

    private Integer id;
    private String name;
    private String password;
    private String phone;
    private String email;
    private UserRole userRole;
    private String notes;

    public User(){

    }

    public User(String name, String password){
        this.name = name;
        this.password = password;
    }

    /** Getter methods */
    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public String getNotes() {
        return notes;
    }

    /** Setter methods */

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return name == user.name && password == user.password;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + password.hashCode() * 31;
    }

    @Override
    public String toString() {
        return  "\nUser ID =" + id +
                "\nName='" + name +
                "\nPassword='" + password +
                "\nPhone='" + phone +
                "\nEmail='" + email +
                "\nUserRole=" + userRole +
                "\nNotes='" + notes +
                "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
    }
}
