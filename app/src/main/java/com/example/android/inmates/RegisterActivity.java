package com.example.android.inmates;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class RegisterActivity extends AppCompatActivity {
    private ProgressDialog progressDialog;
    private FirebaseAuth firebaseAuth;

    EditText input_name;
    EditText input_email1;
    EditText input_password1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        firebaseAuth = FirebaseAuth.getInstance();
      input_name=(EditText) findViewById(R.id.input_name);
        input_email1 = (EditText) findViewById(R.id.input_email1);
       input_password1 = (EditText) findViewById(R.id.input_password1);
        progressDialog = new ProgressDialog(this);

        Button btn_signup = (Button) findViewById(R.id.btn_signup);
        TextView already = (TextView) findViewById(R.id.link_login);

        btn_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Write Post Login Content Here
                createAccount(input_email1.getText().toString(), input_password1.getText().toString());

            }



        });
        already.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegisterActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }

    private void createAccount(String email,String password) {

        progressDialog.setMessage("Registering Please Wait...");
        progressDialog.show();
        //creating a new user
        firebaseAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        //checking if success
                        if(task.isSuccessful()){
                            finish();
                            startActivity(new Intent(getApplicationContext(), InterfacePage.class));
                        }else{
                            //display some message here

                                Toast.makeText(RegisterActivity.this,"Enter valid email id",Toast.LENGTH_LONG).show();


                        }
                        progressDialog.dismiss();
                    }
                });

        // [END create_user_with_email]
    }
}
