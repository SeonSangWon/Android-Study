package com.example.user.sswapp4;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;

public class ScrollView1 extends AppCompatActivity {

    ScrollView scrollView1;
    ImageView imageView;
    BitmapDrawable draw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_view1);

        scrollView1 = (ScrollView)findViewById(R.id.scrollView1);
        scrollView1.setHorizontalScrollBarEnabled(true);
        imageView = (ImageView)findViewById(R.id.imageView1);

        Resources res = getResources();
        draw = (BitmapDrawable)res.getDrawable(R.drawable.image01);
        int width, height;
        width = draw.getIntrinsicWidth();
        height = draw.getIntrinsicHeight();

        imageView.setImageDrawable(draw);
        imageView.getLayoutParams().width = width;
        imageView.getLayoutParams().height = height;
    }

    public void change(View v){
        changeImage();
    }

    private void changeImage(){
        Resources res = getResources();
        draw = (BitmapDrawable)res.getDrawable(R.drawable.image02);
        int width, height;
        width = draw.getIntrinsicWidth();
        height = draw.getIntrinsicHeight();

        imageView.setImageDrawable(draw);
        imageView.getLayoutParams().width = width;
        imageView.getLayoutParams().height = height;
    }
}
