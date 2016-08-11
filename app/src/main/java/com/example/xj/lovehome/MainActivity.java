package com.example.xj.lovehome;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.xj.main.HomeActivity;

public class MainActivity extends AppCompatActivity {

    @Override
     protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void myOnclick(View v){
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }
}
