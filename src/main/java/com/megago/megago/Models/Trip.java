package com.megago.megago.Models;

import java.time.LocalDateTime;

import com.megago.megago.Models.Common.Location;

import jakarta.validation.constraints.NotNull;

import com.megago.megago.Enums.tripEnums.Status;;

public class Trip {

    private User user;
    private Driver driver;
    private Location baseLocation;
    private Location dropLocation;
    private double price;
    private double duration;
    private double distance;
    private Status status;
    private LocalDateTime createdAt;
    @NotNull()
    private boolean delete_at;

    public Trip(User user, Driver driver, Location baseLocation, Location dropLocation, double price) {
        this.user = user;
        this.driver = driver;
        this.baseLocation = baseLocation;
        this.dropLocation = dropLocation;
        this.price = price;
        this.createdAt = LocalDateTime.now();
        this.status = Status.PENDING;
        this.delete_at = false;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean isDelete_at() {
        return delete_at;
    }

    public void setDelete_at(boolean delete_at) {
        this.delete_at = delete_at;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Location getBaseLocation() {
        return baseLocation;
    }

    public void setBaseLocation(Location baseLocation) {
        this.baseLocation = baseLocation;
    }

    public Location getDropLocation() {
        return dropLocation;
    }

    public void setDropLocation(Location dropLocation) {
        this.dropLocation = dropLocation;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "Trip [user=" + user + ", driver=" + driver + ", baseLocation=" + baseLocation + ", dropLocation="
                + dropLocation + ", price=" + price + ", distance=" + distance + ", duration=" + duration
                + ", status=" + status + ", createdAt=" + createdAt + "]";
    }
}
