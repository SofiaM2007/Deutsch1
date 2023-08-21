package com.example.deutsch;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class ReinfolgeActivity extends AppCompatActivity {

    TextView[] textViews = new TextView[5];
    float[] lastX = new float[5];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reinfolge);

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
                            break;
                        case MotionEvent.ACTION_MOVE:
                            float newX = event.getRawX() - lastX[index];
                            v.setX(newX);
                            break;
                    }
                    return true;
                }
            });
        }
    }
}
