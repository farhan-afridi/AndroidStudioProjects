package com.example.attendance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class to_math extends AppCompatActivity {

    final int TOTAL = 40;
    String absent = null;
    EditText tx2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Intent intent = getIntent();

        TextView tx1 = findViewById(R.id.textTotalvalue);
        String sv = Integer.toString(TOTAL);
        tx1.setText(sv);

        tx2 = findViewById(R.id.editTextTextPersonName);
        readStore();


    }
    public void readStore()
    {
        try {

            FileInputStream fileInputStream = openFileInput("attMath.txt");
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);

            char[] charArr = new char[100];
            String s =null;
            int charRead;
            while ((charRead=inputStreamReader.read(charArr))>0)
            {
                String readstring = String.copyValueOf(charArr,0,charRead);
                s = s+"\n"+readstring;
                charArr = new char[100];
            }
            absent = s;
            tx2.setText(s);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void update(View v)
    {
        try {
            int t = Integer.parseInt(absent);
            String data = Integer.toString(t+1);
            FileOutputStream fileOutputStream = openFileOutput("attMath.txt",MODE_PRIVATE);

            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
            outputStreamWriter.write(data);
            outputStreamWriter.flush();
            outputStreamWriter.close();
            Toast.makeText(this, "Data saved Successfully", Toast.LENGTH_SHORT).show();
            tx2.setText(data);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}