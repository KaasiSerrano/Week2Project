package com.example.framelayout;

import java.io.Serializable;

public class Credentials implements Serializable {
    private String email, password;

    Credentials(String email_arg, String password_arg){
        this.email = email_arg;
        this.password = password_arg;
    }

    Credentials(){

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
