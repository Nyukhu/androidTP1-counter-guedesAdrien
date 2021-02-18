package com.gadrien456.gmail.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.gadrien456.gmail.counter.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private Integer counter = 0;
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initViews();

    }
    private void initViews() {

        binding.button2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                counter ++;
                binding.counter.setText(counter.toString());
            }
        });
        binding.toastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, binding.counter.toString(), Toast.LENGTH_SHORT).show();
            }
        });
        binding.computeButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                double op1 =  Double.parseDouble(String.valueOf(binding.firstOpField.getText()));
                double op2 =  Double.parseDouble(String.valueOf(binding.secondOpField.getText()));
                double calcResult = op1 + op2;
                Toast.makeText(MainActivity.this, Double.toString(calcResult),Toast.LENGTH_SHORT).show();

            }
        });

    }

}