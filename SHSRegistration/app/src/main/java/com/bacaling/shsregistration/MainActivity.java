package com.bacaling.shsregistration;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void SUBMIT(View view) {

        Intent intent = new Intent(this, DisplayActivity.class);

        Spinner academicProg = findViewById(R.id.spnr);
        String academic = academicProg.getSelectedItem().toString();
        intent.putExtra("ACADEMIC_PROGRAM", academic);

        EditText lastName = findViewById(R.id.etLName);
        String userLastName = lastName.getText().toString();
        intent.putExtra("LAST_NAME", userLastName);

        EditText firstName = findViewById(R.id.etFName);
        String userFirstName = firstName.getText().toString();
        intent.putExtra("FIRST_NAME", userFirstName);

        EditText middleName = findViewById(R.id.etMName);
        String userMiddleName = middleName.getText().toString();
        intent.putExtra("MIDDLE_NAME", userMiddleName);

        RadioButton maleGender = findViewById(R.id.rbMale);
        RadioButton femaleGender = findViewById(R.id.rbFemale);
        String userGender;
        if (maleGender.isChecked())
        {
            userGender = "Male";
        }
        else
        {
            userGender = "Female";
        }
        intent.putExtra("GENDER", userGender);

        CheckBox reportCard = findViewById(R.id.cb_first);
        CheckBox birthCertificate = findViewById(R.id.cb_second);
        CheckBox goodMoral = findViewById(R.id.cb_third);
        CheckBox certificateJuniorHigh = findViewById(R.id.cb_fourth);
        String requirement = "userRequirement";

        if (reportCard.isChecked())
        {
            requirement = reportCard.getText().toString() + "\n";
        }
        if (birthCertificate.isChecked())
        {
            requirement += birthCertificate.getText().toString() + "\n";
        }
        if (goodMoral.isChecked())
        {
            requirement += goodMoral.getText().toString() + "\n";
        }
        if (certificateJuniorHigh.isChecked())
        {
            requirement += certificateJuniorHigh.getText().toString() + "\n";
        }
        intent.putExtra("REQUIREMENT" , requirement);

        startActivity(intent);
    }
}

