package com.example.app4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Q3 extends AppCompatActivity {
 Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q3);
    }
    public void goTomenu(View view) {
        i=new Intent(this,Home.class);
        startActivity(i);
    }
    public void goToQ4(View v){
        i=new Intent(this,Q4.class);
        startActivity(i);
    }


}
