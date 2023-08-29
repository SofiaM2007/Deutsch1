package com.example.deutsch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.pm.ActivityInfo;
import android.os.Handler;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class HabenSein extends AppCompatActivity {

    String[] sentenses = {"Ich habe gestern Fußball gespielt.", "Ich bin gestern ins Kino gegangen.",
            "Sie hat ein Buch gelesen.", "Sie ist gestern früh aufgestanden.",
            "Er ist gestern ins Kino gegangen.", "Er hat gestern viel gearbeitet.",
            "Wir haben im Restaurant gegessen.", "Wir sind gestern ins Museum gegangen.",
            "Ihr habt am Wochenende einen Ausflug gemacht.", "Ihr habt gestern viel gelacht.",
            "Sie haben Deutsch gelernt.", "Sie haben gestern ihre Freunde getroffen.",
            "Ich war letzte Woche im Schwimmbad.", "Ich habe gestern mit meiner Familie telefoniert.",
            "Du hast das Geschenk verpackt.", "Du hast gestern im Supermarkt eingekauft.",
            "Er hat gestern viel gearbeitet.", "Er hat gestern eine Party besucht.",
            "Sie ist gestern früh aufgestanden.", "Sie hat gestern im Garten gearbeitet.",
            "Wir haben einen Film gesehen.", "Wir haben gestern einen Film im Kino gesehen.",
            "Ihr habt gestern spät gegessen.", "Ihr habt gestern im Restaurant gegessen.",
            "Sie haben im Park gespielt.", "Sie haben gestern im Park gespielt.",
            "Du hast den Brief geschrieben.", "Du hast gestern einen Brief geschrieben.",
            "Er hat gestern eine Party besucht.", "Er hat gestern die Hausaufgaben gemacht.",
            "Ich bin gestern mit dem Bus gefahren.", "Ich habe gestern ein Foto gemacht.",
            "Sie haben gestern ihre Freunde getroffen.", "Sie haben gestern im Café Kaffee getrunken.",
            "Wir haben einen langen Spaziergang gemacht.", "Wir haben gestern eine Pizza bestellt.",
            "Ihr habt gestern viel gelacht.", "Ihr habt gestern am Fluss gepicknickt.",
            "Sie hat gestern im Garten gearbeitet.", "Sie hat gestern ein Gedicht geschrieben.",
            "Er hat gestern im Café Kaffee getrunken.", "Er hat gestern im Park Fußball gespielt.",
            "Ich habe gestern ein Foto gemacht.", "Ich habe gestern im Supermarkt eingekauft.",
            "Wir sind gestern ins Museum gegangen.", "Wir haben gestern am Fluss gepicknickt.",
            "Du hast gestern im Supermarkt eingekauft.", "Du hast gestern im Café Kaffee getrunken.",
            "Sie haben gestern eine neue Sprache gelernt.", "Sie haben gestern im Café Tee getrunken.",
            "Er hat gestern die Hausaufgaben gemacht.", "Er hat gestern im Park Yoga gemacht.",
            "Ich habe gestern mit meiner Familie telefoniert.", "Ich habe gestern im Restaurant Wein getrunken.",
            "Wir haben gestern eine Pizza bestellt.", "Wir haben gestern im Garten Blumen fotografiert.",
            "Du hast gestern einen Film geschaut.", "Du hast gestern im See geangelt.",
            "Sie hat gestern im Garten Blumen gepflanzt.", "Sie hat gestern im Kino einen Horrorfilm geschaut.",
            "Er hat gestern die Zeitung gelesen.", "Er hat gestern im Konzertsaal Musik gehört.",
            "Wir haben gestern ein Konzert besucht.", "Wir haben gestern im Zoo Tiere beobachtet.",
            "Ihr habt gestern im Restaurant gegessen.", "Ihr habt gestern im Café Croissants gegessen.",
            "Sie haben gestern ein Geschenk bekommen.", "Sie haben gestern am Strand Muscheln gesammelt.",
            "Ich habe gestern eine Nachricht geschickt.", "Ich habe gestern im Theater eine Aufführung besucht.",
            "Er hat gestern am Computer gearbeitet.", "Er hat gestern im Freibad geschwommen.",
            "Wir haben gestern eine Wanderung gemacht.", "Wir haben gestern im Park Basketball gespielt.",
            "Sie haben gestern im Park spazieren gegangen.", "Sie haben gestern im Kino einen Horrorfilm geschaut.",
            "Du hast gestern eine Party organisiert.", "Du hast gestern im Konzertsaal applaudiert.",
            "Ich habe gestern Sport getrieben.", "Ich habe gestern im Theater eine Vorstellung gesehen.",
            "Wir haben gestern den ganzen Tag verbracht.", "Wir haben gestern im Schnee Schneeballschlacht gemacht.",
            "Sie haben gestern im Museum Kunstwerke angeschaut.", "Sie haben gestern im Café ein Buch gelesen.",
            "Er hat gestern im Café Kuchen gegessen.", "Er hat gestern im Café Tee getrunken.",
            "Ich habe gestern im Regen spazieren gegangen.", "Ich habe gestern im Café Eis gegessen.",
            "Ihr habt gestern einen Ausflug ans Meer gemacht.", "Ihr habt gestern im Café Kuchen gegessen.",
            "Wir haben gestern neue Freunde kennengelernt.", "Wir haben gestern im Zoo Fotos gemacht.",
            "Du hast gestern im Garten gegrillt.", "Du hast gestern im Regen getanzt.",
            "Sie haben gestern Fotos gemacht.", "Sie haben gestern im Theater eine Aufführung besucht.",
            "Ich habe gestern ein Buch gekauft.", "Ich habe gestern im Freibad geschwommen.",
            "Er hat gestern seine Familie besucht.", "Er hat gestern im Park Yoga gemacht.",
            "Wir haben gestern einen Film im Kino gesehen.", "Wir haben gestern im Café Croissants gegessen.",
            "Sie haben gestern einen Brief geschrieben.", "Sie haben gestern am Flughafen gewartet.",
            "Ihr habt gestern eine Fahrradtour gemacht.", "Ihr habt gestern im Café ein Buch gelesen.",
            "Du hast gestern im Café Kaffee getrunken.", "Du hast gestern im Café Eis gegessen.",
            "Er hat gestern im Park Fußball gespielt.", "Er hat gestern im Park Yoga gemacht.",
            "Ich habe gestern im Supermarkt eingekauft.", "Ich habe gestern im Theater eine Vorstellung gesehen.",
            "Wir haben gestern am Fluss gepicknickt.", "Wir haben gestern im Schnee Schlitten gefahren.",
            "Sie haben gestern ein Gedicht geschrieben.", "Sie haben gestern im Café Tee getrunken.",
            "Ich habe gestern im Wald Pilze gesammelt.", "Ich habe gestern im Café Kaffee getrunken.",
            "Er hat gestern einen Spaziergang gemacht.", "Er hat gestern im Café Eis gegessen.",
            "Wir haben gestern im Garten gearbeitet.", "Wir haben gestern im Park Basketball gespielt.",
            "Ihr habt gestern im See geschwommen.", "Ihr habt gestern im Fitnessstudio trainiert.",
            "Sie haben gestern ein Konzert besucht.", "Sie haben gestern im Restaurant Pizza bestellt.",
            "Du hast gestern im Museum Gemälde betrachtet.", "Du hast gestern im Konzertsaal applaudiert.",
            "Ich habe gestern im Café Croissants gegessen.", "Ich habe gestern im Café ein Buch gelesen.",
            "Er hat gestern im Park Yoga gemacht.", "Er hat gestern im Café ein Buch gelesen.",
            "Wir haben gestern im Zoo Tiere beobachtet.", "Wir haben gestern im Café ein Buch gelesen.",
            "Sie haben gestern im Garten Volleyball gespielt.", "Sie haben gestern im Café Tee getrunken.",
            "Ihr habt gestern im Park gelesen.", "Ihr habt gestern im Restaurant Pizza bestellt.",
            "Ich habe gestern im Fitnessstudio trainiert.", "Ich habe gestern im Café Croissants gegessen.",
            "Wir haben gestern eine Party gefeiert.", "Wir haben gestern im Schnee Schneeballschlacht gemacht.",
            "Du hast gestern im Regen getanzt.", "Du hast gestern im Konzertsaal applaudiert.",
            "Er hat gestern im Theater eine Vorstellung gesehen.", "Er hat gestern im Café ein Buch gelesen.",
            "Sie haben gestern am Flughafen gewartet.", "Sie haben gestern im Café Kaffee getrunken.",
            "Ich habe gestern im Museum Skulpturen bewundert.", "Ich habe gestern im Park Fußball gespielt.",
            "Wir haben gestern im Schnee Schlitten gefahren.", "Wir haben gestern im Café Eis gegessen.",
            "Du hast gestern im Café Eis gegessen.", "Du hast gestern im Café ein Buch gelesen.",
            "Er hat gestern im Park Yoga gemacht.", "Er hat gestern im Café Tee getrunken.",
            "Ich habe gestern im Restaurant Wein getrunken.", "Ich habe gestern im Café Croissants gegessen.",
            "Wir haben gestern im Garten Blumen fotografiert.", "Wir haben gestern im Café Kaffee getrunken.",
            "Sie haben gestern im See geangelt.", "Sie haben gestern im Theater eine Aufführung besucht.",
            "Du hast gestern im Wald spazieren gegangen.", "Du hast gestern im Café Eis gegessen.",
            "Er hat gestern im Konzertsaal Musik gehört.", "Er hat gestern im Café ein Buch gelesen.",
            "Ihr habt gestern im Zoo Fotos gemacht.", "Ihr habt gestern im Café Tee getrunken.",
            "Wir haben gestern im Café Croissants gegessen.", "Wir haben gestern im Park Fußball gespielt.",
            "Sie haben gestern am Strand Muscheln gesammelt.", "Sie haben gestern im Café Tee getrunken.",
            "Ich habe gestern im Theater eine Aufführung besucht.", "Ich habe gestern im Café Kaffee getrunken.",
            "Er hat gestern im Freibad geschwommen.", "Er hat gestern im Café ein Buch gelesen.",
            "Wir haben gestern im Park Basketball gespielt.", "Wir haben gestern im Restaurant Pizza bestellt.",
            "Du hast gestern im Fitnessstudio trainiert.", "Du hast gestern im Café Croissants gegessen.",
            "Sie haben gestern im Restaurant Pizza bestellt.", "Sie haben gestern im Park Yoga gemacht.",
            "Ich habe gestern im Museum alte Artefakte betrachtet.", "Ich habe gestern im Café ein Buch gelesen.",
            "Wir haben gestern am Fluss gegrillt.", "Wir haben gestern im Schnee Schneeballschlacht gemacht.",
            "Ihr habt gestern im Café Kuchen gegessen.", "Ihr habt gestern im Park Fußball gespielt.",
            "Er hat gestern im Garten Bäume gepflanzt.", "Er hat gestern im Café ein Buch gelesen.",
            "Ich habe gestern im Zoo Tiere gefüttert.", "Ich habe gestern im Café Kaffee getrunken.",
            "Sie haben gestern im Kino einen Horrorfilm geschaut.", "Sie haben gestern im Park Yoga gemacht.",
            "Du hast gestern im Konzertsaal applaudiert.", "Du hast gestern im Café Tee getrunken.",
            "Wir haben gestern im Schnee Schneeballschlacht gemacht.", "Wir haben gestern im Restaurant Pizza bestellt.",
            "Er hat gestern im Café ein Buch gelesen.", "Er hat gestern im Café Tee getrunken.",
            "Ich bin gestern ins Kino gegangen.", "Sie ist gestern früh aufgestanden.",
            "Er ist gestern ins Museum gegangen.", "Wir sind gestern ans Meer gefahren.",
            "Ihr seid gestern in die Berge gewandert.", "Sie sind gestern nach Hause gekommen.",
            "Ich bin gestern im Park spazieren gegangen.", "Er ist gestern zur Arbeit gegangen.",
            "Wir sind gestern in den Zoo gegangen.", "Ihr seid gestern auf eine Party gegangen.",
            "Sie sind gestern zum Markt gegangen.", "Du bist gestern mit dem Bus gefahren.",
            "Er ist gestern in den Wald gelaufen.", "Sie ist gestern in die Stadt gefahren.",
            "Wir sind gestern ins Restaurant gegangen.", "Ihr seid gestern zum Konzert gegangen.",
            "Ich bin gestern in die Bibliothek gegangen.", "Sie sind gestern ins Schwimmbad gegangen.",
            "Er ist gestern in die Schule gegangen.", "Wir sind gestern zum Flughafen gefahren."
    };

    String[] haben = {"habe", "hast", "hat", "haben", "habt", "haben"};
    String[] sein = {"bin", "bist", "ist", "sind", "seid", "sind"};

    String[] words;
    private TextView questionTextView;
    private Button habenButton;
    private Button seinButton;

    int randomIndex;
    String correctAnswer, myAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_haben_sein);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        questionTextView = findViewById(R.id.questionTextView);
        habenButton = findViewById(R.id.habenButton);
        seinButton = findViewById(R.id.seinButton);
        resetQuestion();
    }

    public void checkAnswer(View view) {
        Button selectedButton = (Button) view;
        if (selectedButton.getId() == R.id.habenButton) {
            myAnswer = (String)habenButton.getText();
        } else if (selectedButton.getId() == R.id.seinButton) {
            myAnswer = (String)seinButton.getText();
        }

        if (correctAnswer.equals(myAnswer)) {
            selectedButton.setBackgroundColor(ContextCompat.getColor(HabenSein.this, R.color.LimeGreen));
        } else {
            selectedButton.setBackgroundColor(ContextCompat.getColor(HabenSein.this, R.color.lightDarkRed));
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
        correctAnswer=words[1];
        words[1]=null;

        for(int i = 0; i < 6; i++){
            if(correctAnswer.equals(haben[i]) || correctAnswer.equals(sein[i])){
                habenButton.setText(haben[i]);
                seinButton.setText(sein[i]);
            }
        }
        questionTextView.setText(words[0]+" ____ ");
        for(int i = 2; i < words.length; i++){
            questionTextView.setText(questionTextView.getText()+ " " +words[i]);
        }

        habenButton.setBackgroundColor(getResources().getColor(R.color.LiteOrangeRed));
        seinButton.setBackgroundColor(getResources().getColor(R.color.LiteOrangeRed));
    }

}