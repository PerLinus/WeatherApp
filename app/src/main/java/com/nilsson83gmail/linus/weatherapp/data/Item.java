package com.nilsson83gmail.linus.weatherapp.data;

import org.json.JSONObject;

/**
 * Created by s060qm on icon_2/icon_1/2018.
 */

public class Item implements JSONPopulator {

    private Condition condition;

    @Override
    public void populate(JSONObject data) {

        condition = new Condition();
        condition.populate(data.optJSONObject("condition"));

    }

    public Condition getCondition() {
        return condition;
    }
}
