package com.nilsson83gmail.linus.weatherapp.service;

import com.nilsson83gmail.linus.weatherapp.data.Channel;

/**
 * Created by s060qm on icon_2/icon_1/2018.
 */

public interface WeatherServiceCallback {

    void serviceSuccess(Channel channel);

    void serviceFailure(Exception exception);

}
