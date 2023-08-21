package com.example.deutsch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;

public class A1 extends AppCompatActivity {


    public class MyDialogFragment extends DialogFragment {}

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

    public void go_to_artikel_aktivity(View view) {

        Intent intent = new Intent(this, ArtikelActivity.class); //Переход на активнось Store
        startActivity(intent);
    }


    public void go_to_padezh(View view) {
        Intent intent = new Intent(this, Padezh.class); //Переход на активнось Store
        startActivity(intent);
    }

    public void go_to_glagaktivity(View view) {
        Intent intent = new Intent(this, glagol.class); //Переход на активнось Store
        startActivity(intent);
    }

    public void go_to_reifolge_aktivity(View view) {
        Intent intent = new Intent(this, ReinfolgeActivity.class); //Переход на активнось Store
        startActivity(intent);
    }

}