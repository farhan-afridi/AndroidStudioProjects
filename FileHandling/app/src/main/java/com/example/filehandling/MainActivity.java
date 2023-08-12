package com.example.filehandling;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MainActivity extends AppCompatActivity {

    EditText et ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et = findViewById(R.id.editTextTextPersonName);

//             TO OPEN RESOURCE FILE, WHILE INSTALLING THE APP
//        InputStream inputStream = getResources().openRawResource(R.raw.myshort);
//        try {
//
//            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
//            String str = null;
//            int c = 1;
//            while ((str=br.readLine())!= null) {
//                if (c==1)
//                {
//                    TextView tx1 = findViewById(R.id.textView);
//                    tx1.setText(str);
//                }
//                if (c==2)
//                {
//                    TextView tx2 = findViewById(R.id.textView2);
//                    tx2.setText(str);
//                }
//                c++;
//            }
//            inputStream.close();
//            br.close();
//        }
//
//        catch (Exception e)
//        {
//            e.printStackTrace();
//        }
    }

    public void save(View view)
    {
        try {

            String data = et.getText().toString();
            FileOutputStream fileOutputStream = openFileOutput("abcd.txt",MODE_APPEND);

            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
            outputStreamWriter.write(data);
              //  fileOutputStream.write(data.toByteArray());           NOT WORKING
            outputStreamWriter.flush();
            outputStreamWriter.close();
            Toast.makeText(this, "Data saved Successfully", Toast.LENGTH_SHORT).show();
            et.setText("");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void load(View view)
    {
    try {

        FileInputStream fileInputStream = openFileInput("abcd.txt");
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);

        char[] charArr = new char[100];
        String s ="";
        int charRead;
        while ((charRead=inputStreamReader.read(charArr))>0)
        {
            String readstring = String.copyValueOf(charArr,0,charRead);
            s = s+"\n"+readstring;
            charArr = new char[100];
        }
        et.setText(s);
        Toast.makeText(this, "Loaded Successfully", Toast.LENGTH_SHORT).show();
    }
    catch (Exception e)
    {
        e.printStackTrace();
    }
    }
}