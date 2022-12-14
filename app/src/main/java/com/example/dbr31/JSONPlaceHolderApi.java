package com.example.dbr31;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface JSONPlaceHolderApi {

    //https://api.openweathermap.org/data/2.5/weather?q=Moscow,ru&appid=150d622908e1e2b11a4683315aae201e&units=metric


//    @GET("/posts/{id}")
    //https://openweathermap.org/data/2.5/onecall?lat=55.7522&lon=37.6156&units=metric&appid=439d4b804bc8187953eb36d2a8c26a02
    //439d4b804bc8187953eb36d2a8c26a02
/*    @GET("/data/2.5/weather?q=London,uk&appid=150d622908e1e2b11a4683315aae201e")
    public Call<Post> getPost(); //getPostWithID(@Path("id") int id);*/


    //@GET("/geo/1.0/direct?q=Moscow,&appid=150d622908e1e2b11a4683315aae201e&units=metric")
    //public Call<Post> getPost(); //getPostWithID(@Path("id") int id);\


    @GET("/2.5/weather?q=Moscow,ru&appid=150d622908e1e2b11a4683315aae201e&units=metric")
    public Call<Post> getPost();
}
