package com.example.myprojek;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class materiActivity extends AppCompatActivity {
    TextView konsonan, kosakata, angka;
    Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi);
        dialog = new Dialog(materiActivity.this);
        getSupportActionBar().setTitle("Materi");
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.purple_700)));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}