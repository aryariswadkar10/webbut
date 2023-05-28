package com.example.exp11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton b1, b2, b3, b4;
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);

        b1.setOnClickListener(view -> {
            String str = "https://www.flipkart.com/";
            Intent i = new Intent(getApplicationContext(), MainActivity2.class);
            i.putExtra("b1", str);
            startActivity(i);
        });

        b2.setOnClickListener(view -> {
            String str = "https://www.amazon.in/";
            Intent i = new Intent(getApplicationContext(), MainActivity2.class);
            i.putExtra("b2", str);
            startActivity(i);
        });

        b3.setOnClickListener(view -> {
            String str = "https://www.snapchat.com/";
            Intent i = new Intent(getApplicationContext(), MainActivity2.class);
            i.putExtra("b3", str);
            startActivity(i);
        });

        b4.setOnClickListener(view -> {
            String str = "https://www.twitter.com/";
            Intent i = new Intent(getApplicationContext(), MainActivity2.class);
            i.putExtra("b4", str);
            startActivity(i);
        });
    }
}