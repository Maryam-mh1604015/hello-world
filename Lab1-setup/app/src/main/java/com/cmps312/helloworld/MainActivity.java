package com.cmps312.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button sayHello;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sayHello = findViewById(R.id.button);
        sayHello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("MainActivity" ,"WELCOME TO CMPS312");
            }
        });

        Log.d("MainActivity", "Debug");
        Log.e("MainActivity", "Error");
        Log.v("MainActivity", "Verbose");
        Log.i("MainActivity", "Info");
        Log.wtf("MainActivity", "What a terrible failure");



    }
}

//todo Aisha should implement the server connection
//todo Fatima should implement the design interface