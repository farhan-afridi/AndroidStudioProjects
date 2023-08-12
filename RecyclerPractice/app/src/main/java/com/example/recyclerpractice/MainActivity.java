package com.example.recyclerpractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.AbsListView;

public class MainActivity extends AppCompatActivity {

    Contacts o1 = new Contacts(1,"66526524856","Ayush");
    Contacts o2 = new Contacts(2,"66526524856","Abay");
    Contacts o3 = new Contacts(3,"66526524856","Ayan");
    Contacts o4 = new Contacts(4,"66526524856","Aditya");
    Contacts o5 = new Contacts(5,"66526524856","Adnan");
    Contacts[] contacts = {o1,o2,o3,o4,o5};

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        CustomAdapter ad =new CustomAdapter(contacts);
        recyclerView.setAdapter(ad);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
    }
}