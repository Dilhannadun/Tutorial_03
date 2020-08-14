package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView num1, num2;
    TextView ans;
    String n1, n2;
    Button b1, b2, b3, b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        num1 = findViewById(R.id.editTextNumber);
        num2 = findViewById(R.id.editTextNumber2);
        ans = findViewById(R.id.textView3);

        Intent i = getIntent();

         n1= i.getStringExtra("Num1");
         n2= i.getStringExtra("Num2");

        num1.setText(n1);
        num2.setText(n2);


        b1 = findViewById(R.id.button);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        b4 = findViewById(R.id.button4);



        final float number1 = Float.parseFloat(n1);
        final float number2 = Float.parseFloat(n2);

        b1.setOnClickListener(new View.OnClickListener() {
            float answer;
            @Override
            public void onClick(View v) {
                answer = number1 + number2;
                ans.setText(number1+" + "+number2+" = "+ answer);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            float answer;
            @Override
            public void onClick(View v) {
                answer = number1 - number2;
                ans.setText(number1+" - "+number2+" = "+ answer);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            float answer;
            @Override
            public void onClick(View v) {
                answer = number1 / number2;
                ans.setText(number1+" / "+number2+" = "+ answer);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            float answer;
            @Override
            public void onClick(View v) {
                answer = number1 * number2;
                ans.setText(number1+" * "+number2+" = "+ answer);
            }
        });
    }
}