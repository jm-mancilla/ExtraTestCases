package org.ExtraTestCases.Data;

public class UserStartsSignUp {
    private final String email;
    private final String name;


    public UserStartsSignUp(String name, String email) {
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
