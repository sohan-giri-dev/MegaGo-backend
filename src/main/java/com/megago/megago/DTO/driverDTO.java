package com.megago.megago.DTO;

import com.megago.megago.Enums.tripEnums.zoneType;
import com.megago.megago.Models.Common.Location;

public class driverDTO {
    private driverDTO() {

    }
   public static class activeDriver {
        public static class getActiveDriver {
            public Long id;
            public Location dropLocation;
            public zoneType zone;
        }
    }
}
