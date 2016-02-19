package com.example.ajay.teamexe;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Description extends AppCompatActivity {
    TextView text_title;
    TextView text_tagline;
    TextView text_coordinator;
    TextView text_content;
    TextView text_contact;
    ImageView event_image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*this is something i don't know*/
        event_image= (ImageView) findViewById(R.id.event_image);
        text_title = (TextView) findViewById(R.id.event_title);
        text_tagline = (TextView) findViewById(R.id.event_tagline);
        text_content = (TextView) findViewById(R.id.event_detail);
        text_coordinator = (TextView) findViewById(R.id.event_coordinator);
        text_contact= (TextView) findViewById(R.id.text_contact);

        /* i don't know about this either*/
        Intent in = this.getIntent();
        String title = in.getStringExtra("title");
        String tagline = in.getStringExtra("tagline");
        String coordinator = in.getStringExtra("coordinator");
        String content = in.getStringExtra("content");
        int number = in.getIntExtra("number", 0);
        switch (number){
            case 0:
                event_image.setImageResource(R.drawable.real);
                text_contact.setTextColor(Color.parseColor("#000000"));
                text_title.setTextColor(Color.parseColor("#000000"));
                break;
            case 1:
                event_image.setImageResource(R.drawable.real);
                text_content.setTextColor(Color.parseColor("#000000"));
                text_coordinator.setTextColor(Color.parseColor("#000000"));
                text_contact.setTextColor(Color.parseColor("#000000"));
                text_title.setTextColor(Color.parseColor("#000000"));
                break;
            case 2:
                event_image.setImageResource(R.drawable.real);
                text_contact.setTextColor(Color.parseColor("#000000"));
                text_title.setTextColor(Color.parseColor("#000000"));

                break;
        }

/* this bit sets title content and names of coordinator*/
        text_title.setText(title);
        text_tagline.setText(tagline);
        text_content.setText(content);
        text_coordinator.setText(coordinator);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
