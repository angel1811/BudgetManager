package com.example.budgetmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegActivity extends AppCompatActivity {

    EditText edittextEmail, edittextPassword ,edittextConfirmPassword,edittextNoMembers;
    Button buttonRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);

        edittextEmail = findViewById(R.id.edittextEmail);
        edittextPassword = findViewById(R.id.edittextPassword);
        edittextConfirmPassword = findViewById(R.id.edittextConfirmPassword);
        edittextNoMembers = findViewById(R.id.edittextNoMembers);
        buttonRegister = findViewById(R.id.buttonRegister);


        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean successFlag= true; // true when all values entered correctly





                
            }
        });
    }
}