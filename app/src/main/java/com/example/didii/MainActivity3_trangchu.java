package com.example.didii;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3_trangchu extends AppCompatActivity {
    Button button;
    TextView tv1, tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity3_trangchu);

        tv1 = (TextView) findViewById(R.id.btnClick_diadiemin);
        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity3_trangchu.this, MainActivity4_diadiemin.class);
                startActivity(i);
            }
        });

        tv2 = (TextView) findViewById(R.id.btnClick_diadiemout);
        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity3_trangchu.this, MainActivity4_diadiemout.class);
                startActivity(i);
            }
        });

        button = (Button) findViewById(R.id.btnClickHome);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity3_trangchu.this,
                        "Bạn đang ở mục 'Trang Chủ'",
                        Toast.LENGTH_SHORT).show();
            }
        });

        button = (Button) findViewById(R.id.btnClick_Mytour);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity3_trangchu.this, MainActivity_mytour.class);
                startActivity(i);
            }
        });

        button = (Button) findViewById(R.id.btnClick_News);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity3_trangchu.this, MainActivity_news.class);
                startActivity(i);
            }
        });

        button = (Button) findViewById(R.id.btnClick_me);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity3_trangchu.this, MainActivity_me.class);
                startActivity(i);
            }
        });
    }
}