
package com.example.krestiki_nolikilarkin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity implements View.OnClickListener{

    Button but1;
    Button but2;
    Button but3;
    Button but4;
    Button but5;
    Button but6;
    Button but7;
    Button but8;
    Button but9;
    Button but10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Intent intent = getIntent();

        TextView text_h1 = (TextView) findViewById(R.id.textView);
        text_h1.setText(R.string.h1);

        but1 = (Button) findViewById(R.id.button);
        but2 = (Button) findViewById(R.id.button2);
        but3 = (Button) findViewById(R.id.button3);
        but4 = (Button) findViewById(R.id.button4);
        but5 = (Button) findViewById(R.id.button5);
        but6 = (Button) findViewById(R.id.button6);
        but7 = (Button) findViewById(R.id.button7);
        but8 = (Button) findViewById(R.id.button8);
        but9 = (Button) findViewById(R.id.button9);
        but10 = (Button) findViewById(R.id.button10);

        but1.setText(intent.getStringExtra("but1"));
        but2.setText(intent.getStringExtra("but2"));
        but3.setText(intent.getStringExtra("but3"));
        but4.setText(intent.getStringExtra("but4"));
        but5.setText(intent.getStringExtra("but5"));
        but6.setText(intent.getStringExtra("but6"));
        but7.setText(intent.getStringExtra("but7"));
        but8.setText(intent.getStringExtra("but8"));
        but9.setText(intent.getStringExtra("but9"));

        but10.setText(R.string.next);
        but10.setOnClickListener(this);

        TextView text_h2 = (TextView) findViewById(R.id.textView2);
        text_h2.setText("Победа " + intent.getStringExtra("win"));
    }
    public void onClick(View v) {
        Intent intent = new Intent(MainActivity3.this, MainActivity2.class);
        startActivity(intent);
    }
}