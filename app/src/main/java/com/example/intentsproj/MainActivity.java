package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText num1, num2;
    Button btns;
    String n1, n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.editTextNumber3);
        num2 = findViewById(R.id.editTextNumber4);
        btns = findViewById(R.id.btn_ok);

       btns.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               n1 = num1.getText().toString();
               n2 = num2.getText().toString();

               Intent intent = new Intent(MainActivity.this, SecondActivity.class);
               intent.putExtra("Num1",n1);
               intent.putExtra("Num2", n2);

               Context context = getApplicationContext();
               CharSequence message = "You just clicked OK";
               int duration = Toast.LENGTH_SHORT;

               Toast toast1 = Toast.makeText(context,message, duration);
               toast1.setGravity(Gravity.TOP|Gravity.LEFT, 0, 0);
               toast1.show();

               LayoutInflater li = getLayoutInflater();
               View layout = li.inflate(R.layout.custom_toast, (ViewGroup)
                       findViewById(R.id.custom_toast_layout));

               Toast toast2 = new Toast(getApplicationContext());
               toast2.setDuration(Toast.LENGTH_SHORT);
               toast2.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
               toast2.setView(layout);
               toast2.show();



               startActivity(intent);

           }
       });


    }



}