package com.maverickallies.widgetscombine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    String myGender = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        RadioGroup radioGroup = (RadioGroup)findViewById(R.id.radioGroupId);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radioButton = (RadioButton)findViewById(checkedId);
                if(radioButton!=null){
                    myGender = radioButton.getText().toString();
                }
            }
        });


    }
    public void SubmitForm(View view){
        CheckBox checkBox = (CheckBox)findViewById(R.id.checkboxID);
        Button button = (Button)findViewById(R.id.btnSubmitID);
        if(myGender.equals("")){
            Toast.makeText(this,"Please enter your Gender.",Toast.LENGTH_SHORT).show();
            return;
        }
        else{
            Toast.makeText(this, "You have selected "+myGender, Toast.LENGTH_SHORT).show();
        }

        boolean isChecked = checkBox.isChecked();
        if(isChecked){
            Toast.makeText(this, "Your form has been submitted..!", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "Please agree to our terms and condition to submit the form.", Toast.LENGTH_SHORT).show();
        }
    }

    public void ThirdPage(View view){
        Intent intent = new Intent(this,ThirdActivity.class);
        startActivity(intent);
    }

}