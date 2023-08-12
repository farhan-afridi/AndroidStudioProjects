package com.example.listviewapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class farhanAdapter extends ArrayAdapter<String>
{
    private String[] arr;
    private Context context;
    public farhanAdapter(@NonNull Context context, int resource, @NonNull String[] arr)
    {
        super(context, resource, arr);
        this.context = context;
        this.arr = arr;
    }

    @Nullable
    @Override
    public String getItem(int position)
    {
        return arr[position];
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.my_farhan_layout,parent,false);
        TextView t = convertView.findViewById(R.id.textView);
        t.setText(getItem(position));
        convertView.setOnClickListener(new View.OnClickListener()
        {     //ye tarika hai custom layout me listener lagane ka
            @Override
            public void onClick(View view)
            {
                Toast.makeText(context, "You CustomClick On : "+position, Toast.LENGTH_SHORT).show();
            }
        });
        return convertView;
    }
}
