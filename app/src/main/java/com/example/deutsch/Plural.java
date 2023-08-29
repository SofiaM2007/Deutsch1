package com.example.deutsch;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import android.content.pm.ActivityInfo;

public class Plural extends AppCompatActivity {

    String[] nouns = {"der Tisch, die Tische", "das Buch, die Bücher", "die Lampe, die Lampen", "die Katze, die Katzen", "der Hund, die Hunde", "der Stuhl, die Stühle", "die Blume, die Blumen", "das Haus, die Häuser", "die Uhr, die Uhren", "der Ball, die Bälle", "der Apfel, die Äpfel", "die Orange, die Orangen", "die Banane, die Bananen", "die Tomate, die Tomaten", "das Wasser, die Wasser", "der Saft, die Säfte", "die Milch, die Milchen", "der Kaffee, die Kaffees", "die Tasse, die Tassen", "das Glas, die Gläser", "die Hand, die Hände", "der Kopf, die Köpfe", "das Auge, die Augen", "die Nase, die Nasen", "der Mund, die Münder", "das Ohr, die Ohren", "der Zahn, die Zähne", "das Haar, die Haare", "der Arm, die Arme", "das Bein, die Beine", "der Fuß, die Füße", "der Finger, die Finger", "die Handtasche, die Handtaschen", "der Hut, die Hüte", "die Jacke, die Jacken", "das Hemd, die Hemden", "die Hose, die Hosen", "der Rock, die Röcke", "der Schuh, die Schuhe", "der Regenschirm, die Regenschirme", "das Auto, die Autos", "der Bus, die Busse", "die Straße, die Straßen", "der Baum, die Bäume", "die Blume, die Blumen", "der Wald, die Wälder", "der Fluss, die Flüsse", "der See, die Seen", "das Meer, die Meere", "der Himmel, die Himmel", "die Sonne, die Sonnen", "der Mond, die Monde", "der Stern, die Sterne", "die Wolke, die Wolken", "das Wetter, die Wetter", "die Jahreszeit, die Jahreszeiten", "der Frühling, die Frühlinge", "der Sommer, die Sommer", "der Herbst, die Herbste", "der Winter, die Winter", "der Monat, die Monate", "das Jahr, die Jahre", "die Woche, die Wochen", "der Tag, die Tage", "die Nacht, die Nächte", "der Morgen, die Morgen", "der Abend, die Abende", "das Frühstück, die Frühstücke", "das Mittagessen, die Mittagessen", "das Abendessen, die Abendessen", "das Brot, die Brote", "die Butter, die Butter", "der Käse, die Käse", "die Wurst, die Würste", "das Ei, die Eier", "die Suppe, die Suppen", "der Salat, die Salate", "die Kartoffel, die Kartoffeln", "das Fleisch, die Fleisch", "der Fisch, die Fische", "das Gemüse, die Gemüse", "die Frucht, die Früchte", "die Zitrone, die Zitronen", "die Orange, die Orangen", "die Birne, die Birnen", "die Erdbeere, die Erdbeeren", "die Aprikose, die Aprikosen", "die Himbeere, die Himbeeren", "die Pflaume, die Pflaumen", "die Kirsche, die Kirschen", "die Schokolade, die Schokoladen", "das Eis, die Eis", "der Kuchen, die Kuchen", "der Zucker, die Zucker", "das Salz, die Salze", "die Milch, die Milchen", "der Tee, die Tees", "der Kaffee, die Kaffees", "das Wasser, die Wasser", "der Saft, die Säfte"};
    String[] words;
    private TextView questionTextView;
    private EditText answerEditText;
    private String currentNoun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plural);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        questionTextView = findViewById(R.id.questionTextView);
        answerEditText = findViewById(R.id.answerEditText);

        showNextQuestion();
    }

    private void showNextQuestion() {
        int randomIndex = (int) (Math.random() * nouns.length);
        words = nouns[randomIndex].split(", ");
        currentNoun = words[0];

        questionTextView.setText(currentNoun);
        answerEditText.setText("");
    }

    public void checkAnswer(View view) {
        String userAnswer = answerEditText.getText().toString().trim();
        String expectedAnswer = words[1];

        if (userAnswer.equalsIgnoreCase(expectedAnswer)) {
            Toast.makeText(this, "Richtig!", Toast.LENGTH_SHORT).show();
            showNextQuestion();
        }
        else {
            if(expectedAnswer.charAt(0)=='d'){
                Toast.makeText(this, "Du hast einen Artikel vergessen", Toast.LENGTH_SHORT).show();
            }
            Toast.makeText(this, "Ihre Antwort ist falsch", Toast.LENGTH_SHORT).show();
        }
    }
}