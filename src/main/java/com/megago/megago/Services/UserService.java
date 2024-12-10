package com.megago.megago.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Pair;
import org.springframework.stereotype.Service;

import com.megago.megago.Helpers.tripManager;
import com.megago.megago.Models.Vehicle;
import com.megago.megago.Models.Common.Location;

@Service
public class UserService {

    @Autowired
    private static tripManager tripManager;

    private UserService() {
    }

    @SuppressWarnings("static-access")
    public static Pair<Vehicle[], List<Integer>> getVehicleList(Location base,Location drop){
        Vehicle[] vehicles = UserService.tripManager.getVehicleList(base);
        List<Integer> prices = new ArrayList<>();

        for (int i = 0; i < vehicles.length; i++)
            prices.add(UserService.tripManager.getPriceByVehicle(base,drop, vehicles[i].getVehicleType()));

        return Pair.of(vehicles, prices);
    }
}
