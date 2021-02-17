package com.gadrien456.gmail.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button buttonToast;
    private Button buttonInc;
    private TextView textViewCount;
    private Integer counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();

    }
    private void initViews() {
        buttonToast = findViewById(R.id.toastButton);
        buttonInc = findViewById(R.id.button2);
        textViewCount = findViewById(R.id.counter);
        buttonInc.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                counter ++;
                textViewCount.setText(counter.toString());
            }
        });
        buttonToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, counter.toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }

}