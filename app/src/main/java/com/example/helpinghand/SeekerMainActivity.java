package com.example.helpinghand;

import java.util.ArrayList;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class SeekerMainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.ihatethis.MESSAGE";

    //Allows for an expanding dynamic list on the screen
    ListView lvTimes;

    /*Array list used to store and pass/receive JobTitles to and from the FireBase database.
    The JobTitles Originate in the SeekerPostingActivity Screen.
    Ideally requestList would contain more information, like date and time.
     */
    ArrayList<String> requestList = new ArrayList<String>(); //ArrayList<TextView> requestList = new ArrayList<TextView>();

    //Used to access the SeekerPostingActivity screen via the MAKE POST button
    TextView seekerID;
    Button pButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seeker_main);

        //find the MAKE POST button
        pButton = findViewById(R.id.makePostButton);
        //when button is clicked call function to open SeekerPostingActivity screen
        pButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                post_activity();
            }
        });

        // Collect the Job Title from the List Posting and add it to the arrayList of postings for the main page
        Intent intent = getIntent();
        requestList.add(intent.getStringExtra(EXTRA_MESSAGE));

        lvTimes = findViewById(R.id.dynamic);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,requestList);
        lvTimes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });

        /* Capture the layout's TextView and set the string as its text
           Place holder for when requestList items can be passed to the FireBase Database
         */
        String jobTitle = intent.getStringExtra(EXTRA_MESSAGE);
        TextView textView = findViewById(R.id.textView);
        textView.setText(jobTitle);
    }

    public void post_activity() {
        //Passes the Seeker's ID to the SeekerPostingActivity screen - More a quality of life decision than a necessity
        Intent intent = new Intent(this, SeekerPostingActivity.class);
        seekerID = findViewById(R.id.seeker_ID);

        String message = seekerID.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
