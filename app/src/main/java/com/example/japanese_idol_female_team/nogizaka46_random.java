package com.example.japanese_idol_female_team;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class nogizaka46_random extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private ImageView viewlogo;
    private TextView first_logoname, message;
    private TypedArray logs;
    private int logoNumber;
    private Button go;
    private Spinner sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nogizaka46_random);
        initView();
    }
    private void initView() {
        viewlogo = findViewById(R.id.viewloago_ch);
        first_logoname = findViewById(R.id.ch);
        message = findViewById(R.id.message);
        go = findViewById(R.id.go);
        sp = findViewById(R.id.spinner);
        sp.setOnItemSelectedListener(this);
    }
    private Handler handle = new Handler();
    private Runnable start = new startchange();
    private Runnable stop = new stopchange();
    public  void go(View v) {
        handle.post(start);
        handle.postDelayed(stop, 3000);
        go.setEnabled(false);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if (position == 0) {
            logs = getResources().obtainTypedArray(R.array.first_generation_students);
            logoNumber = logs.length();
            viewlogo.setBackground(logs.getDrawable(0));
            first_logoname.setText("");
        } else if (position == 1) {
            logs = getResources().obtainTypedArray(R.array.second_generation_students);
            logoNumber = logs.length();
            viewlogo.setBackground(logs.getDrawable(0));
            first_logoname.setText("");
        } else if (position == 2) {
            logs = getResources().obtainTypedArray(R.array.third_generation_students);
            logoNumber = logs.length();
            viewlogo.setBackground(logs.getDrawable(0));
            first_logoname.setText("");
        } else if (position == 3) {
            logs = getResources().obtainTypedArray(R.array.forth_generation_students);
            logoNumber = logs.length();
            viewlogo.setBackground(logs.getDrawable(0));
            first_logoname.setText("");
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    private class startchange implements Runnable {
        public void run() {
            String[] name = getResources().getStringArray(R.array.first_name);
            String[] name_2 = getResources().getStringArray(R.array.second_name);
            String[] name_3 = getResources().getStringArray(R.array.third_name);
            String[] name_4 = getResources().getStringArray(R.array.forth_name);
            int index = (int) (Math.random() * logoNumber);
            if (sp.getSelectedItem().equals("一期生")) {
                viewlogo.setBackground(logs.getDrawable(index));
                first_logoname.setText(name[index]);
            } else if (sp.getSelectedItem().equals("二期生")) {
                viewlogo.setBackground(logs.getDrawable(index));
                first_logoname.setText(name_2[index]);
            } else if (sp.getSelectedItem().equals("三期生")) {
                viewlogo.setBackground(logs.getDrawable(index));
                first_logoname.setText(name_3[index]);
            } else if (sp.getSelectedItem().equals("四期生")) {
                viewlogo.setBackground(logs.getDrawable(index));
                first_logoname.setText(name_4[index]);
            }
            boolean result = handle.postDelayed(this, 100);
            message.setText(result?"~Let's Go!~":"~No Go!~");
        }
    }

    private class stopchange implements Runnable {
        public void run() {
            handle.removeCallbacks(start);
            go.setEnabled(true);
            go.setText("Restart");
            message.setText("~Restart~");
        }
    }

}