package com.maverickallies.widgetscombine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Rating;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class FourthActivity extends AppCompatActivity {
    TextView textView,ratingTextView ;
    Spinner spinner;
    RatingBar ratingBar;
    Button btnNext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        spinner = (Spinner)findViewById(R.id.basicSpinnerId);
        textView = (TextView)findViewById(R.id.countryTextViewId);
        ratingTextView = (TextView)findViewById(R.id.ratingTextViewId);
        ratingBar = (RatingBar)findViewById(R.id.basicRatingBar);
        btnNext = (Button)findViewById(R.id.btnFifthActivityId);


        String[] countryName = {"India","America","Russia","Australia","Burma","Spain","Italy"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,countryName);
        adapter.setDropDownViewResource(android.R.layout.simple_list_item_1);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedCountry = parent.getItemAtPosition(position).toString();
                textView.setText("You have selected : "+selectedCountry);
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ratingBar.setRating(5);
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                ratingTextView.setText("You have rated "+rating+" out of 5");
                Toast.makeText(FourthActivity.this, "Thanks for your valuable feedback.", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void FivthPage(View view){
        Intent intent = new Intent(this,FivthActivity.class);
        startActivity(intent);
    }


}