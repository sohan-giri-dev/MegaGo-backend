package com.megago.megago.Controllers;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.megago.megago.DTO.driverDTO;
import com.megago.megago.Enums.tripEnums.zoneType;
import com.megago.megago.Models.Common.Location;

@RestController
public class Driver {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    @PostMapping("/driver/activeDriver")
    public boolean activeDriver(@RequestBody driverDTO.activeDriver.getActiveDriver body) {
        Long id = body.id;
        Location dropLocation = body.dropLocation;
        zoneType zone = body.zone;

        String driverCacheKey = "active_driver:" + "~" + zone.name();

        Map<String, Object> driverCacheData = new HashMap<>();
        driverCacheData.put("id", id);
        driverCacheData.put("dropLocation", dropLocation);
        driverCacheData.put("zone", zone);

        redisTemplate.opsForHash().putAll(driverCacheKey, driverCacheData);
        redisTemplate.expire(driverCacheKey, Duration.ofHours(1));

        return true;
    }
    @PostMapping("/driver/acceptRequest")
    public boolean acceptRequest(@RequestBody driverDTO.activeDriver.getActiveDriver body) {
        return true;
    }

}
