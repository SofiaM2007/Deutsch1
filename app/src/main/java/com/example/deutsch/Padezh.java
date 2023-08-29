package com.example.deutsch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Padezh extends AppCompatActivity {

    private String[] questions = {
            "Ich gebe dem Kind ___ Ball.", "Sie sieht ___ Fernseher.","Wir gehen in ___ Park.",
            "Er liest ___ Buch.","Ich trinke ___ Kaffee.", "Das ist ___ Auto.",
            "Sie spricht mit ___ Lehrer.", "Er kauft ___ Apfel.","Wir besuchen ___ Freunde.",
            "Ich habe ___ Hund.", "Sie öffnet ___ Tür.",
            "Ich höre ___ Musik.", "Wir mögen ___ Pizza.", "Sie trägt ___ Jacke.", "Er wohnt in ___ Stadt.",
            "Ich sehe ___ Film.", "Sie schreibt ___ Brief.", "Wir haben ___ Katze.", "Er isst ___ Brot.",
            "Das ist ___ Haus.","Sie trägt ___ Hut.","Er liest ___ Zeitung.","Wir fahren in ___ Schule.",
            "Ich trage ___ Brille.","Sie kauft ___ Blumen.", "Er spielt ___ Klavier.",
            "Ich sehe ___ Vogel.","Wir haben ___ Auto.","Sie isst ___ Kuchen.","Er öffnet ___ Buch.",//30
            "Ich trinke ___ Tee.", "Wir mögen ___ Strand.","Sie geht in ___ Restaurant.", "Er malt ___ Bild.",
            "Ich höre ___ Lied.", "Wir besuchen ___ Museum.", "Sie putzt ___ Fenster.", "Er hat ___ Computer.",
            "Ich spiele ___ Fußball.", "Wir machen ___ Ausflug.", "Sie trägt ___ Kleid.", "Er repariert ___ Auto.",
            "Ich sehe ___ Sterne.", "Wir besitzen ___ Haus.", "Sie hört ___ Nachrichten.", "Er liest ___ Gedicht.",
            "Ich esse ___ Pizza.", "Wir reisen in ___ Ferien.", "Sie malt ___ Landschaft.", "Er trägt ___ Rucksack.",
            "Ich habe ___ Tasche.", "Wir sehen ___ Sonnenuntergang.", "Sie fährt ___ Motorrad.", "Er hat ___ Freundin.",
            "Ich trinke ___ Saft.", "Wir kaufen ___ Geschenk.", "Sie öffnet ___ Fenster.", "Er besucht ___ Oma.",
            "Ich höre ___ Geräusche.", "Wir mögen ___ Musik.", "Sie isst ___ Obst.", "Er kauft ___ Hemd.",//62
            "Ich trage ___ Uhr.", "Wir fahren mit ___ Zug.", "Sie liest ___ Zeitung.", "Er spielt ___ Gitarre.",
            "Ich sehe ___ Schiff.", "Wir haben ___ Idee.", "Sie geht in ___ Park.", "Er malt ___ Porträt.",
            "Ich höre ___ Vögel.", "Wir besuchen ___ Verwandte.", "Sie trägt ___ Schuhe.", "Er schreibt ___ Geschichte.",
            "Ich esse ___ Eis.", "Wir reisen in ___ Stadt.", "Sie trinkt ___ Kaffee.", "Er hat ___ Handy.",
            "Ich spiele ___ Instrument.", "Wir machen ___ Foto.", "Sie hört ___ Musik.", "Er liest ___ Brief.",
            "Ich trinke ___ Wasser.", "Wir kaufen ___ Lebensmittel.", "Sie öffnet ___ Buch.", "Er besucht ___ Freund.",
            "Ich höre ___ Radio.", "Wir mögen ___ Blumen.", "Sie isst ___ Schokolade.", "Er kauft ___ Geschenk.",
            "Ich trage ___ Jacke.", "Wir fahren auf ___ Land.", "Sie liest ___ Buch.", "Er spielt ___ Spiel.",//94
            "Ich sehe ___ Haus.", "Wir haben ___ Katze.", "Sie geht in ___ Schule.", "Er malt ___ Bild.",
            "Ich höre ___ Lied.", "Wir besuchen ___ Restaurant.", "Sie trägt ___ Hut.", "Er hat ___ Computer.",
            "Ich esse ___ Früchte.", "Wir reisen in ___ Ferien.", "Sie trinkt ___ Tee.", "Er liest ___ Zeitung.",
            "Ich spiele ___ Sport.", "Wir machen ___ Spaziergang.", "Sie hört ___ Musik.", "Er öffnet ___ Fenster.",
            "Ich trage ___ Schuhe.", "Wir kaufen ___ Kleidung.", "Sie besucht ___ Arzt.", "Er malt ___ Landschaft.",
            "Ich sehe ___ Tier.", "Wir haben ___ Auto.", "Sie geht in ___ Geschäft.", "Er liest ___ Buch.",
            "Ich trinke ___ Kaffee.", "Wir mögen ___ Essen.", "Sie isst ___ Abendessen.", "Er kauft ___ Handy.",
            "Ich trage ___ Hut.", "Wir fahren in ___ Urlaub.", "Sie liest ___ Zeitschrift.", "Er spielt ___ Fußball.",
            "Ich höre ___ Stimme.",
            "Ich gebe ___ Kind einen Ball.", "Sie hilft ___ Mann.", "Wir schreiben ___ Lehrerin.", "Er erzählt ___ Familie.",
            "Sie kauft ___ Freund Blumen.", "Ich helfe ___ Eltern.", "Wir geben ___ Schwester ein Buch.", "Er zeigt ___ Arzt seinen Arm.",
            "Sie erzählt ___ Lehrer eine Geschichte.", "Ich schicke ___ Chef eine E-Mail.", "Wir bringen ___ Nachbarn Kuchen.",
            "Er leiht ___ Kollegen seinen Stift.", "Sie schenkt ___ Kind ein Spielzeug."//140
    };

    private String[] correctAnswers = {
            "den", "den", "den", "das", "den", "das", "dem", "den","die", "den", "die",
            "die", "die", "die", "der", "den", "den", "die", "das", "das", "den", "die",
            "die", "die", "die", "das", "den", "das", "den","das",
            "den", "den", "das", "das", "das", "das", "das", "den", "den",
            "den", "das", "das", "die", "das", "die", "das", "die", "die", "die",
            "den", "die", "den", "das", "die", "den", "das", "das", "die",
            "die", "die", "das", "das", "die", "dem", "die", "die", "das",
            "die", "den", "das", "die", "die", "die", "die", "das", "die", "den",
            "das", "das", "das", "die", "den", "das", "die", "das", "den",
            "das", "die", "die", "das", "die", "das", "das","das","das",
            "die", "die", "das", "das", "das", "den", "den","die","die",
            "den", "die", "den", "den", "die", "das", "die","die","den",
            "die", "das", "das", "das", "das", "den", "das","das","das",
            "den", "den", "die", "den", "die",
            "dem", "dem", "der", "der", "dem", "den", "der","dem","dem",
            "dem", "den", "dem", "dem"//140

    };






    int currentQuestionIndex=0, AnsweredQuestions=0;
    TextView questionTextView;
    RadioGroup answerRadioGroup;
    Button submitButton;
    LinearLayout mainLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_padezh);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        System.out.println(questions.length);
        System.out.println(correctAnswers.length);

        questionTextView = findViewById(R.id.questionTextView);
        answerRadioGroup = findViewById(R.id.answerRadioGroup);
        submitButton = findViewById(R.id.submitButton);
        mainLayout = findViewById(R.id.Layout);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer();
            }
        });

        loadNextQuestion();
    }

    private void loadNextQuestion() {
        if (currentQuestionIndex < questions.length) {
            currentQuestionIndex=(int) (Math.random() * questions.length);
            questionTextView.setText(questions[currentQuestionIndex]);
            clearRadioButtons();
            AnsweredQuestions++;
        }
        else {
            questionTextView.setText("All questions answered.");
            submitButton.setEnabled(false);
        }
    }

    private void checkAnswer() {
        int selectedRadioButtonId = answerRadioGroup.getCheckedRadioButtonId();
        RadioButton selectedRadioButton = findViewById(selectedRadioButtonId);
        String selectedAnswer = selectedRadioButton.getText().toString();

        if (selectedAnswer.equals(correctAnswers[currentQuestionIndex])) {//-1
            Toast.makeText(this, "Richtig!", Toast.LENGTH_SHORT).show();
            mainLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.lightGreen));
            submitButton.setBackgroundColor(ContextCompat.getColor(Padezh.this, R.color.LimeGreen));
            loadNextQuestion();
        }
        else {
            Toast.makeText(this, "Ihre Antwort ist falsch", Toast.LENGTH_SHORT).show();
            mainLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.lightRed));
            submitButton.setBackgroundColor(ContextCompat.getColor(Padezh.this, R.color.lightDarkRed));
        }
    }

    private void clearRadioButtons() {
        answerRadioGroup.clearCheck();
    }
}