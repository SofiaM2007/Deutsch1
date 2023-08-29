package com.example.deutsch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.pm.ActivityInfo;
import android.os.Handler;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class KeinNicht extends AppCompatActivity {

    String[] sentenses = {
            "Ich trinke keinen Kaffee.", "Er hat nicht viel Zeit.", "Wir essen kein Fleisch.", "Sie spricht nicht Deutsch.",
            "Du hast keine Hausaufgaben.", "Es regnet nicht.", "Ihr trinkt keinen Tee.", "Ich habe nicht viel Geld.",
            "Sie liest keine Zeitung.", "Er fährt nicht Auto.", "Er trinkt keinen Alkohol.", "Wir haben nicht viel Zeit.",
            "Sie isst kein Gemüse.", "Es schneit nicht.", "Ich habe keine Geschwister.", "Du hast nicht viel Erfahrung.",
            "Wir tragen keine Jacken.", "Sie kommt nicht zur Party.", "Er macht keine Fehler.", "Ihr habt nicht viel Glück.",
            "Du kaufst keine Schuhe.", "Es regnet nicht mehr.", "Ich esse kein Fleisch.", "Sie sagt nichts.",
            "Sie nimmt keine Medikamente.", "Er hat nicht viel Interesse.", "Wir trinken keine Milch.", "Du hast nicht viel Geduld.",
            "Er liest keine Bücher.", "Es gibt nichts zu essen.", "Ihr fahrt kein Auto.", "Sie hat nicht viel Vertrauen.",
            "Es gibt keine Probleme.", "Wir haben nicht viel Zeit.", "Er trägt keine Brille.", "Du bist nicht hier.",
            "Ich habe keinen Hunger.", "Sie hat nicht viel Erfahrung.", "Wir kaufen keine Geschenke.", "Es regnet nicht mehr.",
            "Du trinkst keinen Wein.", "Er hat nichts gesagt.", "Sie essen kein Eis.", "Ihr habt nicht viel Wissen.",
            "Er raucht nicht.", "Wir haben nicht viel Geld.", "Es gibt keine Lösung.", "Sie hat nicht viel Geduld.",
            "Ich trage keine Uhr.", "Du hast nichts verstanden.", "Wir nehmen keine Pausen.", "Es schneit nicht mehr.",
            "Er macht keine Fehler.", "Ihr habt nicht viel Glück.", "Sie trinkt keine Limonade.", "Es regnet nicht mehr.",
            "Du isst keine Pizza.", "Er hat nichts gesagt.", "Ich kaufe keine Süßigkeiten.", "Wir haben nicht viel Zeit.",
            "Wir machen keine Pläne.", "Sie hat nichts gehört.", "Er spielt kein Instrument.", "Ihr habt nicht viel Geduld.",
            "Es gibt keine Antwort.", "Du hast nichts gesagt.", "Ich esse keine Schokolade.", "Er hat nichts verloren.",
            "Wir tragen keine Hüte.", "Sie hat nicht viel Interesse.", "Sie trinkt keinen Tee.", "Ihr habt nichts gesehen.",
            "Es gibt keine Freizeit.", "Er hat nicht viel Erfahrung.", "Ich nehme keine Medikamente.", "Du hast nichts verstanden.",
            "Er liest keine Zeitung.", "Wir haben nicht viel Wissen.", "Wir kaufen keine Bücher.", "Sie hat nichts gehört.",
            "Du trinkst keine Milch.", "Es regnet nicht mehr.", "Sie essen kein Obst.", "Er hat nichts gesagt.",
            "Er trinkt keinen Kaffee.", "Ihr habt nicht viel Glück.", "Wir tragen keine Handschuhe.", "Es schneit nicht mehr.",
            "Ich esse kein Gemüse.", "Sie sagt nichts.", "Es gibt keine Möglichkeit.", "Du hast nichts verloren.",
            "Wir nehmen keine Fotos.", "Er hat nicht viel Zeit.", "Er macht keine Witze.", "Ihr habt nicht viel Geduld.",
            "Du kaufst keine Kleidung.", "Es regnet nicht mehr.", "Ich trage keine Sonnenbrille.", "Sie hat nichts gesagt.",
            "Sie essen keine Suppe.", "Wir haben nicht viel Wissen.", "Er fährt keinen Bus.", "Es schneit nicht mehr.",
            "Es gibt keine Hoffnung.", "Du hast nichts gesehen.", "Ich trinke keine Limonade.", "Er hat nichts verstanden.",
            "Wir essen keine Pizza.", "Sie hat nichts gehört.", "Er spielt keinen Sport.", "Ihr habt nicht viel Glück.",
            "Sie trinkt keinen Wein.", "Es regnet nicht mehr.", "Wir nehmen keine Geschenke.", "Er hat nicht viel Geduld.",
            "Es gibt keine Antwort.", "Du hast nichts gesagt.", "Ich esse keine Schokolade.", "Wir haben nicht viel Wissen.",
            "Wir tragen keine Hüte.", "Sie hat nichts verstanden.", "Er trinkt keinen Tee.", "Ihr habt nicht viel Glück.",
            "Es gibt keine Freizeit.", "Er hat nichts gesagt.", "Ich nehme keine Medikamente.", "Du hast nicht viel Zeit.",
            "Sie liest keine Zeitung.", "Sie hat nichts gehört.", "Ich trinke keine Milch.", "Wir haben nicht viel Wissen.",
            "Wir essen keine Suppe.", "Es regnet nicht mehr.", "Du isst kein Gemüse.", "Er hat nichts verstanden.",
            "Er spielt kein Instrument.", "Ihr habt nicht viel Geduld.", "Es gibt keine Hoffnung.", "Du hast nicht viel Zeit.",
            "Ich trage keine Sonnenbrille.", "Sie hat nichts gehört.", "Er trinkt keinen Kaffee.", "Er hat nichts gesagt.",
            "Wir essen keine Pizza.", "Wir haben nicht viel Wissen.", "Sie trinkt keinen Wein.", "Es schneit nicht mehr.",
            "Es gibt keine Lösung.", "Du hast nichts verstanden.", "Ich trinke keine Limonade.", "Sie hat nicht viel Erfahrung.",
            "Wir essen keine Schokolade.", "Ihr habt nicht viel Geduld.", "Er spielt keinen Sport.", "Es regnet nicht mehr.",
            "Es gibt keine Möglichkeit.", "Er hat nichts gesagt.", "Ich trage keine Uhr.", "Sie hat nicht viel Zeit.",
            "Wir nehmen keine Pausen.", "Du hast nicht viel Geduld.", "Er macht keine Witze.", "Wir haben nicht viel Wissen.",
            "Sie trinkt keinen Tee.", "Es schneit nicht mehr.", "Es gibt keine Probleme.", "Ihr habt nicht viel Glück.",
            "Ich esse keine Schokolade.", "Du hast nichts verstanden.", "Wir tragen keine Hüte.", "Er hat nicht viel Zeit.",
            "Er trinkt keinen Kaffee.", "Sie hat nichts gesagt.", "Sie essen kein Obst.", "Es regnet nicht mehr.",
            "Ich trage keine Sonnenbrille.", "Wir haben nicht viel Wissen.", "Er spielt keinen Sport.", "Ihr habt nichts gehört.",
            "Es gibt keine Freizeit.", "Du hast nicht viel Zeit.", "Wir nehmen keine Medikamente.", "Sie hat nichts gesagt.",
            "Ich trinke keine Milch.", "Es schneit nicht mehr.", "Er macht keine Fehler.", "Wir haben nicht viel Glück.",
            "Sie trinkt keinen Wein.", "Du hast nichts verstanden.", "Ich trage keine Uhr.", "Er hat nichts gesagt.",
            "Wir essen keine Pizza.", "Es gibt keine Lösung.", "Es gibt keine Möglichkeit.", "Sie hat nichts gehört.",
            "Ich kaufe keine Süßigkeiten.", "Wir haben nicht viel Wissen.", "Sie isst kein Gemüse.", "Du hast nichts verstanden."
    };

    String[] haben = {"habe", "hast", "hat", "haben", "habt", "haben"};
    String[] sein = {"bin", "bist", "ist", "sind", "seid", "sind"};

    String[] words;
    private TextView questionTextView;
    private Button keinButton;
    private Button nichtButton;

    private int randomIndex;
    private String correctAnswer, myAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kein_nicht);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        questionTextView = findViewById(R.id.questionTextView);
        keinButton = findViewById(R.id.keinButton);
        nichtButton = findViewById(R.id.nichtButton);
        resetQuestion();
    }

    public void checkAnswer(View view) {
        Button selectedButton = (Button) view;
        if (selectedButton.getId() == R.id.keinButton) {
            myAnswer = (String)keinButton.getText();
        } else if (selectedButton.getId() == R.id.nichtButton) {
            myAnswer = (String)nichtButton.getText();
        }

        if (words[2].equals(myAnswer)) {
            selectedButton.setBackgroundColor(ContextCompat.getColor(KeinNicht.this, R.color.LimeGreen));
        } else {
            selectedButton.setBackgroundColor(ContextCompat.getColor(KeinNicht.this, R.color.lightDarkRed));
            System.out.println(myAnswer+" "+correctAnswer);
        }
        // ждёт 2 секунды
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                resetQuestion();
            }
        }, 1000);
        //resetQuestion();
    }

    private void resetQuestion() {
        randomIndex = (int) (Math.random() * sentenses.length);
        words = sentenses[randomIndex].split(" ");
        correctAnswer=words[2];
        System.out.println(correctAnswer);
       // words[2]=null;

        if(words[2].equals("nicht") || words[2].equals("nichts")){
            keinButton.setText("kein");
            nichtButton.setText(correctAnswer);
        }
        else{
            keinButton.setText(correctAnswer);
            nichtButton.setText("nicht");
        }

        questionTextView.setText(words[0] + " "  + words[1] + " ____ ");
        for(int i = 3; i < words.length; i++){
            questionTextView.setText(questionTextView.getText()+ " " +words[i]);
        }

        keinButton.setBackgroundColor(getResources().getColor(R.color.DarkViolet));
        nichtButton.setBackgroundColor(getResources().getColor(R.color.DarkViolet));
    }

}