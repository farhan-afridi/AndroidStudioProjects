package com.example.listviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity
{

    ListView listView;
    String arr[] = {"This is","Item","Item2","Soap","Surf","Mobile is a useless thing"};
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
    //Using Built-in Array Adapter

        ArrayAdapter ad =new ArrayAdapter(this,android.R.layout.simple_list_item_1,arr);
        listView.setAdapter(ad);

        //Using Custtom Array Adapter

//        farhanAdapter ad = new farhanAdapter(this,R.layout.my_farhan_layout,arr);
//        listView.setAdapter(ad);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()       //this listener works for preset adapter and layout
        {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
            {
                Toast.makeText(MainActivity.this, "You Clicked On : "+i, Toast.LENGTH_SHORT).show();
            }
        });
    }
}