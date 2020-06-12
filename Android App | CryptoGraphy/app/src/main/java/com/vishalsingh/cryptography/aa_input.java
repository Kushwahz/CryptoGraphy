package com.vishalsingh.cryptography;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class aa_input extends AppCompatActivity implements View.OnClickListener {
    public EditText message;
    public TextView vishal;
    public EditText key;
    public static String filename ="MyMessage";
    SharedPreferences data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aa_input);
        Button encrypt = (Button) findViewById(R.id.encrypt_button);
        message = (EditText) findViewById(R.id.enter_message);
        vishal = (TextView)findViewById(R.id.ENCRYPTION);
        key = (EditText)findViewById(R.id.enter_key);
        encrypt.setOnClickListener(this);
        data = getSharedPreferences(filename, 0);
    }
    public StringBuffer formula(String input, String key){
        int formula = Integer.parseInt(key);
        StringBuffer s=new StringBuffer(input);
        for(int i = 0 ; i< s.length(); i++){
            s.setCharAt(i,(char)(s.charAt(i)+formula));
        }
        return s;
    }

    @Override
    public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), b_encrypting.class));
                String stringMessage = message.getText().toString();
                String keys = key.getText().toString();
                SharedPreferences.Editor editor = data.edit();
                editor.putString("StringShared", stringMessage);
                editor.commit();
                data = getSharedPreferences(filename, 0);
                StringBuffer sweetu = new StringBuffer(formula("StringShared",keys));
                String str = sweetu.toString();
                String showData = data.getString(str, "Text Couldn't be loaded Please try again !!!");
                vishal.setText(showData);
    }
}
