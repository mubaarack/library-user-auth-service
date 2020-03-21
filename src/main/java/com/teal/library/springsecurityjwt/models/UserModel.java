package com.teal.library.springsecurityjwt.models;

public class UserModel {

    private int readerID;
    private String Email;
    private String Role;
    private String Username;
    private String Firstname;
    private String Lastname;
    private String Password;

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        this.Role = role;
    }
    public int getReaderID() {
        return readerID;
    }

    public void setReaderID(int readerID) {
        this.readerID = readerID;
    }


    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }


    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }
}
