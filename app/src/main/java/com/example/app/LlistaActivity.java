package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LlistaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_llista2);


        final Button ran = findViewById(R.id.retorn);
        ran.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LlistaActivity.this,MainActivity.class);
                startActivity(intent);

            }
        });
    }
}