package com.example.app4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Q1 extends AppCompatActivity {
        Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q1);

    }
    public void goTomenu(View view) {
        i=new Intent(this,Home.class);
        startActivity(i);
    }
    public void goToQ2(View v){
        i=new Intent(this,Q2.class);
        startActivity(i);
    }




}
