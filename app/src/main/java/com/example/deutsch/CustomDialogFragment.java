package com.example.deutsch;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import androidx.annotation.NonNull;

public class CustomDialogFragment extends DialogFragment {
    int a = 50;
    A1 a1 = new A1();

        @NonNull


    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder=new AlertDialog.Builder(getActivity());
        return builder
        .setTitle("Leistung")
       // .setIcon(android.R.drawable.ic_dialog_alert)
        .setMessage("Du hast "+a +"% bestanden")
        .setPositiveButton("OK", null)
      //  .setNegativeButton("Отмена", null)
        .create();
    }


}
