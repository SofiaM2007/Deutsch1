package com.example.deutsch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

import android.content.pm.ActivityInfo;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Padezh extends AppCompatActivity {

    TextView begin;
    TextView end;
    ConstraintLayout constraintlayout;

    String begwohin[]=new String[]{
        "Ich gehe ", "Du gehst ", "Er geht ", "Sie geht ", "Es geht ", "Wir gehen ", "Ihr geht", "Sie gehen ",
        "Ich fahre ", "Du fährst ", "Er fährt ", "Sie fährt ", "Es fährt ", "Wir fahren ", "Ihr fahrt", "Sie fahren "
    };
    String beghabe[]=new String[]{
            "Ich habe ", "Du hast ", "Er hat ", "Sie hat ", "Es hat ", "Wir haben ", "Ihr habt", "Sie haben "
    };
    String endwohin[]=new String[]{
            "2Stadt", "3Dorf"
    };
    String endhabe[]=new String[]{
            "3Bad", "1Schlüssel", "3Bett", "1Schrank", "3Sofa", "1Kühlschrank","1Tisch", "1Herd", "3Bild", "3Licht",
            "2Uhr", "3Hobby", "3Kino", "2Freizeit", "1Garten","3Buch", "2Zeitung", "3Lied", "1Film",
            "2Zigarette"
    };


    Button weiter;
    EditText editText;


    LinearLayout view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_padezh);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        editText = (EditText)findViewById(R.id.message);
        weiter = (Button)findViewById(R.id.check);

        begin = (TextView) findViewById(R.id.begin);
        end = (TextView)findViewById(R.id.end);
        weiter.setText("Prüfen");

        constraintlayout = findViewById(R.id.constraintlayout);


        satza1();
    }

    char art;



    static String wortnowb;
    static String wortnowe;
    static int indexb;
    static int indexe;
    ///static String res;


    public void satza1(){
        int t = (int)(Math.random()*2);
        if (t==0){

            indexb = (int)(Math.random()*16);
            wortnowb = begwohin[indexb];
            indexe = (int)(Math.random()*2);
            wortnowe = endwohin[indexe].substring(1);
            art= endwohin[indexe].charAt(0);
            begin.setText(wortnowb+"");
            end.setText(wortnowe+"");
        }
        else{

            indexb = (int)(Math.random()*8);
            wortnowb = beghabe[indexb];
            indexe = (int)(Math.random()*20);
            wortnowe = endhabe[indexe].substring(1);
            art= endhabe[indexe].charAt(0);
            begin.setText(wortnowb+"");
            end.setText(wortnowe+"");


        }

    }



    public void check(View view) {


        if(weiter.getText().toString().equals("Prüfen")) {
            String eingebenwort=editText.getText().toString();


            if (art == '1') {
                if (editText.getText().toString().equals("den")) {
                    weiter.setText("➛");
                    weiter.setTextSize(40);
                    constraintlayout.setBackgroundColor(ContextCompat.getColor(Padezh.this, R.color.springgreen));

                } else {
                    Toast.makeText(Padezh.this, "False", Toast.LENGTH_SHORT).show();
                    constraintlayout.setBackgroundColor(ContextCompat.getColor(Padezh.this, R.color.litered));
                }
            } else if (art == '2') {

                if (editText.getText().toString().equals("die")) {
                    weiter.setText("➛");
                    weiter.setTextSize(40);
                    constraintlayout.setBackgroundColor(ContextCompat.getColor(Padezh.this, R.color.springgreen));
                } else {
                    Toast.makeText(Padezh.this, "False", Toast.LENGTH_SHORT).show();
                    constraintlayout.setBackgroundColor(ContextCompat.getColor(Padezh.this, R.color.litered));
                }
            } else {
                if (editText.getText().toString().equals("das")) {
                    weiter.setText("➛");
                    weiter.setTextSize(40);
                    constraintlayout.setBackgroundColor(ContextCompat.getColor(Padezh.this, R.color.springgreen));
                } else {
                    Toast.makeText(Padezh.this, "False", Toast.LENGTH_SHORT).show();
                    constraintlayout.setBackgroundColor(ContextCompat.getColor(Padezh.this, R.color.litered));
                }
            }
        }
        else{
            weiter.setText("Prüfen");
            weiter.setTextSize(20);
            constraintlayout.setBackgroundColor(ContextCompat.getColor(Padezh.this, R.color.MistyRose));
            editText.setText("");
            satza1();
        }
    }
}