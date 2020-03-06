package com.ppgstore.classroutine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText logineditemail;
    private EditText logineditpass;
    private Button singinbtnid,signupid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        logineditemail=(EditText)findViewById(R.id.signinemail);
        logineditpass=(EditText)findViewById(R.id.signinpass);
        singinbtnid=(Button)findViewById(R.id.loginbtn);
        signupid=(Button)findViewById(R.id.register);

        signupid.setOnClickListener(this);
        singinbtnid.setOnClickListener(this);

        setContentView(R.layout.activity_main);
        //this.setTitle("Sign In Activity");
    }



    @Override
    public void onClick(View view) {

        switch (view.getId())
        {
            case R.id.loginbtn:

                break;

            case R.id.register:
                Intent intent= new Intent(getApplicationContext(), Signup.class);
                startActivity(intent);
                break;
        }

    }
}
