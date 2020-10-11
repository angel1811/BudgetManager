package com.example.budgetmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

public class SetBudget extends AppCompatActivity implements DatePickerDialog.OnDateSetListener{
    private TextView dateText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_budget);
        dateText = findViewById(R.id.textViewDate);
        findViewById(R.id.pick_date_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               showDatePickerDailog();
            }
        });
    }
    private void showDatePickerDailog(){
        DatePickerDialog datePickerDialog = new DatePickerDialog(
                this,
                this,
                Calendar.getInstance().get(Calendar.YEAR),
                Calendar.getInstance().get(Calendar.MONTH),
                Calendar.getInstance().get(Calendar.DAY_OF_MONTH)
        );
        datePickerDialog.show();
    }

    @Override
    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
        String date = "day/month/year: " + i2 + "/"  + i1 + "/"  + i ;
        dateText.setText(date);
    }
    public void btn_add(View view) {
        startActivity(new Intent(getApplicationContext(),AddExpenses.class));
    }
}