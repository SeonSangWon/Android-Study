package com.example.user.sswapp4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void scrollView1(View v){
        Intent intent = new Intent(getApplicationContext(), ScrollView1.class);
        startActivity(intent);
    }
    public void scrollView2(View v){
        Intent intent = new Intent(getApplicationContext(), ScrollView2.class);
        startActivity(intent);
    }
    public void scrollView3(View v){
        Intent intent = new Intent(getApplicationContext(), ScrollView3.class);
        startActivity(intent);
    }
    public void frameLayout(View v){
        Intent intent = new Intent(getApplicationContext(), FrameLayout.class);
        startActivity(intent);
    }
}
