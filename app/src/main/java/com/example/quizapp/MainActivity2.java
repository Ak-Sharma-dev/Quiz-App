package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView textView3;
    private TextView textView4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);
        Intent intent = getIntent();
        String str = intent.getStringExtra(MainActivity.k);
        if(str.equals("5"))
            textView4.setText("Excellent you Scored 100%");
        else if(str.equals("4"))
            textView4.setText("Good you Scored 80%");
        else if(str.equals("3"))
            textView4.setText("Not Bad you Scored 60%");
        else if(str.equals("2"))
            textView4.setText("Need more Practice Scored 40%");
        else if(str.equals("1"))
            textView4.setText("Poor Performance Scored 20%");
        else
            textView4.setText("Worst Performance Scored 0%");
        textView3.setText("Your Scores for the Java Quiz is "+str+" out of 5");
    }
}