package com.example.budgetmanager;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import android.widget.ProgressBar;

import static android.graphics.Color.RED;

public class ViewExpenses extends AppCompatActivity {

    ProgressBar progressbarFood,progressbarHousehold,progressbarBills,progressbarClothing,progressbarTransport,progressbarOther;
    final int totalProgressTime = 100;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        progressbarFood = (ProgressBar)findViewById(R.id.progressbarFood);
        progressbarFood.setProgressTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorFood)));
        progressbarFood.setProgress(50);

        progressbarHousehold = (ProgressBar)findViewById(R.id.progressbarHousehold);
        progressbarHousehold.setProgressTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorHousehold)));
        progressbarHousehold.setProgress(90);

        progressbarBills = (ProgressBar)findViewById(R.id.progressbarBills);
        progressbarBills.setProgressTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorBills)));
        progressbarBills.setProgress(30);

        progressbarClothing = (ProgressBar)findViewById(R.id.progressbarClothing);
        progressbarClothing.setProgressTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorClothing)));
        progressbarClothing.setProgress(10);

        progressbarTransport = (ProgressBar)findViewById(R.id.progressbarTransport);
        progressbarTransport.setProgressTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorTransportation)));
        progressbarTransport.setProgress(50);

        progressbarOther = (ProgressBar)findViewById(R.id.progressbarOther);
        progressbarOther.setProgressTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorOther)));
        progressbarOther.setProgress(20);

    }



}