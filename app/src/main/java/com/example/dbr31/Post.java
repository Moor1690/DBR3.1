/*package com.example.dbr31;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Post {
    @SerializedName("userId")
    @Expose
    private int userId;
    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("body")
    @Expose
    private String body;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}*/

package com.example.dbr31;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Post {
    @SerializedName("coord")
    @Expose
    Coord CoordObject;
    @SerializedName("weather")
    @Expose
    ArrayList< Object > weather = new ArrayList < Object > ();
    @SerializedName("base")
    @Expose
    private String base;
    @SerializedName("MainObject")
    @Expose
    Main MainObject;
    @SerializedName("visibility")
    @Expose
    private float visibility;
    @SerializedName("WindObject")
    @Expose
    Wind WindObject;
    @SerializedName("CloudsObject")
    @Expose
    Clouds CloudsObject;
    @SerializedName("dt")
    @Expose
    private float dt;
    @SerializedName("SysObject")
    @Expose
    Sys SysObject;
    @SerializedName("timezone")
    @Expose
    private float timezone;
    @SerializedName("id")
    @Expose
    private float id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("cod")
    @Expose
    private float cod;




    // Getter Methods

    public Coord getCoord() {
        return CoordObject;
    }

    public String getBase() {
        return base;
    }

    public Main getMain() {
        return MainObject;
    }

    public float getVisibility() {
        return visibility;
    }

    public Wind getWind() {
        return WindObject;
    }

    public Clouds getClouds() {
        return CloudsObject;
    }

    public float getDt() {
        return dt;
    }

    public Sys getSys() {
        return SysObject;
    }

    public float getTimezone() {
        return timezone;
    }

    public float getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getCod() {
        return cod;
    }

    // Setter Methods

    public void setCoord(Coord coordObject) {
        this.CoordObject = coordObject;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public void setMain(Main mainObject) {
        this.MainObject = mainObject;
    }

    public void setVisibility(float visibility) {
        this.visibility = visibility;
    }

    public void setWind(Wind windObject) {
        this.WindObject = windObject;
    }

    public void setClouds(Clouds cloudsObject) {
        this.CloudsObject = cloudsObject;
    }

    public void setDt(float dt) {
        this.dt = dt;
    }

    public void setSys(Sys sysObject) {
        this.SysObject = sysObject;
    }

    public void setTimezone(float timezone) {
        this.timezone = timezone;
    }

    public void setId(float id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCod(float cod) {
        this.cod = cod;
    }
}
class Sys {
    @SerializedName("type")
    @Expose
    private float type;
    @SerializedName("id")
    @Expose
    private float id;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("sunrise")
    @Expose
    private float sunrise;
    @SerializedName("sunset")
    @Expose
    private float sunset;


    // Getter Methods

    public float getType() {
        return type;
    }

    public float getId() {
        return id;
    }

    public String getCountry() {
        return country;
    }

    public float getSunrise() {
        return sunrise;
    }

    public float getSunset() {
        return sunset;
    }

    // Setter Methods

    public void setType(float type) {
        this.type = type;
    }

    public void setId(float id) {
        this.id = id;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setSunrise(float sunrise) {
        this.sunrise = sunrise;
    }

    public void setSunset(float sunset) {
        this.sunset = sunset;
    }
}
class Clouds {
    @SerializedName("all")
    @Expose
    private float all;


    // Getter Methods

    public float getAll() {
        return all;
    }

    // Setter Methods

    public void setAll(float all) {
        this.all = all;
    }
}
class Wind {
    @SerializedName("speed")
    @Expose
    private float speed;
    @SerializedName("deg")
    @Expose
    private float deg;
    @SerializedName("gust")
    @Expose
    private float gust;


    // Getter Methods

    public float getSpeed() {
        return speed;
    }

    public float getDeg() {
        return deg;
    }

    public float getGust() {
        return gust;
    }

    // Setter Methods

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public void setDeg(float deg) {
        this.deg = deg;
    }

    public void setGust(float gust) {
        this.gust = gust;
    }
}
class Main {
    @SerializedName("temp")
    @Expose
    private float temp;
    @SerializedName("feels_like")
    @Expose
    private float feels_like;
    @SerializedName("temp_min")
    @Expose
    private float temp_min;
    @SerializedName("temp_max")
    @Expose
    private float temp_max;
    @SerializedName("pressure")
    @Expose
    private float pressure;
    @SerializedName("humidity")
    @Expose
    private float humidity;


    // Getter Methods

    public float getTemp() {
        return temp;
    }

    public float getFeels_like() {
        return feels_like;
    }

    public float getTemp_min() {
        return temp_min;
    }

    public float getTemp_max() {
        return temp_max;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    // Setter Methods

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public void setFeels_like(float feels_like) {
        this.feels_like = feels_like;
    }

    public void setTemp_min(float temp_min) {
        this.temp_min = temp_min;
    }

    public void setTemp_max(float temp_max) {
        this.temp_max = temp_max;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }
}
class Coord {

    @SerializedName("lon")
    @Expose
    private float lon;
    @SerializedName("lat")
    @Expose
    private float lat;


    // Getter Methods

    public float getLon() {
        return lon;
    }

    public float getLat() {
        return lat;
    }

    // Setter Methods

    public void setLon(float lon) {
        this.lon = lon;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }
}






















/*
{
    "coord":
        {
            "lon":-0.1257,
            "lat":51.5085
        },
        "weather":[
                {
                    "id":802,
                    "main":"Clouds",
                    "description":"scattered clouds",
                    "icon":"03n"
                }
        ],
        "base":"stations",
        "main":
        {
            "temp":287.65,
            "feels_like":287.17,
            "temp_min":286.61,
            "temp_max":288.35,
            "pressure":1009,
            "humidity":77
        },
        "visibility":10000,
        "wind":
        {
            "speed":6.17,
            "deg":200,
            "gust":11.32
        },
        "clouds":
        {
            "all":40
        },
        "dt":1667409402,
        "sys":
        {
            "type":2,
            "id":2075535,
            "country":"GB",
            "sunrise":1667372124,
            "sunset":1667406757
        },
        "timezone":0,"id":2643743,
        "name":"London",
        "cod":200
}*/
