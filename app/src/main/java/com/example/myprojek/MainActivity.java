package com.example.myprojek;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
    }

    public void showActivity(View view){
        String button_text;
        button_text = ((Button) view).getText().toString();
        if (button_text.equals("MATERI")){
            Intent intent = new Intent(MainActivity.this, materiActivity.class);
            startActivity(intent);
        } else if (button_text.equals("KUIS")){
            Intent intent = new Intent(MainActivity.this, pilihKategoriActivity.class);
            startActivity(intent);
        } else if (button_text.equals("KONSONAN")){
            Intent intent = new Intent(MainActivity.this, konsonanActivity.class);
            startActivity(intent);
        } else if (button_text.equals("KOSAKATA DAN ANGKA")){
            Intent intent = new Intent(MainActivity.this, kosakata_angkaActivity.class);
            startActivity(intent);
        } else if (button_text.equals("TENTANG")){
            Intent intent = new Intent(MainActivity.this,TentangActivity.class);
            startActivity(intent);
        }
    }

    @Override
    public void onBackPressed() {
        final AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setIcon(R.drawable.ic_baseline_exit_to_app_24);
        builder.setTitle("Confirm Exit");
        builder.setMessage("Apakah anda ingin keluar?");
        builder.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        builder.setNegativeButton("Tidak", null);
        final AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}