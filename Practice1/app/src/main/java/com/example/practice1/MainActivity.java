package com.example.practice1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
//    TextView text ;       11
    TextView text1 ;
    Button button1 ;
    TextView text2 ;
    EditText n1,n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        text = findViewById(R.id.text);  //iska default koi id set nhi tha        11
//        text.setText("Good Morning !!!");                                         11

        text1 = findViewById(R.id.textView);
        text1.setText("Enter Two Numbers to ADD");

        text2 = findViewById(R.id.textView2);

        n1 = findViewById(R.id.editTextNumber);
        n2 = findViewById(R.id.editTextNumber2);

        button1 = findViewById(R.id.button);
//        button1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view)
//            {
//                int sum = Integer.parseInt(n1.getText().toString())+ Integer.parseInt(n2.getText().toString());
//
//                text2.setText("The Sum of Two Nos. is = "+sum);
//            }
//        });
    }
    public void calculate(View view)            //this method is also successfull
    {
        int sum = Integer.parseInt(n1.getText().toString())+ Integer.parseInt(n2.getText().toString());

        text2.setText("The Sum of Two Nos. is = "+sum);
        Toast.makeText(MainActivity.this, "Thank You", Toast.LENGTH_SHORT).show();
    }
}