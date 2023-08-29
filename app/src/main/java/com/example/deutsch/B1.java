package com.example.deutsch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;

public class B1 extends AppCompatActivity {
    MainActivity m;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b1);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        m=new MainActivity();
        m.in_b1=true;
        // m.back= ContextCompat.getColor(null, R.color.litegold);
        //m.butt= ContextCompat.getColor(null, R.color.gold);
    }

    public void go_to_artikel_aktivity(View view) {

        Intent intent = new Intent(this, ArtikelActivity.class);
        startActivity(intent);
    }
}