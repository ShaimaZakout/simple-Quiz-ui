package com.example.app4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Home extends AppCompatActivity {
         Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void goToBtn2(View view) {
        i=new Intent(this,Q2.class);
        startActivity(i);

    }

    public void goToBtn1(View view) {
        i=new Intent(this,Q1.class);
        startActivity(i);

    }

    public void goToBtn3(View view) {
        i=new Intent(this,Q3.class);
        startActivity(i);

    }

    public void goToBtn5(View view) {
        i=new Intent(this,Q5.class);
        startActivity(i);
    }

    public void goToBtn4(View view) {
        i=new Intent(this,Q4.class);
        startActivity(i);
    }

    public void goToBtn6(View view) {
        i=new Intent(this,Q6.class);
        startActivity(i);
    }
}
