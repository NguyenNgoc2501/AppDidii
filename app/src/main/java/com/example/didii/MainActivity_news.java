package com.example.didii;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity_news extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_news);

        button = (Button) findViewById(R.id.btnClickHome);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity_news.this, MainActivity3_trangchu.class);
                startActivity(i);
            }
        });

        button = (Button) findViewById(R.id.btnClick_Mytour);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity_news.this, MainActivity_mytour.class);
                startActivity(i);
            }
        });

        button = (Button) findViewById(R.id.btnClick_News);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity_news.this,
                        "Bạn đang ở mục 'Tin Tức - Sự Kiện'",
                        Toast.LENGTH_SHORT).show();
            }
        });

        button = (Button) findViewById(R.id.btnClick_me);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity_news.this, MainActivity_me.class);
                startActivity(i);
            }
        });
    }
}