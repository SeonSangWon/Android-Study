package com.example.user.sswapp4;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class FrameLayout extends AppCompatActivity {

    ImageView imageView1;
    BitmapDrawable draw;
    int imageIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_layout);

        imageView1 = (ImageView)findViewById(R.id.imageView1);
    }

    public void nameChange(View v){
        imageView1.setVisibility(View.VISIBLE);
        Resources res = getResources();

        if(imageIndex == 0)
        {
            draw = (BitmapDrawable)res.getDrawable(R.drawable.seon);
            imageView1.setImageDrawable(draw);

            imageView1.setVisibility(View.VISIBLE);

            imageIndex = 1;
        }

        else if(imageIndex == 1)
        {
            draw = (BitmapDrawable)res.getDrawable(R.drawable.sang);
            imageView1.setImageDrawable(draw);

            imageView1.setVisibility(View.VISIBLE);

            imageIndex = 2;
        }

        else if(imageIndex == 2)
        {
            draw = (BitmapDrawable)res.getDrawable(R.drawable.won);
            imageView1.setImageDrawable(draw);

            imageView1.setVisibility(View.VISIBLE);

            imageIndex = 0;
        }

        /*
        if(imageIndex == 0)
        {
            imageView1.setVisibility(View.VISIBLE);
            imageView3.setVisibility(View.INVISIBLE);

            imageIndex = 1;
        }
        else if(imageIndex == 1)
        {
            imageView1.setVisibility(View.INVISIBLE);
            imageView2.setVisibility(View.VISIBLE);

            imageIndex = 2;
        }
        else if(imageIndex == 2)
        {
            imageView2.setVisibility(View.INVISIBLE);
            imageView3.setVisibility(View.VISIBLE);

            imageIndex = 0;
        }
        */


    }
}
