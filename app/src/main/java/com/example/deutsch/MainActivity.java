package com.example.deutsch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    public static boolean in_a1 = false;
    public static boolean in_a2 = false;
    public static boolean in_b1 = false;
    public static boolean in_b2 = false;
    public static boolean in_c1 = false;
    public static boolean in_c2 = false;

    public static int back;
    public static int butt;


    Button a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }

    public void go_to_A1_main(View view) {
        in_a1 = true;
        in_a2 = false;
        in_b1 = false;
        in_b2 = false;
        in_c1 = false;
        in_c2 = false;
        System.out.println("GO to A1");
        Intent intent = new Intent(this, A1.class); //Переход на активнось a1
        startActivity(intent);

    }
    public void go_to_A2_main(View view) {
        in_a1 = false;
        in_a2 = true;
        in_b1 = false;
        in_b2 = false;
        in_c1 = false;
        in_c2 = false;
        System.out.println("GO to A2");
        Intent intent = new Intent(this, A2.class); //Переход на активнось a2
        startActivity(intent);

    }
    public void go_to_B1_main(View view) {
        in_a1 = false;
        in_a2 = false;
        in_b1 = true;
        in_b2 = false;
        in_c1 = false;
        in_c2 = false;
        Intent intent = new Intent(this, B1.class); //Переход на активнось b1
        startActivity(intent);

    }
    public void go_to_B2_main(View view) {
        in_a1 = false;
        in_a2 = false;
        in_b1 = false;
        in_b2 = true;
        in_c1 = false;
        in_c2 = false;
        Intent intent = new Intent(this, B2.class); //Переход на активнось b2
        startActivity(intent);

    }
    public void go_to_C1_main(View view) {
        in_a1 = false;
        in_a2 = false;
        in_b1 = false;
        in_b2 = false;
        in_c1 = true;
        in_c2 = false;
        Intent intent = new Intent(this, C1.class); //Переход на активнось c1
        startActivity(intent);

    }
    public void go_to_C2_main(View view) {
        in_a1 = false;
        in_a2 = false;
        in_b1 = false;
        in_b2 = false;
        in_c1 = false;
        in_c2 = true;
        Intent intent = new Intent(this, C2.class); //Переход на активнось c2
        startActivity(intent);
    }
}