package com.example.japanese_idol_female_team;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageButton;

public class two extends AppCompatActivity {
    ImageButton nogizaka46_logo, akb48_logo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        nogizaka46_logo = findViewById(R.id.image_team_log1);
        akb48_logo = findViewById(R.id.image_team_log2);
    }
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            ConfirmExit();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
    public void ConfirmExit() {
        AlertDialog.Builder ad = new AlertDialog.Builder(two.this);
        ad.setTitle("離開");
        ad.setMessage("確定要離開嗎?");
        ad.setPositiveButton("是", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                System.exit(0);
            }
        });
        ad.setNegativeButton("否", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        ad.setCancelable(false);
        ad.show();
    }
    public void akb48(View v) {
        Intent intent = new Intent();
        intent.setClass(two.this,akb48.class);
        startActivity(intent);
    }
    public void nogizaka46(View v) {
        Intent intent = new Intent();
        intent.setClass(two.this, nogizaka46.class);
        startActivity(intent);
    }
}