package com.example.chynnasevilleno.mfw;

public class Weather {
    String weather_id;
    String weather_city;
    String weather_temp;
    String weather_hum;
    String weather_description;
    String weather_date;

    public Weather(){

    }

    public Weather(String weather_id, String weather_city, String weather_temp, String weather_hum, String weather_description, String weather_date) {
        this.weather_id = weather_id;
        this.weather_city = weather_city;
        this.weather_temp = weather_temp;
        this.weather_hum = weather_hum;
        this.weather_description = weather_description;
        this.weather_date = weather_date;
    }

    public String getWeather_id() {
        return weather_id;
    }

    public String getWeather_city() {
        return weather_city;
    }

    public String getWeather_temp() {
        return weather_temp;
    }

    public String getWeather_hum() {
        return weather_hum;
    }

    public String getWeather_description() {
        return weather_description;
    }

    public String getWeather_date() {
        return weather_date;
    }
}