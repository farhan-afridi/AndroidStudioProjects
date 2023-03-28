package com.example.first;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    private Button button;
    private TextView textView ;
    private EditText editText;   //not compulsory to name variable same as id of the component

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView2);
        editText = findViewById(R.id.editText1);
//        button.setOnClickListener(new View.OnClickListener()
//        {
//            @Override
//            public void onClick(View view)
//            {
//                Toast.makeText(MainActivity.this, "Hi, click listener worked", Toast.LENGTH_SHORT).show();
//                String s = editText.getText().toString();
//                int kg = Integer.parseInt(s);
//                double pd = 2.205*kg;
//                textView.setText("The Corresponding Value in Pound is \n"+pd);
//            }
//        });
    }
    public void calculate (View view)    //this type of method can also be used instead of 'onClickListener' , to specify what action to perform when the button is clicked
    {
        String s = editText.getText().toString();
        int kg = Integer.parseInt(s);
        double pd = 2.205*kg;
        textView.setText("The Corresponding Value in Pound is \n"+pd);
        Toast.makeText(MainActivity.this, "Thanks for using my FIRST App", Toast.LENGTH_SHORT).show();
    }
}