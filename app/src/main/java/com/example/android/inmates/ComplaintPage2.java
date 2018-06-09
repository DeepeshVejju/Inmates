package com.example.android.inmates;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by Hi on 4/19/2018.
 */

public class ComplaintPage2 extends AppCompatActivity {
    EditText input_name2 ;
    EditText input_rollno2;
    EditText input_roomno ;
    EditText input_hostelno;
    EditText input_description;
    EditText input_availability;
    String name2;
    String rollno2 ;
    String roomno ;
    String hostelno ;
    String description;
    String availability;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complaint_page2);
        input_name2 = (EditText) findViewById(R.id.input_name2);
        input_rollno2 = (EditText) findViewById(R.id.input_rollno2);
        input_roomno = (EditText) findViewById(R.id.input_roomno);
        input_hostelno = (EditText) findViewById(R.id.input_hostelno);
        input_description = (EditText) findViewById(R.id.input_description);
        input_availability=(EditText) findViewById(R.id.input_availability);
        name2 = input_name2.toString();
        rollno2 = input_rollno2.toString();
        roomno = input_roomno.toString();
        hostelno = input_hostelno.toString();
        description = input_description.toString();
        availability=input_availability.toString();
        Button finalsubmit = (Button) findViewById(R.id.btn_finalsubmit);
        finalsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name2 = input_name2.getText().toString();
                rollno2 = input_rollno2.getText().toString();
                roomno = input_roomno.getText().toString();
                hostelno = input_hostelno.getText().toString();
                description = input_description.getText().toString();
                availability = input_availability.getText().toString();
                //Intent intent = new Intent(ComplaintPage.this,MessagePage.class);

                // startActivity(intent);



                final String  message= "Complaint-Form"+"\n"+"Complaint-Type-Carpenter"+"\n"+"Name-" + name2+ "\n" + "Roll-Number-" + rollno2 + "\n"+"Room-Number-"+ roomno +"\n"+ "Hostel-Number-" + hostelno +"\n"+"Description-" + description+"\n"+"Availability-" +availability;
                final String toArr = "vivek.alladi26@gmail.com";

                Toast.makeText(ComplaintPage2.this, "Your complaint has been registered.", Toast.LENGTH_LONG).show();
                Thread thread = new Thread() {
                    @Override
                    public void run() {

                        com.example.android.inmates.GMailSender sender = new com.example.android.inmates.GMailSender("vejjudeepesh1999@gmail.com", "8019739733");
                        try {
                            sender.sendMail("Complaint", message, "vejjudeepesh1999@gmail.com", toArr,"");

                        } catch (Exception e) {
                            e.printStackTrace();


                        }

                    }
                };
                thread.start();
            }
        });

    }


}