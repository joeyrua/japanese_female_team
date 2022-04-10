package com.example.japanese_idol_female_team;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class nogizaka46 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nogizaka46);
        Button member_in = findViewById(R.id.member_introduction);
        Button member_random = findViewById(R.id.random);
        member_in.setOnClickListener(this);
        member_random.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case  R.id.member_introduction:
                Intent intent = new Intent();
                intent.setClass(this, nogizaka46_member_introduction.class);
                startActivity(intent);
                break;
            case R.id.random:
                Intent intent2 = new Intent();
                intent2.setClass(this, nogizaka46_random.class);
                startActivity(intent2);
                break;
            default:
                break;
        }
    }
}