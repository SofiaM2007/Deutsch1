package com.example.deutsch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class A1 extends AppCompatActivity {
    public class MyDialogFragment extends DialogFragment {}

    MainActivity m;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a1);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        m=new MainActivity();
        m.in_a1=true;
        Resources resources = getResources();
    //    m.back= resources.getColor(R.color.springgreen);
     //   m.butt= resources.getColor(R.color.Lime);
     //   int textColor = resources.getColor(R.color.textViewFontColor);
      //  m.butt= ContextCompat.getColor(null, R.color.Lime);


    }

    public void go_to_artikel_aktivity(View view) {
        //CustomDialogFragment dialog = new CustomDialogFragment();
       // dialog.show(getSupportFragmentManager(), "custom");

        Intent intent = new Intent(this, ArtikelActivity.class); //Переход на активнось Store
        startActivity(intent);
    }


    public void go_to_padezh(View view) {
        Intent intent = new Intent(this, Padezh.class); //Переход на активнось Store
        startActivity(intent);
    }

/*
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Важное сообщение!")
                .setMessage("Покормите кота!")
                .setIcon(R.drawable.hungrycat)
                .setPositiveButton("ОК, иду на кухню", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // Закрываем диалоговое окно
                        dialog.cancel();
                    }
                });
        return builder.create();
    }
    */
}