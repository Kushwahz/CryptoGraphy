package com.vishalsingh.cryptography;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class g_original_text extends AppCompatActivity implements View.OnClickListener{
    public static TextView showMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_g_original_text);
        showMessage = (TextView) findViewById(R.id.original_text);
        Button encryptAgainButton = (Button) findViewById(R.id.encrypt_button_again);
        encryptAgainButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        startActivity(new Intent(getApplicationContext(),aa_input.class));
    }
}
