package com.example.android.inmates;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ListPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_page);
        ImageButton imagebutton1 = (ImageButton) findViewById(R.id.ImageButton01);
        ImageButton imagebutton2 = (ImageButton) findViewById(R.id.ImageButton02);
        ImageButton imagebutton3 = (ImageButton) findViewById(R.id.ImageButton03);
        ImageButton imagebutton4 = (ImageButton) findViewById(R.id.ImageButton04);
        ImageButton imagebutton5 = (ImageButton) findViewById(R.id.ImageButton05);
        ImageButton imagebutton6 = (ImageButton) findViewById(R.id.ImageButton06);
        ImageButton imagebutton7 = (ImageButton) findViewById(R.id.ImageButton07);
        ImageButton imagebutton8 = (ImageButton) findViewById(R.id.ImageButton08);
        ImageButton imagebutton9 = (ImageButton) findViewById(R.id.ImageButton09);
        ImageButton imagebutton10 = (ImageButton) findViewById(R.id.ImageButton10);
        ImageButton imagebutton11 = (ImageButton) findViewById(R.id.ImageButton11);
        ImageButton imagebutton12 = (ImageButton) findViewById(R.id.ImageButton12);

        imagebutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListPage.this,ComplaintPage.class);
                startActivity(intent);
            }
        });
        imagebutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListPage.this,ComplaintPage2.class);
                startActivity(intent);
            }
        });
        imagebutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListPage.this,ComplaintPage3.class);
                startActivity(intent);
            }
        });
        imagebutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListPage.this,ComplaintPage4.class);
                startActivity(intent);
            }
        });
        imagebutton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListPage.this,ComplaintPage5.class);
                startActivity(intent);
            }
        });
        imagebutton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListPage.this,ComplaintPage6.class);
                startActivity(intent);
            }
        });
        imagebutton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListPage.this,ComplaintPage7.class);
                startActivity(intent);
            }
        });
        imagebutton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListPage.this,ComplaintPage8.class);
                startActivity(intent);
            }
        });
        imagebutton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListPage.this,ComplaintPage9.class);
                startActivity(intent);
            }
        });
        imagebutton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListPage.this,ComplaintPage10.class);
                startActivity(intent);
            }
        });
        imagebutton11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListPage.this,ComplaintPage11.class);
                startActivity(intent);
            }
        });
        imagebutton12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListPage.this,ComplaintPage12.class);
                startActivity(intent);
            }
        });
       
    }
}
