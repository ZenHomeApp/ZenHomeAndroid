package com.eduvilar.zenhome.model.appliances;

import com.eduvilar.zenhome.enums.Status;
import com.eduvilar.zenhome.model.Intensity;

/**
 * Created by efraespada on 29/11/2017.
 */

public class TV extends Appliance {

    public TV(Status status, Intensity intensity) {
        super(status, intensity);
    }
}