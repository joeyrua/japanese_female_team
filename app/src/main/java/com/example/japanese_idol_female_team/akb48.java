package com.example.japanese_idol_female_team;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

public class akb48 extends AppCompatActivity implements View.OnClickListener {
    Button random2, introduction2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akb48);
        random2 = findViewById(R.id.random_2);
        introduction2 = findViewById(R.id.member_introduction_2);
        random2.setOnClickListener(this);
        introduction2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.random_2:
                Intent intent = new Intent();
                intent.setClass(this, akb48_random.class);
                startActivity(intent);
                break;
            case R.id.member_introduction_2:

                break;
        }
    }
}