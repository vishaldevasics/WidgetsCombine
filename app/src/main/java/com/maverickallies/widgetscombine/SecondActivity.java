package com.maverickallies.widgetscombine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
    public void SubmitForm(View view){
        CheckBox checkBox = (CheckBox)findViewById(R.id.checkboxID);
        Button button = (Button)findViewById(R.id.btnSubmitID);

        boolean isChecked = checkBox.isChecked();
        if(isChecked){
            Toast.makeText(this, "Your form has been submitted..!", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "Please agree to our terms and condition to submit the form.", Toast.LENGTH_SHORT).show();
        }
    }
}