package com.example.app4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Q6 extends AppCompatActivity {
      Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q6);
    }

    public void goTomenu(View view) {
        i=new Intent(this,Home.class);
        startActivity(i);
    }

    public void endMenu(View view) {
        Toast.makeText(this,"End menue",Toast.LENGTH_LONG).show();
        i=new Intent(this,Home.class);
        startActivity(i);
    }
}
