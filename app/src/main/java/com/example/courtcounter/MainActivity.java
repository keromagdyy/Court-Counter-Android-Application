package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txt1;
    TextView txt2;

    int i1 = 0;
    int i2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button p3_1 = (Button) findViewById(R.id.p3_1);
        Button p3_2 = (Button) findViewById(R.id.p3_2);
        Button p2_1 = (Button) findViewById(R.id.p2_1);
        Button p2_2 = (Button) findViewById(R.id.p2_2);
        Button fp1 = (Button) findViewById(R.id.fp1);
        Button fp2 = (Button) findViewById(R.id.fp2);
        Button btnres = (Button) findViewById(R.id.btnReset);
        txt1 = (TextView) findViewById(R.id.txt1);
        txt2 = (TextView) findViewById(R.id.txt2);

        p3_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inc1(3);
            }
        });
        p2_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inc1(2);
            }
        });
        fp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inc1(1);
            }
        });

        p3_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inc2(3);
            }
        });
        p2_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inc2(2);
            }
        });
        fp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inc2(1);
            }
        });

        btnres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i1=0;
                i2=0;
                txt1.setText(i1+"");
                txt2.setText(i2+"");
            }
        });
    }

    public void inc1(int i){
        i1 +=i;
        txt1.setText(i1+"");
    }

    public void inc2(int i){
        i2 +=i;
        txt2.setText(i2+"");
    }
}
