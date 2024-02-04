package org.mancilla.Data;

public class UserEndsSignUp {
    private final String firstName;
    private final String lastName;
    private final String company;
    private final String address;
    private final String address2;
    private final String country;
    private final String city;
    private final String state;
    private final String zipcode;
    private final String mobileNumber;

    public UserEndsSignUp(String firstName, String lastName, String company, String address, String address2, String country, String city, String state, String zipcode, String mobileNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.address = address;
        this.address2 = address2;
        this.country = country;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.mobileNumber = mobileNumber;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getCompany() {
        return this.company;
    }

    public String getAddress() {
        return this.address;
    }

    public String getAddress2() {
        return this.address2;
    }

    public String getCountryPicker() {
        return this.country;
    }

    public String getState() {
        return this.state;
    }

    public String getMobileNumber() {
        return this.mobileNumber;
    }
    public String getCity(){return this.city;}
    public String getZipCode(){return this.zipcode;}
}
