package com.example.helpinghand;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SeekerPostingActivity extends AppCompatActivity {

    TextView seekerID, logo;
    EditText jobTitle, jobDescription, jobRequirements, date, time;
    Button pButton;

    boolean published = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seeker_posting);

        jobTitle = findViewById(R.id.title_input);
        jobDescription = findViewById(R.id.description_input);
        jobRequirements = findViewById(R.id.requirement_input);
        date = findViewById(R.id.date_input);
        time = findViewById(R.id.time_input);

        pButton = findViewById(R.id.postButton);

        pButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                main_page();
            }
        });

        Intent intent = getIntent();
        String message = intent.getStringExtra(SeekerMainActivity.EXTRA_MESSAGE);

        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.seeker_ID);
        textView.setText(message);


    }

    public void main_page() {
        Intent intent = new Intent(this, SeekerMainActivity.class);

        String message = jobTitle.getText().toString();
        intent.putExtra(SeekerMainActivity.EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
