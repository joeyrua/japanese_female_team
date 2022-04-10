package com.example.japanese_idol_female_team;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class akb48_random extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private ImageView viewlogo;
    private TextView logoname, message;
    private TypedArray logs;
    private int logonumber;
    private Button go;
    private Spinner sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akb48_random);
        intview();
    }
    private void intview() {
        viewlogo = findViewById(R.id.viewloago_ch_2);
        logoname = findViewById(R.id.ch_2);
        message = findViewById(R.id.message_2);
        go = findViewById(R.id.go_2);
        sp = findViewById(R.id.spinner_2);
        sp.setOnItemSelectedListener(this);
    }
    private Handler handler = new Handler();
    private Runnable start = new startchange();
    private Runnable stop = new stopchange();
    public void go_2(View v) {
        handler.post(start);
        handler.postDelayed(stop, 3000);
        go.setEnabled(false);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if (position == 0) {
            logs = getResources().obtainTypedArray(R.array.TeamA_students_picture);
            logonumber = logs.length();
            viewlogo.setBackground(logs.getDrawable(0));
            logoname.setText("");
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }


    private class startchange implements Runnable {
        @Override
        public void run() {
            String[] name = getResources().getStringArray(R.array.TeamA_students);
            int index = (int) (Math.random() * logonumber);
            if (sp.getSelectedItem().equals("Team A")) {
                viewlogo.setBackground(logs.getDrawable(index));
                logoname.setText(name[index]);
            }
            boolean result = handler.postDelayed(this, 100);
            message.setText(result?"~Let's Go!~":"~No Go!~");
            }
        }

    private class stopchange implements Runnable {
        @Override
        public void run() {
            handler.removeCallbacks(start);
            go.setEnabled(true);
            go.setText("Restart");
            message.setText("~Restart~");
        }

    }
}