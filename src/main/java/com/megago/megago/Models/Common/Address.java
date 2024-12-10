package com.megago.megago.Models.Common;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Embeddable
public class Address {

    @NotNull(message = "Street cannot be null")
    @Size(min = 1, max = 255, message = "Street name must be between 1 and 255 characters")
    private String street;

    @NotNull(message = "City cannot be null")
    @Size(min = 1, max = 100, message = "City name must be between 1 and 100 characters")
    private String city;

    @Size(min = 1, max = 100, message = "State name must be between 1 and 100 characters")
    private String state;

    @NotNull(message = "Postal code cannot be null")
    @Size(min = 1, max = 20, message = "Postal code must be between 1 and 20 characters")
    private String postalCode;

    @NotNull(message = "Country cannot be null")
    @Size(min = 1, max = 100, message = "Country name must be between 1 and 100 characters")
    private String country;

    public Address(String street, String city, String state, String postalCode, String country) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
               "street='" + street + '\'' +
               ", city='" + city + '\'' +
               ", state='" + state + '\'' +
               ", postalCode='" + postalCode + '\'' +
               ", country='" + country + '\'' +
               '}';
    }
}
