package com.example.didii;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity4_diadiemin extends AppCompatActivity {

    Button button;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity4_diadiemin);

        button = (Button) findViewById(R.id.btnClickHome);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity4_diadiemin.this, MainActivity3_trangchu.class);
                startActivity(i);
            }
        });

        textView = (TextView) findViewById(R.id.btnClick_hagiang);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity4_diadiemin.this, MainActivity5_in_hagiang.class);
                startActivity(i);
            }
        });
    }
}