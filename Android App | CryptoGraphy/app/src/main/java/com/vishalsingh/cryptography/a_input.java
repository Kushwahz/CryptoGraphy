package com.vishalsingh.cryptography;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class a_input extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_input);
        Button b1 = (Button)findViewById(R.id.button);
        b1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        startActivity(new Intent(getApplicationContext(),aa_input.class));
    }
}
