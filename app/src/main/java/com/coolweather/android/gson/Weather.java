package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Weather {

    public String status;;

    public AQI aqi;

    public Basic basic;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public ArrayList<Forecast> forecastList;

}
