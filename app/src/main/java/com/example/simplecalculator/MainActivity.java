package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

//gonna right all the code here
//xml represents the front end
public class MainActivity extends AppCompatActivity {
    Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //function find id of button on screen
        // R represents list of all ressources that exists in application
        // sub class id, find id associated with button 1
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
    }
}