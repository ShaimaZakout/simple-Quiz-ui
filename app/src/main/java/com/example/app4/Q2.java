package com.example.app4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Q2 extends AppCompatActivity {
   Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q2);
    }
    public void goTomenu(View view) {
        i=new Intent(this,Home.class);
        startActivity(i);
    }

    public void goToQ3(View v){
        i=new Intent(this,Q3.class);
        startActivity(i);
    }

}
