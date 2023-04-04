package com.example.multiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String nameY = intent.getStringExtra(MainActivity.EXTRA_NAME);  //points to extra name of main activity
        text2 = findViewById(R.id.textView);
        text2.setText("Your name is ---> \n"+nameY);
    }
}