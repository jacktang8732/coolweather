package com.example.hasee.coolweather.gson;

/**
 * Created by hasee on 2018/3/1.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
