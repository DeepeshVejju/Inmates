package com.example.android.inmates;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class FeedbackPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback_page);
        EditText comments = (EditText) findViewById(R.id.comments);
        EditText suggestions = (EditText) findViewById(R.id.suggestions);
        String comment = comments.toString();
        String suggestion = suggestions.toString();
        Button feedsubmit = (Button) findViewById(R.id.btn_feedbacksubmit);
    }
}
