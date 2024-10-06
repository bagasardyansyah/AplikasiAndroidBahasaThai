package com.example.myprojek;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class pilihKategoriActivity extends AppCompatActivity {
    private String selectedTopicName = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilihkategori);
        getSupportActionBar().setTitle("KUIS");
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.purple_700)));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void showQuestions(View view){
        String button_text;
        button_text = ((Button) view).getText().toString();
        if (button_text.equals("KONSONAN")){
            selectedTopicName = "KONSONAN";
            Intent intent = new Intent(pilihKategoriActivity.this, QuizActivity.class);
            intent.putExtra("selectedTopic", selectedTopicName);
            startActivity(intent);
        } else if (button_text.equals("KOSAKATA")){
            selectedTopicName = "KOSAKATA";
            Intent intent = new Intent(pilihKategoriActivity.this, QuizActivity.class);
            intent.putExtra("selectedTopic", selectedTopicName);
            startActivity(intent);
        } else if (button_text.equals("ANGKA")){
            selectedTopicName = "ANGKA";
            Intent intent = new Intent(pilihKategoriActivity.this, QuizActivity.class);
            intent.putExtra("selectedTopic", selectedTopicName);
            startActivity(intent);
        }
    }
}