package com.nilsson83gmail.linus.weatherapp.data;

import org.json.JSONObject;

/**
 * Created by s060qm on icon_2/icon_1/2018.
 */

public class Channel implements JSONPopulator {

    private Item item;
    private Units units;

    @Override
    public void populate(JSONObject data) {

        units = new Units();
        units.populate(data.optJSONObject("units"));

        item = new Item();
        item.populate(data.optJSONObject("item"));

    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Units getUnits() {
        return units;
    }

    public void setUnits(Units units) {
        this.units = units;
    }
}
