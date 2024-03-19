package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnEnter;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt = (TextView)findViewById(R.id.textView2);
        btnEnter = (Button)findViewById(R.id.button);

        btnEnter.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                txt.setText("Welcome to DFP50293!");
            }
        });
    }
}