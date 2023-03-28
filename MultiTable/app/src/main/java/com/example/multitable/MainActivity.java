package com.example.multitable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    TextView text1 ;
    Button button;
    TextView text2;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1 = findViewById(R.id.Tx);
        text2 = findViewById(R.id.textView);
        button = findViewById(R.id.button);
        editText = findViewById(R.id.editTextNumber);

        text1.setText("Multiplcation Table");

    }
    public void table(View view)
    {
        int a = Integer.parseInt(editText.getText().toString());
        for (int i = 1 ; i<=25 ; i++)
        {
            int m = a*i;
            text2.append("\n");
            text2.append(+a+" X "+i+" = "+m);
        }
    }
}