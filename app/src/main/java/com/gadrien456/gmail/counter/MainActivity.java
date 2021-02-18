package com.gadrien456.gmail.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.gadrien456.gmail.counter.databinding.ActivityMainBinding;
import com.gadrien456.gmail.counter.databinding.NavActivityBinding;

public class MainActivity extends AppCompatActivity {

    NavActivityBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        binding = NavActivityBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initViews();

    }
    private void initViews() {

        binding.goToCalc.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {

                Intent calcIntent = new Intent(MainActivity.this,CalcActivity.class);
                startActivity(calcIntent);
            }
        });
        binding.goToMail.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {

                Intent calcIntent = new Intent(MainActivity.this,MailActivity.class);
                startActivity(calcIntent);
            }
        });


    }

}