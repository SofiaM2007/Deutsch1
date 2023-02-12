package com.example.deutsch;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class glagol extends AppCompatActivity {

    String Verba1[]=new String[]{
            "essen", "aß", "gegessen", "fahren", "fuhr", "gefahren", "heißen", "hieß", "geheißen",
            "fallen", "fiel", "gefallen", "geben", "gab", "gegeben", "halten", "hielt", "gehalten",
            "laufen", "lief", "gelaufen", "lesen", "las", "gelesen", "rufen", "rief", "gerufen",
            "wachsen", "wuchs", "gewachsen", "bleiben", "blieb", "geblieben", "denken", "dachte", "gedacht",
            "fliegen", "flog", "geflogen", "kennen", "kannte", "gekannt", "tun", "tat", "getan",
            "wissen", "wusste", "gewusst", "befehlen", "befahl", "befohlen", "finden", "fand", "gefunden",
            "liegen", "lag", "gelegen", "treffen", "traf", "getroffen", "trinken", "trank", "getrunken",
            "singen", "sang", "gesungen", "sitzen", "saß", "gesessen", "nennen", "nannte", "genannt",
            "raten", "riet", "geraten"
    };

    String Verba2[]=new String[]{
            "brennen", "brannte", "gebrannt", "reiten", "ritt", "geritten", "leihen", "lieh", "geliehen",
            "schließen", "schloß", "geschlossen", "laden", "lud", "geladen", "bekommen", "bekam", "bekommen",
            "vergessen", "vergaß", "vergessen", "treten", "trat", "getreten", "bieten", "bot", "geboten",
            "empfehlen", "empfahl", "empfohlen", "werfen", "warf", "geworfen", "bitten", "bat", "gebeten",
            "verbringen", "verbrachte", "verbracht", "schweigen", "schwieg", "geschwiegen", "leihen", "lieh", "geliehen",
            "klingen", "klang", "geklungen", "gewinnen", "gewann", "gewonnen", "werfen", "warf", "geworfen",
            "rennen", "rannte", "gerannt", "braten", "briet", "gebraten"
    };

    A1 a1=new A1();
    A2 a2=new A2();

    String verbnow;
    TextView verb;
    TextView time;
    EditText editText;
    MainActivity m = new MainActivity();

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glagol);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        verb = findViewById(R.id.Verb);
        time = findViewById(R.id.zeit);
        editText = (EditText)findViewById(R.id.message);

        verbgeneration();
    }
    int temp, t;
    public void verbgeneration() {
        if(m.in_a1){
            t = (int)(Math.random()*((Verba1.length)/3));
            verb.setText(Verba1[t*3]+" ");
        }
        else if(m.in_a2){
            t = (int)(Math.random()*((Verba2.length)/3));
            verb.setText(Verba2[t*3]+" ");
        }
        temp=(int)(Math.random());
        if(temp==0)
            time.setText("in Präteritum");
        else if(temp==1)
            time.setText("in Partizip II");
    }

    public void check(View view) {
        if(m.in_a1==true) {
            if (editText.getText().toString().equals(Verba1[t*3+temp+1])) {
                verb.setText(" ");
            }
        }
        else if(m.in_a2==true){
            if (editText.getText().toString().equals("" + Verba2[t*3+temp+1])) {

            }
        }
    }

    public void help(View view) {
    }
}