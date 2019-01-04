package com.bacaling.shsregistration;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        Intent intent = getIntent();

        String academic = intent.getStringExtra("ACADEMIC_PROGRAM");
        TextView displayAcademic = findViewById(R.id.tvAcaProg);
        displayAcademic.setText(academic);

        String displayLastName = intent.getStringExtra("LAST_NAME");
        String displayFirstName = intent.getStringExtra("FIRST_NAME");
        String displayMiddleName = intent.getStringExtra("MIDDLE_NAME");
        String displayUserFullName = displayFirstName + " " + displayMiddleName + " " + displayLastName;
        TextView displayFullName = findViewById(R.id.display_FullName);
        displayFullName.setText(displayUserFullName);

        String displayGender = intent.getStringExtra("GENDER");
        TextView dGender = findViewById(R.id.display_Gender);
        dGender.setText(displayGender);

        String Requirement = intent.getStringExtra("REQUIREMENT");
        TextView requirements = findViewById(R.id.displayRequirement);
        requirements.setText(Requirement);

    }
}
