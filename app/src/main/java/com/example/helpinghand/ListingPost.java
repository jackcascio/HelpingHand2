package com.example.helpinghand;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ListingPost extends AppCompatActivity {

    TextView jobDescription, jobTime, jobDate, load;
    Button aButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listing_post);

        jobDescription = findViewById(R.id.jobDescription);
        jobDate = findViewById(R.id.jobDate);
        jobTime = findViewById(R.id.jobTIme);

        aButton = findViewById(R.id.postButton);

        aButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                accept_Listing();
            }
        });
    }

    public void accept_Listing() {

    }
}
