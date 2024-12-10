package com.megago.megago.DTO;

import com.megago.megago.Models.Vehicle;
import com.megago.megago.Models.Common.Location;

public class userDTO {
    private userDTO() {

    }
    public static class VehicleList {
        public static class getVehicleList {
            public Location baseLocation;
            public Location dropLocation;
        }
        public static class returnVehicleList {
            Vehicle vehicle;
            Integer price;
            public returnVehicleList(Vehicle vehicle,Integer price) {
                this.vehicle = vehicle;
                this.price = price;
            }
        }
    }
}
