package com.example.impexample;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button ;
    EditText text ;
    EditText num;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.editTextTextPersonName);
        button = findViewById(R.id.button);
    }

    public void calculate(View view)
    {

        String s = text.getText().toString();
        //for URL
//        oo.setText("The Text"+s);
//        Intent url = new Intent(Intent.ACTION_VIEW,Uri.parse(s));
//        url.setData(Uri.parse(s));
//        startActivity(url);

        //Email
//        String[] addresses = {"rayees@gmail.com","farhan@gmail.com"};
//        Intent emai = new Intent(Intent.ACTION_SEND);
//        emai.setType("message/rfc822");       //this is a specific type to open the email app
//        emai.putExtra(Intent.EXTRA_EMAIL, addresses);
//        emai.putExtra(Intent.EXTRA_SUBJECT, "App Building");
//        emai.putExtra(Intent.EXTRA_TEXT,s);
//        startActivity(Intent.createChooser(emai, "Choose to Open"));
//        startActivity(emai);

        //Dial
//        Intent dia = new Intent(Intent.ACTION_DIAL);
//        dia.setData(Uri.parse("tel:"+s));
//        startActivity(dia);

        //SMS
//        num = findViewById(R.id.editTextPhone);
//        String nu = num.getText().toString();
//        Intent smss = new Intent(Intent.ACTION_SENDTO);
//        smss.setData(Uri.parse("smsto:"+Uri.encode(nu)));
//        smss.putExtra("sms_body",s);
//        startActivity(smss);

        //SHare
        Intent sha = new Intent(Intent.ACTION_SEND);
        sha.setType("text/plain");
        sha.putExtra(Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sha,"Share Via"));
//        startActivity(sha);      //it shows the whole application list
    }
}