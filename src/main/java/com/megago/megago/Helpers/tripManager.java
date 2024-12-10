package com.megago.megago.Helpers;

import java.sql.Driver;

import com.megago.megago.Models.Vehicle;
import com.megago.megago.Models.Common.Location;
import com.megago.megago.Enums.tripEnums.vehicleType;
import com.megago.megago.Enums.tripEnums.zoneType;

public class tripManager {

    private tripManager() {
    }

    public static Vehicle[] getVehicleList(Location base) {
       // zoneType zone = getZone(base);
        return null;
    }
    public static Integer getPriceByVehicle(Location base, Location drop,vehicleType type) {
        return null;
    }
    public static Vehicle[] getVehicleList(Location base, Location drop, vehicleType type ) {
        return null;
    }
    public static boolean sendNotificationToDrivers(Driver[] drivers) {
        return true;
    }

    public static boolean notificationAcceptedByDriver(Driver driver) {

        return true;
    }

    public static boolean endTrip(Driver driver) {

        return true;
    }

    public static zoneType getZone(Location loc) {
        // write logic
        return zoneType.ZONE_A;
    }

}
