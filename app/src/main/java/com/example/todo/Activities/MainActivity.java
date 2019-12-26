package com.example.todo.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.todo.R;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    String url = "https://vignette.wikia.nocookie.net/megajump/images/2/27/Android_Robot.png";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView = (ImageView)findViewById(R.id.imageView);


        Picasso.get().load(url).into(imageView);


        loadImageFromUrl(url);
    }

    private void loadImageFromUrl(String url) {

//        Picasso.with(this).load(url).placeholder(R.mipmap.ic_launcher) // optional
//                .error(R.mipmap.ic_launcher) //if error
//                .into(imageView,new com.squareup.picasso.Callback(){
//
//
//                    @Override
//                    public void onSuccess() {
//
//                    }
//
//                    @Override
//                    public void onError() {
//
//                    }
//                });

    }
}
