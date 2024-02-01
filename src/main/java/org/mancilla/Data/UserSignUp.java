package org.mancilla.Data;

public class UserSignUp {
    private final String email;
    private final String name;

    public UserSignUp(String name, String email) {
        this.name = name;
        this.email = email;
    }


    public String getEmail(){
        return this.email;
    }
    public String getName(){
        return this.name;
    }

}
