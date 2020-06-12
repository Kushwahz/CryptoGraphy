package com.vishalsingh.cryptography;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import java.util.Timer;
import java.util.TimerTask;

public class e_decrypting extends AppCompatActivity {
    private ProgressBar spinner2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e_decrypting);
        spinner2 = (ProgressBar) findViewById(R.id.progressBar2);
        spinner2.setVisibility(View.GONE);
        spinner2.setVisibility(View.VISIBLE);
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), f_decrypt_success.class)); // this code will be executed after 2 seconds
            }
        }, 2000);
    }
}
