package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView textView2;
    private RadioGroup radioGroup;
    private RadioButton radioButton;
    private RadioButton radioButton2;
    private RadioButton radioButton3;
    private RadioButton radioButton4;
    private Button button4;
    public String[] questions = {"Which of the following option leads to the portability and security of Java?",
    "Which of the following is not a Java features?","What is the return type of the hashCode() method in the Object class?"
    ,"Which package contains the Random class?","An interface with no fields or methods is known as a ____"};
    public String[][] options = {{"Bytecode is executed by JVM","Use of applet","Use of exception handling",
    "Dynamic binding between objects"},{"Dynamic","Architecture Neutral","Use of pointers","Object-oriented"},{"Object","int","long","void"},
            {"java.util package","java.lang package","java.awt package","java.io package"},{"Runnable Interface","Marker Interface",
            "Abstract Interface","CharSequence Interface"}};
    public String[] answers = {"Bytecode is executed by JVM","Use of pointers","int","java.util package","Marker Interface"};
    public int Scores = 0;
    public static int i = 0;
    public static final String k = "com.example.quizapp.Scores";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView2 = findViewById(R.id.textView2);
        radioGroup = findViewById(R.id.radioGroup);
        radioButton = findViewById(R.id.radioButton);
        radioButton2 =findViewById(R.id.radioButton2);
        radioButton3 = findViewById(R.id.radioButton3);
        radioButton4 = findViewById(R.id.radioButton4);
        button4 = findViewById(R.id.button4);
        textView2.setText(questions[i]);
        radioButton.setText(options[i][0]);
        radioButton2.setText(options[i][1]);
        radioButton3.setText(options[i][2]);
        radioButton4.setText(options[i][3]);
        Intent intent = new Intent(this,MainActivity2.class);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(radioGroup.getCheckedRadioButtonId()!=-1){
                    RadioButton r = radioGroup.findViewById(radioGroup.getCheckedRadioButtonId());
                    String s = r.getText().toString();
                    if(s.equals(answers[i]))
                        Scores++;
                }
                if(i==questions.length-1){
                    intent.putExtra(k,Integer.toString(Scores));
                    startActivity(intent);
                }
                i++;
                textView2.setText(questions[i]);
                radioButton.setText(options[i][0]);
                radioButton2.setText(options[i][1]);
                radioButton3.setText(options[i][2]);
                radioButton4.setText(options[i][3]);
                radioGroup.clearCheck();
            }
        });
    }
}