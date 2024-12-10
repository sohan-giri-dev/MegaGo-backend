package com.megago.megago.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

import java.util.Date;

import com.megago.megago.Enums.tripEnums.vehicleType;

@Entity
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Vehicle type cannot be null")
    private vehicleType vehicleType;

    @NotNull(message = "Owner name cannot be null")
    private String ownerName;

    @NotNull(message = "Vehicle number cannot be null")
    private String vehicleNumber;

    @NotNull(message = "Model cannot be null")
    private String model;

    private String color;

    private Date registrationDate;

    private String status;

    private Float mileage;

    private String location;

    private String vehicleImage;

    private String fuelType;

    private Integer capacity;

    @NotNull()
    private boolean delete_at;

    public Vehicle(vehicleType vehicleType, String ownerName, String vehicleNumber, String make, String model, Integer year,
                   String color, String vin, String insuranceDetails, Date registrationDate, String status, String ownerContact,
                   Float mileage, String fuelType, Integer capacity, String location, String vehicleImage,Long ownerId) {
        this.vehicleType = vehicleType;
        this.ownerName = ownerName;
        this.vehicleNumber = vehicleNumber;
        this.model = model;
        this.color = color;
        this.registrationDate = registrationDate;
        this.status = status;
        this.mileage = mileage;
        this.location = location;
        this.vehicleImage = vehicleImage;
        this.fuelType = fuelType;
        this.capacity = capacity;
        this.delete_at = false;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public vehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(vehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public Float getMileage() {
        return mileage;
    }

    public void setMileage(Float mileage) {
        this.mileage = mileage;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getVehicleImage() {
        return vehicleImage;
    }

    public void setVehicleImage(String vehicleImage) {
        this.vehicleImage = vehicleImage;
    }

    public boolean isDelete_at() {
        return delete_at;
    }

    public void setDelete_at(boolean delete_at) {
        this.delete_at = delete_at;
    }
}
