package com.ppgstore.classroutine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Signup extends AppCompatActivity{
    /*private EditText signUPemaill;
    private EditText signUppassw;
    private Button signupbtnid, signinnidd;*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /*signUPemaill=(EditText)findViewById(R.id.signupemail);
        signUppassw=(EditText)findViewById(R.id.signuppass);
        signupbtnid=(Button)findViewById(R.id.signupbtnid);
        signinnidd=(Button)findViewById(R.id.signinid);

        signupbtnid.setOnClickListener(this);
        signinnidd.setOnClickListener(this);*/

        setContentView(R.layout.activity_signup);
        //this.setTitle("Sign Up Activity");
    }
    /*@Override
    public void onClick(View view) {

        switch (view.getId())
        {
            case R.id.signupbtnid:

                break;

            case R.id.signinid:
                Intent intent2= new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent2);
                break;
        }

    }*/
}
