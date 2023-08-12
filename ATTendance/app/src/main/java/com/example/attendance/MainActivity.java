package com.example.attendance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendM(View v)
    {
        Intent intent = new Intent(this,to_math.class);
        startActivity(intent);
    }

    public void sendT(View view)
    {

    }

    public void sendDSL(View view)
    {

    }

    public void sendDSDL(View view)
    {

    }

    public void sendEEL(View view)
    {

    }

    public void sendDS(View view)
    {

    }

    public void sendDSD(View view)
    {

    }

    public void sendIC(View view) {
    }
}