package com.fatma.sayac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button button;
    int i;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textView);
        i=0;

    }
    public void say(View view){
        i++;
        textView.setText("S ayı: "+i);



    }
    public void restart(View view){
        Intent intent= new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}