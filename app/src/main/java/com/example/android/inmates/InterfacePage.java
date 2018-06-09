package com.example.android.inmates;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class InterfacePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interface_page);
        ImageButton imagebutton11 = (ImageButton) findViewById(R.id.ImageButton11);
        ImageButton imagebutton12 = (ImageButton) findViewById(R.id.ImageButton12);
        ImageButton imagebutton13 = (ImageButton) findViewById(R.id.ImageButton13);

        imagebutton11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(InterfacePage.this,AboutPage.class);
                startActivity(intent);
            }
        });
        imagebutton12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(InterfacePage.this,ListPage.class);
                startActivity(intent);
            }
        });
        imagebutton13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(InterfacePage.this,FeedbackPage.class);
                startActivity(intent);
            }
        });
    }
}
