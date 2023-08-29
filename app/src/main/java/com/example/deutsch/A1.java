package com.example.deutsch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;

public class A1 extends AppCompatActivity {
    MainActivity m;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        System.out.println("In A1");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a1);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        m=new MainActivity();
        m.in_a1=true;

    }
    public void go_to_plurale(View view) {
        Intent intent = new Intent(this, Plural.class); //Переход на активнось Plural
        startActivity(intent);
    }
    public void go_to_artikel_aktivity(View view) {

        Intent intent = new Intent(this, ArtikelActivity.class); //Переход на активнось ArtikelActivity
        startActivity(intent);
    }


    public void go_to_padezh(View view) {
        Intent intent = new Intent(this, Padezh.class); //Переход на активнось Padezh
        startActivity(intent);
    }

    public void go_to_glagaktivity(View view) {
        Intent intent = new Intent(this, glagol.class); //Переход на активнось glagol
        startActivity(intent);
    }

    public void go_to_reifolge_aktivity(View view) {
        Intent intent = new Intent(this, ReinfolgeActivity.class); //Переход на активнось ReinfolgeActivity
        startActivity(intent);
    }

    public void go_to_haben_sein_aktivity(View view) {
        Intent intent = new Intent(this, HabenSein.class); //Переход на активнось HabenSein
        startActivity(intent);
    }

    public void go_to_kein_nicht_aktivity(View view) {
        Intent intent = new Intent(this, KeinNicht.class); //Переход на активнось KeinNicht
        startActivity(intent);
    }
}