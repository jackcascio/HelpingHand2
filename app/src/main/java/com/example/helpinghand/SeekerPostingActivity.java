package com.example.helpinghand;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SeekerPostingActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.HELPINGHAND.MESSAGE";
    TextView seekerID, logo;
    EditText jobTitle, jobDescription, jobRequirements, date, time;
    Button pButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seeker_posting);

        jobTitle = findViewById(R.id.title_input);
        jobDescription = findViewById(R.id.description_input);
        jobRequirements = findViewById(R.id.requirement_input);
        date = findViewById(R.id.date_input);
        time = findViewById(R.id.title_input);

        pButton = findViewById(R.id.postButton);

        pButton.setOnClickListener((v) );
    }
}
