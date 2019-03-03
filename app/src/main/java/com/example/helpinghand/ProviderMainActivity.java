package com.example.helpinghand;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ProviderMainActivity extends AppCompatActivity {

    ArrayList<String> requestList = new ArrayList<String>();

    ListView lvTimes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_provider_main);

        lvTimes = findViewById(R.id.dynamic);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,requestLIst);
        lvTimes.setAdapter(arrayAdapter);

        lvTimes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                listing_page(position);
            }
        });
    }

    public void listing_page(int position) {

    }
}
