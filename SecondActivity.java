package com.edu.taru.lab2_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private TextView textViewMessage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textViewMessage = (TextView)findViewById(R.id.textViewMessage);

        Bundle extra = getIntent().getExtras();

        if(! extra.isEmpty()){
            String message = extra.getString("MESSAGE");
            textViewMessage.setText(message);
        }
    }

}

