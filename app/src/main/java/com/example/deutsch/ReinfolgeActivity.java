package com.example.deutsch;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ReinfolgeActivity extends AppCompatActivity {

    String sentences[]=new String[]{
            "Ich lese gern Bücher abends.", "Er fährt mit dem Bus.",
            "Wir gehen ins Kino heute.", "Du lernst Deutsch jetzt fleißig.", "Ihr kommt später nach Hause.",
            "Das Kind schläft schon lange.",  "Ich habe im Park gespielt.", "Sie tanzt gern auf Partys.",
            "Er kauft ein neues Auto.", "Wir sehen am Wochenende Filme.", "Du kommst später zur Party.",
            "Sie schwimmt gern im See.", "Ich habe gestern viel gelernt.",
            "Sie singt unter der Dusche.", "Er hilft immer seinen Eltern.", "Wir gehen oft ins Kino.",
            "Du trinkst viel Wasser täglich.", "Sie liest gerade ein Buch.", "Es gibt viele schöne Blumen.",
            "Ich trage ein blaues Kleid.", "Er spielt oft Fußball abends.", "Wir fahren mit dem Zug.",
            "Du machst heute die Hausaufgaben.", "Sie besucht oft ihre Großeltern.", "Ich mag Kaffee am Morgen.",
            "Wir essen in der Kantine.", "Du hörst gern Musik immer.",
            "Sie sieht einen Film heute.", "Es schneit im Winter oft.",  "Ich trinke abends Tee gerne.",
            "Er liest Zeitung am Sonntag.", "Wir gehen oft ins Restaurant.", "Du siehst heute gut aus.",
            "Sie spricht Deutsch und Englisch.", "Ich wohne in einer Wohnung.",  "Er fährt in die Stadt.",
            "Wir essen Pizza sehr gern.", "Du kommst später zur Arbeit.", "Sie mag den Sommer sehr.",
            "Ich lese Buch jeden Abend.", "Er tanzt gern auf Parties.", "Wir trinken Kaffee im Café.",
            "Du spielst Fußball am Samstag.", "Sie schwimmt im Meer immer.",
            "Ich esse Pizza abends oft.", "Er fährt mit dem Auto.", "Wir machen morgens gerne Yoga.",
            "Du lernst heute fleißig Deutsch.", "Sie singt in der Dusche.",  "Ich gehe oft ins Fitnessstudio.",
            "Er kommt morgen nach Hause.", "Wir sehen heute einen Film.",  "Du trinkst Tee abends gerne.",
            "Sie liest ein Buch leise.", "Es schneit im Winter manchmal.", "Ich esse immer gesundes Essen.",
            "Er läuft gern im Park.", "Wir fahren oft ans Meer.", "Du kommst später zur Schule.",
            "Sie reist gern ins Ausland.", "Ich trinke morgens gerne Kaffee.",
            "Er kocht oft zu Hause.",  "Du singst gut im Chor.",
            "Sie arbeitet fleißig im Büro.", "Ich spiele oft am Computer.", "Er reist mit dem Zug.",
            "Wir essen abends oft Suppe.",  "Warum kommst du heute früher?",  "Sie tanzt gern auf Festen.",
            "Es schneit oft im Winter.",  "Ich fahre mit dem Fahrrad.", "Er geht oft gern spazieren.",
            "Wir sehen Filme im Kino.", "Du trinkst Tee am Nachmittag.", "Sie liest ein interessantes Buch.",
            "Ich esse abends oft Gemüse.", "Wir schwimmen oft im See.",
            "Du machst das sehr gut.", "Sie sieht heute schön aus.", "Ich trinke gerne viel Wasser.",
            "Er spricht Englisch und Deutsch.", "Wir essen oft gerne Pizza .", "Du gehst heute zur Arbeit.",
            "Sie spielt Klavier sehr leidenschaftlich.",  "Ich laufe morgens im Park.", "Er reist gern ins Ausland.",
            "Wir sehen uns nicht heute.", "Du tanzt gut auf Partys.", "Sie arbeitet fleißig im Büro.",
            "Er fährt mit dem Auto.", "Wir gehen heute abends einkaufen.",
            "Du trinkst Tee am Morgen.", "Sie liest ein gutes Buch.","Liest du gern Bücher abends?",
            "Gehen wir ins Kino heute?", "Lernst du Deutsch jetzt fleißig?", "Kommt ihr später nach Hause?",
            "Schläft das Kind schon lange?", "Hast du im Park gespielt?","Tanzt sie gern auf Partys?",
            "Kauft er ein neues Auto?", "Sehen wir am Wochenende Filme?", "Kommst du später zur Party?",
            "Schwimmt sie gern im See?", "Hast du gestern viel gelernt?","Fährt er mit dem Auto?",
            "Singt sie unter der Dusche?", "Hilft er immer seinen Eltern?", "Gehen wir oft ins Kino?",
            "Trinkst du viel Wasser täglich?", "Liest sie gerade ein Buch?", "Gibt es viele schöne Blumen?",
            "Trägst du ein blaues Kleid?", "Spielt er oft Fußball abends?", "Fahren wir mit dem Zug?",
            "Machst du heute die Hausaufgaben?", "Besucht sie oft ihre Großeltern?", "Magst du Kaffee am Morgen?",
            "Siehst du einen Film heute?", "Schneit es im Winter oft?", "Trinkst du abends Tee gerne?",
            "Liest er Zeitung am Sonntag?", "Gehen wir oft ins Restaurant?", "Siehst du heute gut aus?",
            "Sprichst du Deutsch und Englisch?", "Wohnst du in einer Wohnung?"
    };

    TextView[] textViews = new TextView[5];
    Button checkButton;
    float[] lastX = new float[5];
    List<String> shuffledWords;
    int currentSentenceIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reinfolge);

        checkButton=findViewById(R.id.checkButton);

        textViews[0] = findViewById(R.id.textView1);
        textViews[1] = findViewById(R.id.textView2);
        textViews[2] = findViewById(R.id.textView3);
        textViews[3] = findViewById(R.id.textView4);
        textViews[4] = findViewById(R.id.textView5);


        for (int i = 0; i < textViews.length; i++) {
            final int index = i;
            textViews[i].setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    switch (event.getAction()) {
                        case MotionEvent.ACTION_DOWN:
                            lastX[index] = event.getRawX() - v.getX();
                            v.bringToFront(); // Перемещаем текущий элемент поверх остальных
                            break;
                        case MotionEvent.ACTION_MOVE:
                            float newX = event.getRawX() - lastX[index];
                            float newLeftX = Math.max(0, Math.min(newX, ((ViewGroup) v.getParent()).getWidth() - v.getWidth()));
                            v.setX(newLeftX);
                            break;
                    }
                    return true;
                }
            });
        }


        // Выбираем случайное предложение и перемешиваем его слова
        shuffleSentence();
    }

    // Выбирает случайное предложение из массива и перемешивает его слова
    private void shuffleSentence() {
        currentSentenceIndex = new Random().nextInt(sentences.length);
        String sentence = sentences[currentSentenceIndex];
        String[] words = sentence.split(" ");
        shuffledWords = Arrays.asList(words);
        Collections.shuffle(shuffledWords);
        updateTextViews();
    }

    // Обновляет содержимое textViews с перемешанными словами
    private void updateTextViews() {
        for (int i = 0; i < textViews.length; i++) {
            textViews[i].setText(shuffledWords.get(i));
        }
    }

    // Метод, вызываемый при проверке предложения
    public void checkSentence(View view) {

        RelativeLayout mainLayout = findViewById(R.id.mainLayout);

        if("Überprüfen".equals(checkButton.getText())){
            List<String> userWords = new ArrayList<>();

            // Сортируем блоки по их текущим позициям (координатам)
            Arrays.sort(textViews, (textView1, textView2) -> Float.compare(textView1.getX(), textView2.getX()));

            for (TextView textView : textViews) {
                userWords.add(textView.getText().toString());
            }

            String userSentence = TextUtils.join(" ", userWords);
            String originalSentence = sentences[currentSentenceIndex];


            if (userSentence.equals(originalSentence)) {
                //Toast.makeText(this, "Правильно!", Toast.LENGTH_LONG).show();
                checkButton.setText("Weiter");
                mainLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.GreenYellowLite));
            } else {
              //  Toast.makeText(this, "Неправильно. Попробуйте ещё раз.", Toast.LENGTH_LONG).show();
                mainLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.Tomato));

            }
        }
        else{
            checkButton.setText("Überprüfen");
            mainLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.Pink));
            shuffleSentence();
        }
    }

    // Метод, вызываемый для перемешивания слов и обновления textViews
    public void shuffleWords(View view) {
        shuffleSentence();
    }
}
