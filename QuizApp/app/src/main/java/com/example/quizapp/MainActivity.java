package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tx1 ;
    Button b1;
    Button b2;
    private String[] questions = {"Do you want me to create an app?","Is it must relate to you?","Do you like Android development?","Are you a student of BIT Deoghar","Are you Awake ?🙂"};
    private Boolean[] ans = {false,true,false,false,true};
    private int index = 0;
    private int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tx1 = findViewById(R.id.textView);
        b1 = findViewById(R.id.button);
        b2 = findViewById(R.id.button2);

        tx1.setText(questions[0]);

        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if (index <= questions.length - 1)
                {
                    Toast.makeText(MainActivity.this, "PASS", Toast.LENGTH_SHORT).show();
                    if (ans[index])
                    {
                        score++;
                    }
                    ++index;
                    if (index <= (questions.length - 1))
                    {
                        tx1.setText(questions[index]);
                    }
                    else
                        Toast.makeText(MainActivity.this, "Your score is " + score + " out of " + questions.length, Toast.LENGTH_SHORT).show();
                }
                else
                    Toast.makeText(MainActivity.this, "RESTART", Toast.LENGTH_SHORT).show();
            }
        });

        b2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if (index <= questions.length - 1)
                {
                    Toast.makeText(MainActivity.this, "FAIL", Toast.LENGTH_SHORT).show();
                    if (!ans[index])
                    {
                        score++;
                    }

                    ++index;
                    if (index <= questions.length - 1) {
                        tx1.setText(questions[index]);
                    }
                    else
                        Toast.makeText(MainActivity.this, "Your score is " + score + " out of " + questions.length, Toast.LENGTH_SHORT).show();
                }
                else
                    Toast.makeText(MainActivity.this, "RESTART", Toast.LENGTH_SHORT).show();
            }
        });
    }
//    public void mustgo (View view)                // isme kuch problem hai, shuru me button do baar dabana pad rha hai
//    {
//        b1.setOnClickListener(new View.OnClickListener()
//        {
//            @Override
//            public void onClick(View view)
//            {
//                if (index <= questions.length - 1)
//                {
//                    Toast.makeText(MainActivity.this, "PASS", Toast.LENGTH_SHORT).show();
//                    if (ans[index])
//                    {
//                        score++;
//                    }
//                    ++index;
//                    if (index <= (questions.length - 1))
//                    {
//                        tx1.setText(questions[index]);
//                    }
//                    else
//                        Toast.makeText(MainActivity.this, "Your score is " + score + " out of " + questions.length, Toast.LENGTH_SHORT).show();
//                }
//                else
//                    Toast.makeText(MainActivity.this, "RESTART", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        b2.setOnClickListener(new View.OnClickListener()
//        {
//            @Override
//            public void onClick(View view)
//            {
//                if (index <= questions.length - 1)
//                {
//                    Toast.makeText(MainActivity.this, "FAIL", Toast.LENGTH_SHORT).show();
//                    if (!ans[index])
//                    {
//                        score++;
//                    }
//
//                    ++index;
//                    if (index <= questions.length - 1) {
//                        tx1.setText(questions[index]);
//                    }
//                    else
//                        Toast.makeText(MainActivity.this, "Your score is " + score + " out of " + questions.length, Toast.LENGTH_SHORT).show();
//                }
//                else
//                    Toast.makeText(MainActivity.this, "RESTART", Toast.LENGTH_SHORT).show();
//            }
//        });
//    }
}