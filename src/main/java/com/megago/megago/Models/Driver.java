package com.megago.megago.Models;

import com.megago.megago.Models.Common.Address;
import com.megago.megago.Models.Common.Rating;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull()
    private Long userId;

    @NotNull(message = "Driver license number cannot be null")
    private String licenseNumber;

    private Rating rating;
    private Long vehicleId;

    @NotNull()
    private boolean delete_at;


    public Driver(Long id,
    @NotNull(message = "Driver name cannot be null") @Size(min = 3, max = 100, message = "Driver name must be between 3 and 100 characters") String name,
    @NotNull(message = "Driver contact cannot be null") String contact,
    @NotNull(message = "Driver license number cannot be null") String licenseNumber, Address address,
    @NotNull(message = "Vehicle ID cannot be null") Long vehicleId,Rating rating,Long userId) {
        this.id = id;
        this.licenseNumber = licenseNumber;
        this.vehicleId = vehicleId;
        this.rating = rating;
        this.delete_at = false;
        this.userId = userId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
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
    public Long getVehicleId() {
        return vehicleId;
    }
    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
    }
}
