package com.megago.megago.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import com.megago.megago.Enums.userEnums.Type;
import com.megago.megago.Models.Common.Address;
import com.megago.megago.Models.Common.Rating;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Name cannot be null")
    @Size(min = 2, max = 100, message = "Name must be between 2 and 100 characters")
    private String name;

    @NotNull(message = "Email cannot be null")
    @Email(message = "Email should be valid")
    private String email;

    @NotNull(message = "User type cannot be null")
    private Type type;

    private Address address;
    private String contact;

    private Rating rating;
    @NotNull()
    private boolean delete_at;


    public User(Long id,
    @NotNull(message = "Name cannot be null") @Size(min = 2, max = 100, message = "Name must be between 2 and 100 characters") String name,
    @NotNull(message = "Email cannot be null") @Email(message = "Email should be valid") String email,
    @NotNull(message = "User type cannot be null") Type type, Address address , Rating rating, String contact) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.type = type;
        this.address = address;
        this.rating = rating;
        this.delete_at = false;
        this.contact = contact;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public boolean isDelete_at() {
        return delete_at;
    }

    public void setDelete_at(boolean delete_at) {
        this.delete_at = delete_at;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

}
