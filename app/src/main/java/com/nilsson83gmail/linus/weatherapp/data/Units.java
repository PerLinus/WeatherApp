package com.nilsson83gmail.linus.weatherapp.data;

import org.json.JSONObject;

/**
 * Created by s060qm on icon_2/icon_1/2018.
 */

public class Units implements JSONPopulator {

    private String temperature;

    @Override
    public void populate(JSONObject data) {

        temperature = data.optString("temperature");

    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }
}
