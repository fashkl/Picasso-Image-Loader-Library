package com.example.ali.picassoimageloader;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    Context context;
    ImageView image1,image2,image3,image4,image5;
    String url1="https://pixabay.com/static/uploads/photo/2016/08/07/16/23/coffee-1576537_960_720.jpg";
    String url2="https://pixabay.com/static/uploads/photo/2016/08/12/20/54/paprika-1589670_960_720.jpg";
    String url3="https://pixabay.com/static/uploads/photo/2016/07/12/11/39/checkmate-1511866_960_720.jpg";
    String url4="https://pixabay.com/static/uploads/photo/2016/08/07/22/47/northern-gannet-1577300_960_720.jpg";
    String url5="https://pixabay.com/static/uploads/photo/2015/05/21/18/30/coffee-777612_960_720.jpg";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image1=(ImageView) findViewById(R.id.image1);
        image2=(ImageView) findViewById(R.id.image2);
        image3=(ImageView) findViewById(R.id.image3);
        image4=(ImageView) findViewById(R.id.image4);
        image5=(ImageView) findViewById(R.id.image5);

        Picasso.with(this).load(url1).error(R.drawable.image).resize(250,200).into(image1);
        Picasso.with(this).load(url2).error(R.drawable.image).resize(250,200).into(image2);
        Picasso.with(this).load(url3).error(R.drawable.image).resize(250,200).into(image3);
        Picasso.with(this).load(url4).error(R.drawable.image).resize(250,200).into(image4);
        Picasso.with(this).load(url5).error(R.drawable.image).resize(250,200).into(image5);

    }
}
