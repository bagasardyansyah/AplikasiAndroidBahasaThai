package com.example.myprojek;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;

public class TentangActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang);
        getSupportActionBar().setTitle("Tentang");
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.purple_700)));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        String text = "Aplikasi ini bertujuan untuk membantu setiap orang yang baru mempelajari bahasa thailand yang dapat diakses kapanpun dan dimanapun tanpa batas waktu";
        WebView webView = (WebView) findViewById(R.id.webview);
        webView.loadData("<p style=\"text-align: justify\">"+ text +"</p>", "text/html", "UTF-8");
    }
}