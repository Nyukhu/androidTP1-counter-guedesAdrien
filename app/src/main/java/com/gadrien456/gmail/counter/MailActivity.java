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
import com.gadrien456.gmail.counter.databinding.MailActivityBinding;
import com.gadrien456.gmail.counter.databinding.NavActivityBinding;

public class MailActivity extends AppCompatActivity {

    MailActivityBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        binding = MailActivityBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initViews();

    }
    private void initViews() {

        binding.sendMail.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {

                Intent email = new Intent(Intent.ACTION_SEND);
                email.putExtra(Intent.EXTRA_TEXT, binding.mailText.getText());
                email.setType("message/rfc822");
                email.putExtra(Intent.EXTRA_EMAIL, new String[]{"test@gmail.com","tist@gmail.com","tastast@gmail.com"});
                startActivity(Intent.createChooser(email,"choose mail"));
            }
        });


    }

}