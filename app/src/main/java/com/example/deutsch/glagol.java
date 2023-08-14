package com.example.deutsch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class glagol extends AppCompatActivity {

    String Verba1[] = new String[]{
            "essen", "aß", "gegessen", "fahren", "fuhr", "gefahren", "heißen", "hieß", "geheißen",
            "fallen", "fiel", "gefallen", "geben", "gab", "gegeben", "halten", "hielt", "gehalten",
            "laufen", "lief", "gelaufen", "lesen", "las", "gelesen", "rufen", "rief", "gerufen",
            "wissen", "wusste", "gewusst", "befehlen", "befahl", "befohlen", "finden", "fand", "gefunden",
            "liegen", "lag", "gelegen", "treffen", "traf", "getroffen", "trinken", "trank", "getrunken",
            "singen", "sang", "gesungen", "sitzen", "saß", "gesessen", "nennen", "nannte", "genannt",
            "raten", "riet", "geraten"
    };
    //50 за каждый ответ буз помощи по два бала если с помощью то 1
    String Verba2[] = new String[]{
            "brennen", "brannte", "gebrannt", "reiten", "ritt", "geritten", "leihen", "lieh", "geliehen",
            "schließen", "schloß", "geschlossen", "laden", "lud", "geladen", "bekommen", "bekam", "bekommen",
            "vergessen", "vergaß", "vergessen", "treten", "trat", "getreten", "bieten", "bot", "geboten",
            "empfehlen", "empfahl", "empfohlen", "werfen", "warf", "geworfen", "bitten", "bat", "gebeten",
            "verbringen", "verbrachte", "verbracht", "schweigen", "schwieg", "geschwiegen", "leihen", "lieh", "geliehen",
            "klingen", "klang", "geklungen", "gewinnen", "gewann", "gewonnen", "werfen", "warf", "geworfen",
            "rennen", "rannte", "gerannt", "braten", "briet", "gebraten"
    };
    //

    A1 a1 = new A1();
    A2 a2 = new A2();

    Toast toast;
    TextView verb;
    TextView time;
    Button ChekWeiter;
    EditText editText;
    MainActivity m = new MainActivity();
    static String res;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glagol);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        verb = findViewById(R.id.Verb);
        time = findViewById(R.id.zeit);
        editText = (EditText) findViewById(R.id.message);
        ChekWeiter = (Button) findViewById(R.id.ButtonCheck);

        verbgeneration();
    }

    int temp, t;

    public void verbgeneration() {
        temp = (int) (Math.random() * 2);

        if (temp == 0)
            time.setText("in Präteritum");
        else if (temp == 1)
            time.setText("in Partizip II");

        if (m.in_a1) {
            t = (int) (Math.random() * ((Verba1.length) / 3));
            verb.setText(Verba1[t * 3] + " ");

            res = Verba1[t * 3 + temp + 1];
        } else if (m.in_a2) {
            t = (int) (Math.random() * ((Verba2.length) / 3));
            verb.setText(Verba2[t * 3] + " ");

            res = Verba2[t * 3 + temp + 1];
        }

    }

    public void check(View view) {

        if (ChekWeiter.getText() == "Weiter") {
            ChekWeiter.setText("Check");
            editText.setText("");
            editText.setBackgroundColor((ContextCompat.getColor(glagol.this, R.color.MistyRose)));
            verbgeneration();

        } else {
            if (m.in_a1 == true) {
                res = Verba1[t * 3 + temp + 1];
                if (editText.getText().toString().equalsIgnoreCase(res)) {
                    editText.setBackgroundColor((ContextCompat.getColor(glagol.this, R.color.PaleGreen)));
                    ChekWeiter.setText("Weiter");
                } else {
                    editText.setBackgroundColor((ContextCompat.getColor(glagol.this, R.color.Tomato)));
                }
            } else if (m.in_a2 == true) {

                res = Verba2[t * 3 + temp + 1];
                if (editText.getText().toString().equalsIgnoreCase(res)) {
                    editText.setBackgroundColor((ContextCompat.getColor(glagol.this, R.color.PaleGreen)));
                    ChekWeiter.setText("Weiter");
                } else {
                    editText.setBackgroundColor((ContextCompat.getColor(glagol.this, R.color.Tomato)));
                }
            }
        }
    }

    public void help(View view) {

        final AlertDialog aboutDialog = new AlertDialog.Builder(
                glagol.this).setMessage(res)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // TODO Auto-generated method stub
                    }
                }).create();

        aboutDialog.show();
    }

}