package com.maverickallies.widgetscombine;

 import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {
    Switch switchPhoto;
    ImageView imageView;
    SeekBar seekBar;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        switchPhoto = (Switch)findViewById(R.id.switchId);
        imageView = (ImageView)findViewById(R.id.switchImageViewID);
        seekBar = (SeekBar)findViewById(R.id.seekBarId);
        textView = (TextView)findViewById(R.id.seekValueTextViewId);


        switchPhoto.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    imageView.setVisibility(View.VISIBLE);
                }
                else {
                    imageView.setVisibility(View.INVISIBLE);
                }
            }
        });

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textView.setText("You rate this picture "+progress+" out of 100.");
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }

    public void FourthPage(View view){
        Intent intent = new Intent(this,FourthActivity.class);
        startActivity(intent);
    }

}