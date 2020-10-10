package com.example.budgetmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Log_RegActivity extends AppCompatActivity {

    Button log,reg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log__reg);

        log = (Button)findViewById(R.id.log);
        reg = (Button)findViewById(R.id.reg);

        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                log.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                Intent intent = new Intent(Log_RegActivity.this,LogInActivity.class);
                startActivity(intent);
            }
        });

        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reg.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                Intent intent = new Intent(Log_RegActivity.this,RegActivity.class);
                startActivity(intent);
            }
        });

    }
}