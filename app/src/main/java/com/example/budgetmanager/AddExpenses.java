package com.example.budgetmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Calendar;

public class AddExpenses extends AppCompatActivity implements DatePickerDialog.OnDateSetListener{
    private TextView dateText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_expenses);
        dateText = findViewById(R.id.textViewAddDate);
        findViewById(R.id.pick_add_date).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDatePickerDailog();
            }
        });
        Spinner mySpinner = (Spinner) findViewById(R.id.categories);
        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(AddExpenses.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.Categories));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);
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
}
