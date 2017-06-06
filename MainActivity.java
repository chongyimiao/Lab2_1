package com.edu.taru.lab2_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editTextMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextMessage = (EditText)findViewById(R.id.editTextMessage);
    }
    public void sendMessage(View view){
        String message;
        message = editTextMessage.getText().toString();
        Intent intent = new Intent(this, SecondActivity.class);
        //Instert parameter to an Intant
        intent.putExtra("MESSAGE", message);

        startActivity(intent);
    }
}
