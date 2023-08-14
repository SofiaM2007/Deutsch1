package com.example.deutsch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;

public class C2 extends AppCompatActivity {

    MainActivity m;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c2);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        m=new MainActivity();
        m.in_c2=true;
       // m.back= ContextCompat.getColor(null, R.color.litered);
      //  m.butt= ContextCompat.getColor(null, R.color.red);
    }

    public void go_to_artikel_aktivity(View view) {

        Intent intent = new Intent(this, ArtikelActivity.class);
        startActivity(intent);
    }
}