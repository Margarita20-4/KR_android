package com.example.pulse;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;



public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText year;
    EditText puls1;
    EditText puls2;
    Spinner pulseday;
    Spinner pulsemounth;
    Spinner pulsesex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        year = findViewById(R.id.year);
        puls1 = findViewById(R.id.pulse1);
        puls2 = findViewById(R.id.line8);
        pulseday = findViewById(R.id.day);
        pulsemounth = findViewById(R.id.mounth);
        pulsesex = findViewById(R.id.sexx);
        Button button_start = (Button) findViewById(R.id.start);
        button_start.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.start:
                Intent intent = new Intent(this, MainActivity2.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }




}