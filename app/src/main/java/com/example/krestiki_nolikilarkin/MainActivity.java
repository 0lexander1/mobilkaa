package com.example.krestiki_nolikilarkin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView text_h1 = (TextView) findViewById(R.id.textView);
        text_h1.setText(R.string.h1);
        TextView text_h2 = (TextView) findViewById(R.id.textView2);
        text_h2.setText(R.string.h2);

        Button but1 = (Button) findViewById(R.id.button10);
        but1.setText(R.string.next);
        but1.setOnClickListener(this);
    }

    public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(intent);
    }
}