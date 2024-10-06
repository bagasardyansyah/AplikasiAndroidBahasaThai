package com.example.myprojek;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class    quizResults extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_results);
        getSupportActionBar().hide();

        final AppCompatButton startNew = findViewById(R.id.startNew);
        final AppCompatButton backToHome = findViewById(R.id.backToHome);
        final TextView correctAnswer = findViewById(R.id.correctAnswer);
        final TextView incorrectAnswer = findViewById(R.id.incorrectAnswers);
        final TextView score = findViewById(R.id.score);
        final int getCorrectAnswers = getIntent().getIntExtra("correct", 0);
        final int getIncorrectAnswers = getIntent().getIntExtra("incorrect", 0);

        score.setText("Skor anda adalah : " + String.valueOf(getCorrectAnswers*5));
        correctAnswer.setText("Benar : " + String.valueOf(getCorrectAnswers));
        incorrectAnswer.setText("Salah : " + String.valueOf(getIncorrectAnswers));

        startNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(quizResults.this, pilihKategoriActivity.class));
                finish();
            }
        });
        backToHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(quizResults.this, MainActivity.class));
                finish();
            }
        });
    }
}