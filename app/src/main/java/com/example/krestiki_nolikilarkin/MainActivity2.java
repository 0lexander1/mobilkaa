
package com.example.krestiki_nolikilarkin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener{
    Integer xod = 0;
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
    TextView text_h2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        TextView text_h1 = (TextView) findViewById(R.id.textView);
        text_h1.setText(R.string.h1);
        text_h2 = (TextView) findViewById(R.id.textView2);
        text_h2.setText(R.string.h3);

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
        but10.setText(R.string.reset);

        but1.setOnClickListener(this);
        but2.setOnClickListener(this);
        but3.setOnClickListener(this);
        but4.setOnClickListener(this);
        but5.setOnClickListener(this);
        but6.setOnClickListener(this);
        but7.setOnClickListener(this);
        but8.setOnClickListener(this);
        but9.setOnClickListener(this);
        but10.setOnClickListener(this);
    }

    public void onClick(View v) {
        if(v.getId() == R.id.button){
            if(xod % 2 == 0 && but1.getText() == ""){
                but1.setText("X");
                xod = xod + 1;
            }
            else if (xod % 2 != 0 && but1.getText() == ""){
                but1.setText("O");
                xod = xod + 1;
            };
            check();
        }
        if(v.getId() == R.id.button2){
            if(xod % 2 == 0 && but2.getText() == ""){
                but2.setText("X");
                xod = xod + 1;
            }
            else if (xod % 2 != 0 && but2.getText() == ""){
                but2.setText("O");
                xod = xod + 1;
            };
            check();
        }
        if(v.getId() == R.id.button3){
            if(xod % 2 == 0 && but3.getText() == ""){
                but3.setText("X");
                xod = xod + 1;
            }
            else if (xod % 2 != 0 && but3.getText() == ""){
                but3.setText("O");
                xod = xod + 1;
            };
            check();
        }
        if(v.getId() == R.id.button4){
            if(xod % 2 == 0 && but4.getText() == ""){
                but4.setText("X");
                xod = xod + 1;
            }
            else if (xod % 2 != 0 && but4.getText() == ""){
                but4.setText("O");
                xod = xod + 1;
            };
            check();
        }
        if(v.getId() == R.id.button5){
            if(xod % 2 == 0 && but5.getText() == ""){
                but5.setText("X");
                xod = xod + 1;
            }
            else if (xod % 2 != 0 && but5.getText() == ""){
                but5.setText("O");
                xod = xod + 1;
            };
            check();
        }
        if(v.getId() == R.id.button6){
            if(xod % 2 == 0 && but6.getText() == ""){
                but6.setText("X");
                xod = xod + 1;
            }
            else if (xod % 2 != 0 && but6.getText() == ""){
                but6.setText("O");
                xod = xod + 1;
            };
            check();
        }
        if(v.getId() == R.id.button7){
            if(xod % 2 == 0 && but7.getText() == ""){
                but7.setText("X");
                xod = xod + 1;
            }
            else if (xod % 2 != 0 && but7.getText() == "") {
                but7.setText("O");
                xod = xod + 1;
            };
            check();
        }
        if(v.getId() == R.id.button8){
            if(xod % 2 == 0 && but8.getText() == ""){
                but8.setText("X");
                xod = xod + 1;
            }
            else if (xod % 2 != 0 && but8.getText() == "") {
                but8.setText("O");
                xod = xod + 1;
            };
            check();
        }
        if(v.getId() == R.id.button9){
            if(xod % 2 == 0 && but9.getText() == ""){
                but9.setText("X");
                xod = xod + 1;
            }
            else if (xod % 2 != 0 && but9.getText() == ""){
                but9.setText("O");
                xod = xod + 1;
            };
            check();
        }
        if(v.getId() == R.id.button10) {
            but1.setText("");
            but2.setText("");
            but3.setText("");
            but4.setText("");
            but5.setText("");
            but6.setText("");
            but7.setText("");
            but8.setText("");
            but9.setText("");
        }
    }
    public void check(){
        if(xod % 2 == 0){
            text_h2.setText(R.string.h3);
        }
        else{
            text_h2.setText(R.string.h4);
        }
        if(but1.getText() == but2.getText() && but2.getText() == but3.getText() && but2.getText() != "" ||
                but4.getText() == but5.getText() && but5.getText() == but6.getText() && but5.getText() != "" ||
                but7.getText() == but8.getText() && but8.getText() == but9.getText() && but8.getText() != "" ||
                but1.getText() == but4.getText() && but4.getText() == but7.getText() && but1.getText() != "" ||
                but2.getText() == but5.getText() && but5.getText() == but8.getText() && but2.getText() != "" ||
                but3.getText() == but6.getText() && but6.getText() == but9.getText() && but3.getText() != "" ||
                but1.getText() == but5.getText() && but5.getText() == but9.getText() && but1.getText() != "" ||
                but3.getText() == but5.getText() && but5.getText() == but7.getText() && but3.getText() != "" ){
            Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
            intent.putExtra("but1", but1.getText());
            intent.putExtra("but2", but2.getText());
            intent.putExtra("but3", but3.getText());
            intent.putExtra("but4", but4.getText());
            intent.putExtra("but5", but5.getText());
            intent.putExtra("but6", but6.getText());
            intent.putExtra("but7", but7.getText());
            intent.putExtra("but8", but8.getText());
            intent.putExtra("but9", but9.getText());
            if(xod % 2 == 0){
                intent.putExtra("win", "O");
                startActivity(intent);
            }
            else {
                intent.putExtra("win", "X");
                startActivity(intent);
            }
        }
    }
}