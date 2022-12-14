package com.example.dbr31;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;


import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    //String key = "150d622908e1e2b11a4683315aae201e";
    //String endpoint = "api.openweathermap.org/data/2.5/weather?q=London,uk&APPID=150d622908e1e2b11a4683315aae201e";
    TextView textView;// = findViewById(R.id.text1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text1);


        NetworkService.getInstance()
                .getJSONApi()
                //.getPostWithID()
                .getPost()
                .enqueue(new Callback<Post>() {
                    @Override
                    public void onResponse(@NonNull Call<Post> call, @NonNull Response<Post> response) {
                        Post post = response.body();
                        //System.out.println(response.body().getName());
                        //response.
                                //response.body();
                        //System.out.println("response.message()\t" + response.message());
                        //System.out.println("someone");
                        System.out.println("getName");

                        //post.get
                        //System.out.println(post.getName());

                        //textView.append("\n"+"getName() "+post.getName() + "\n");
                        textView.append("getClouds() "+post.getClouds() + "\n");
                        textView.append("getVisibility() "+post.getVisibility() + "\n");
                        textView.append("temp() "+post.getMain().getTemp() + "\n");
                    }

                    @Override
                    public void onFailure(@NonNull Call<Post> call, @NonNull Throwable t) {
                        System.out.println("OnFail");

                        textView.clearComposingText();

                        textView.append("Error occurred while getting request!");
                        t.printStackTrace();
                    }
                });
    }
}
