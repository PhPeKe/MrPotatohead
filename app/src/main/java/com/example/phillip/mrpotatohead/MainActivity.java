package com.example.phillip.mrpotatohead;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkClicked(View v) {
        Log.d(  "potato",  "checkClicked");
        CheckBox checkbox = (CheckBox) v;
        String boxid = checkbox.getText().toString();
        Log.d("potato", boxid);
        //ImageView image = findViewById(R.id.arms);
        switch(boxid) {
            case "arms":
                ImageView image = findViewById(R.id.arms);
                if (checkbox.isChecked()) {
                    image.setVisibility(View.VISIBLE);
                }
                else {
                    image.setVisibility(View.INVISIBLE);
                }
            break;

            case "hat":
                ImageView image2 = findViewById(R.id.hat);
                if (checkbox.isChecked()) {
                    image2.setVisibility(View.VISIBLE);
                }
                else {
                    image2.setVisibility(View.INVISIBLE);
                }
                break;

            case "glasses":
                ImageView image3 = findViewById(R.id.glasses);
                if (checkbox.isChecked()) {
                    image3.setVisibility(View.VISIBLE);
                }
                else {
                    image3.setVisibility(View.INVISIBLE);
                }
                break;

            case "mustache":
                ImageView image4 = findViewById(R.id.mustache);
                if (checkbox.isChecked()) {
                    image4.setVisibility(View.VISIBLE);
                }
                else {
                    image4.setVisibility(View.INVISIBLE);
                }
                break;

            case "shoes":
                ImageView image5 = findViewById(R.id.shoes);
                if (checkbox.isChecked()) {
                    image5.setVisibility(View.VISIBLE);
                }
                else {
                    image5.setVisibility(View.INVISIBLE);
                }
                break;

            case "ears":
                ImageView image10 = findViewById(R.id.ears);
                if (checkbox.isChecked()) {
                    image10.setVisibility(View.VISIBLE);
                }
                else {
                    image10.setVisibility(View.INVISIBLE);
                }
                break;

            case "nose":
                ImageView image6 = findViewById(R.id.nose);
                if (checkbox.isChecked()) {
                    image6.setVisibility(View.VISIBLE);
                }
                else {
                    image6.setVisibility(View.INVISIBLE);
                }
                break;

            case "mouth":
                ImageView image7 = findViewById(R.id.mouth);
                if (checkbox.isChecked()) {
                    image7.setVisibility(View.VISIBLE);
                }
                else {
                    image7.setVisibility(View.INVISIBLE);
                }
                break;

            case "eyebrows":
                ImageView image8 = findViewById(R.id.eyebrows);
                if (checkbox.isChecked()) {
                    image8.setVisibility(View.VISIBLE);
                }
                else {
                    image8.setVisibility(View.INVISIBLE);
                }
                break;

            case "eyes":
                ImageView image9 = findViewById(R.id.eyes);
                if (checkbox.isChecked()) {
                    image9.setVisibility(View.VISIBLE);
                }
                else {
                    image9.setVisibility(View.INVISIBLE);
                }
                break;

        }

    }
}
