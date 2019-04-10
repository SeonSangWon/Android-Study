package com.example.user.sswapp3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickedP168Button(View v){
        Intent intent = new Intent(getApplicationContext(), P165Acitivity.class);
        startActivity(intent);
    }
    public void onClickedP199Button(View v){
        Intent intent = new Intent(getApplicationContext(), P199Activity.class);
        startActivity(intent);
    }
    public void onClickedP202Button(View v){
        Intent intent = new Intent(getApplicationContext(), P202Activity.class);
        startActivity(intent);
    }
    public void onClickedP210Button(View v){
        Intent intent = new Intent(getApplicationContext(), P210Activity.class);
        startActivity(intent);
    }
    public void onClickedP215Button(View v){
        Intent intent = new Intent(getApplicationContext(), P215Activity.class);
        startActivity(intent);
    }
    public void onClickedP221Button(View v){
        Intent intent = new Intent(getApplicationContext(), P221Activity.class);
        startActivity(intent);
    }
}
