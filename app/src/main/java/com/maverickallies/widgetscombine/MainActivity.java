package com.maverickallies.widgetscombine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    EditText editText;
    Button button;
    ImageView imageView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView)findViewById(R.id.showNameTVID);
        editText = (EditText)findViewById(R.id.editTextID);
        button = (Button)findViewById(R.id.btnId);
        imageView = (ImageView)findViewById(R.id.imageViewID);
    }
    public void ShowName(View view){
        String nameStr = editText.getText().toString();
        if(nameStr.length()>0){
            textView.setText("Hey "+nameStr+" here is your profile picture.");
            imageView.setVisibility(view.VISIBLE);
        }
        else{
            imageView.setVisibility(view.INVISIBLE);
            textView.setVisibility(view.INVISIBLE);
            Toast.makeText(this, "Please enter a valid name.", Toast.LENGTH_SHORT).show();
        }
    }
    public void NextPage(View view){
        Intent intent = new Intent(this,SecondActivity.class);
        startActivity(intent);
    }
}