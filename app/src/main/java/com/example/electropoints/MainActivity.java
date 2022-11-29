package com.example.electropoints;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView userName;
    TextView password;
    TextView noRegistrar;
    CheckBox remember;
    Button btnEmail;
    Button btnFacebook;
    Button btnCrear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userName = (TextView) findViewById(R.id.userName);
        password = (TextView) findViewById(R.id.password);
        noRegistrar = (TextView) findViewById(R.id.noRegistrar);
        remember = (CheckBox) findViewById(R.id.remember);
        btnEmail = (Button) findViewById(R.id.btnEmail);
        btnFacebook = (Button) findViewById(R.id.btnFacebook);
        btnCrear = (Button) findViewById(R.id.btnCrear);




    }
}