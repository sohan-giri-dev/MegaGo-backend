package com.megago.megago.Controllers;

import org.springframework.web.bind.annotation.RestController;

import com.megago.megago.DTO.userDTO;
import com.megago.megago.Models.Vehicle;
import com.megago.megago.Models.Common.Location;
import com.megago.megago.Services.UserService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.util.Pair;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController("/user")
public class User {

    @PostMapping("/vehicleList")
    public static List<userDTO.VehicleList.returnVehicleList> vehicleList(@RequestBody userDTO.VehicleList.getVehicleList body) {
       Location base = body.baseLocation;
       Location drop = body.dropLocation;
       Pair<Vehicle[], List<Integer>> data = UserService.getVehicleList(base,drop);
       Vehicle[] vehicles = data.getFirst();
       List<Integer> prices = data.getSecond();
       List<userDTO.VehicleList.returnVehicleList> responce = new ArrayList<>();;

       for (int i = 0; i<vehicles.length; i++) {
          Vehicle vehicle = vehicles[i];
          Integer price = prices.get(i);
          responce.add(new userDTO.VehicleList.returnVehicleList(vehicle,price));
       }
       return responce;
   }
}