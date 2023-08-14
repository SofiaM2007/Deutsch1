package com.example.deutsch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class A2 extends AppCompatActivity {
    MainActivity m;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        Log.d("In A2", "In A2");
        setContentView(R.layout.activity_a2);
        Log.d("In A2", "In A2");
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        m=new MainActivity();
        Log.d("In A2", "In A2");
        m.in_a2=true;
        //m.back= ContextCompat.getColor(null, R.color.GreenYellowLite);
       // m.butt= ContextCompat.getColor(null, R.color.ForestGreen);
    }

    public void go_to_artikel_aktivity(View view) {

        Intent intent = new Intent(this, ArtikelActivity.class);
        startActivity(intent);
    }

    public void go_to_glagaktivity(View view) {
        Intent intent = new Intent(this, glagol.class);
        startActivity(intent);
    }
}