package com.pinup.pinup.view.activity.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.pinup.pinup.R;

public class PinUp extends AppCompatActivity implements View.OnClickListener {
    private String TAG ="PinUp";
    Button mButtonRegister,mButtonSinin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButtonRegister=(Button) findViewById(R.id.button_main_registration);
        mButtonSinin=(Button) findViewById(R.id.button_main_signin);
        mButtonRegister.setOnClickListener(this);
        mButtonSinin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.button_main_registration:

                getSupportFragmentManager().beginTransaction().replace(R.id.main_layout, Registration.newInstance()).addToBackStack(null).commit();

                break;
            case R.id.button_main_signin:
              //  SignIn in=new SignIn();
                getSupportFragmentManager().beginTransaction().replace(R.id.main_layout, SignIn.newInstance(getApplicationContext())).addToBackStack(null).commit();

                break;
            default:

                break;
        }
    }

}
