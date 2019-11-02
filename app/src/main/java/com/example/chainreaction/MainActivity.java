package com.example.chainreaction;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    boolean p1 = false, p2 = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ConstraintLayout l = findViewById(R.id.con);
        for (int i = 0; i <= 5; i++)
            for (int j = 0; j <= 5; j++) {
                final Button b = new Button(this);
                b.setX((j * 160) + 50);
                b.setY((i * 160) + 200);
                b.setLayoutParams(new LinearLayout.LayoutParams(150, 150));
                b.setId((i * 10) + j);
                b.setText("0");
                l.addView(b);
            }

        //while(true)
        {
            for (int i = 0; i <= 5; i++)
                for (int j = 0; j <= 5; j++) {
                    final Button b = findViewById((i * 10) + j);
                    b.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            b.setText("" + ((Integer.parseInt("" + b.getText())) + 1));
                            check();
                        }
                    });
                }
        }

    }

    public void check() {
        int fl = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j <= 5; j++) {
                int id = (i * 10) + j;
                Button a, b = findViewById(id);
                if (id == 0 && Integer.parseInt("" + b.getText()) >1) {

                    a = findViewById(id + 1);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    a = findViewById(id + 10);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    b.setText("" + ((Integer.parseInt("" + b.getText()))%2));
                    fl = 1;
                    check();
                }
                if (id == 05 && Integer.parseInt("" + b.getText()) >1) {
                    a = findViewById(id - 1);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    a = findViewById(id + 10);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    b.setText("" + ((Integer.parseInt("" + b.getText()))%2));
                    fl = 1;
                    check();
                }
                if (id == 50 && Integer.parseInt("" + b.getText()) >1) {
                    a = findViewById(id + 1);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    a = findViewById(id - 10);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    b.setText("" + ((Integer.parseInt("" + b.getText()))%2));
                    fl = 1;
                    check();
                }
                if (id == 55 && Integer.parseInt("" + b.getText()) >1) {
                    a = findViewById(id - 1);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    a = findViewById(id - 10);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    b.setText("" + ((Integer.parseInt("" + b.getText()))%2));
                    fl = 1;
                    check();
                }
                if (id == 01 && Integer.parseInt("" + b.getText()) >2) {
                    a = findViewById(id + 1);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    a = findViewById(id + 10);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    a = findViewById(id - 1);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    b.setText("" + ((Integer.parseInt("" + b.getText()))%3));
                    fl = 1;
                    check();
                }
                if (id == 02 && Integer.parseInt("" + b.getText()) >2) {
                    a = findViewById(id + 1);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    a = findViewById(id + 10);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    a = findViewById(id - 1);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    b.setText("" + ((Integer.parseInt("" + b.getText()))%3));
                    fl = 1;
                    check();
                }
                if (id == 03 && Integer.parseInt("" + b.getText()) >2) {
                    a = findViewById(id + 1);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    a = findViewById(id + 10);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    a = findViewById(id - 1);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    b.setText("" + ((Integer.parseInt("" + b.getText()))%3));
                    fl = 1;
                    check();
                }
                if (id == 04 && Integer.parseInt("" + b.getText()) >2) {
                    a = findViewById(id + 1);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    a = findViewById(id + 10);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    a = findViewById(id - 1);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    b.setText("" + ((Integer.parseInt("" + b.getText()))%3));
                    fl = 1;
                    check();
                }
                if (id == 51 && Integer.parseInt("" + b.getText()) >2) {
                    a = findViewById(id + 1);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    a = findViewById(id - 10);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    a = findViewById(id - 1);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    b.setText("" + ((Integer.parseInt("" + b.getText()))%3));
                    fl = 1;
                    check();
                }
                if (id == 52 && Integer.parseInt("" + b.getText()) >2) {
                    a = findViewById(id + 1);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    a = findViewById(id - 10);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    a = findViewById(id - 1);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    b.setText("" + ((Integer.parseInt("" + b.getText()))%3));
                    fl = 1;
                    check();
                }
                if (id == 53 && Integer.parseInt("" + b.getText()) >2) {
                    a = findViewById(id + 1);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    a = findViewById(id - 10);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    a = findViewById(id - 1);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    b.setText("" + ((Integer.parseInt("" + b.getText()))%3));
                    fl = 1;
                    check();
                }
                if (id == 54 && Integer.parseInt("" + b.getText()) >2) {
                    a = findViewById(id + 1);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    a = findViewById(id - 10);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    a = findViewById(id - 1);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    b.setText("" + ((Integer.parseInt("" + b.getText()))%3));
                    fl = 1;
                    check();
                }
                if (id == 10 && Integer.parseInt("" + b.getText()) >2) {
                    a = findViewById(id + 1);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    a = findViewById(id - 10);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    a = findViewById(id + 10);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    b.setText("" + ((Integer.parseInt("" + b.getText()))%3));
                    fl = 1;
                    check();
                }
                if (id == 20 && Integer.parseInt("" + b.getText()) >2) {
                    a = findViewById(id + 1);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    a = findViewById(id - 10);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    a = findViewById(id + 10);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    b.setText("" + ((Integer.parseInt("" + b.getText()))%3));
                    fl = 1;
                    check();
                }
                if (id == 30 && Integer.parseInt("" + b.getText()) >2) {
                    a = findViewById(id + 1);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    a = findViewById(id - 10);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    a = findViewById(id + 10);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    b.setText("" + ((Integer.parseInt("" + b.getText()))%3));
                    fl = 1;
                    check();
                }
                if (id == 40 && Integer.parseInt("" + b.getText()) >2) {
                    a = findViewById(id + 1);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    a = findViewById(id - 10);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    a = findViewById(id + 10);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    b.setText("" + ((Integer.parseInt("" + b.getText()))%3));
                    fl = 1;
                    check();
                }
                if (id == 15 && Integer.parseInt("" + b.getText()) >2) {
                    a = findViewById(id - 1);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    a = findViewById(id - 10);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    a = findViewById(id + 10);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    b.setText("" + ((Integer.parseInt("" + b.getText()))%3));
                    fl = 1;
                    check();
                }
                if (id == 25 && Integer.parseInt("" + b.getText()) >2) {
                    a = findViewById(id - 1);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    a = findViewById(id - 10);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    a = findViewById(id + 10);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    b.setText("" + ((Integer.parseInt("" + b.getText()))%3));
                    fl = 1;
                    check();
                }
                if (id == 35 && Integer.parseInt("" + b.getText()) >2) {
                    a = findViewById(id - 1);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    a = findViewById(id - 10);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    a = findViewById(id + 10);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    b.setText("" + ((Integer.parseInt("" + b.getText()))%3));
                    fl = 1;
                    check();
                }
                if (id == 45 && Integer.parseInt("" + b.getText()) >2) {
                    a = findViewById(id - 1);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    a = findViewById(id - 10);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    a = findViewById(id + 10);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    b.setText("" + ((Integer.parseInt("" + b.getText()))%3));
                    fl = 1;
                    check();
                }
                if (id == 44 && Integer.parseInt("" + b.getText()) >3) {
                    a = findViewById(id - 1);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    a = findViewById(id + 1);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    a = findViewById(id - 10);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    a = findViewById(id + 10);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    b.setText("" + ((Integer.parseInt("" + b.getText()))%4));
                    fl = 1;
                    check();
                }
                if (id == 43 && Integer.parseInt("" + b.getText()) >3) {
                    a = findViewById(id - 1);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    a = findViewById(id + 1);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    a = findViewById(id - 10);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    a = findViewById(id + 10);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    b.setText("" + ((Integer.parseInt("" + b.getText()))%4));
                    fl = 1;
                    check();
                }
                if (id == 42 && Integer.parseInt("" + b.getText()) >3) {
                    a = findViewById(id - 1);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    a = findViewById(id + 1);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    a = findViewById(id - 10);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    a = findViewById(id + 10);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    b.setText("" + ((Integer.parseInt("" + b.getText()))%4));
                    fl = 1;
                    check();
                }
                if (id == 41 && Integer.parseInt("" + b.getText()) >3) {
                    a = findViewById(id - 1);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    a = findViewById(id + 1);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    a = findViewById(id - 10);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    a = findViewById(id + 10);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    b.setText("" + ((Integer.parseInt("" + b.getText()))%4));
                    fl = 1;
                    check();
                }
                if (id == 34 && Integer.parseInt("" + b.getText()) >3) {
                    a = findViewById(id - 1);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    a = findViewById(id + 1);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    a = findViewById(id - 10);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    a = findViewById(id + 10);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    b.setText("" + ((Integer.parseInt("" + b.getText()))%4));
                    fl = 1;
                    check();
                }
                if (id == 33 && Integer.parseInt("" + b.getText()) >3) {
                    a = findViewById(id - 1);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    a = findViewById(id + 1);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    a = findViewById(id - 10);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    a = findViewById(id + 10);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    b.setText("" + ((Integer.parseInt("" + b.getText()))%4));
                    fl = 1;
                    check();
                }
                if (id == 32 && Integer.parseInt("" + b.getText()) >3) {
                    a = findViewById(id - 1);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    a = findViewById(id + 1);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    a = findViewById(id - 10);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    a = findViewById(id + 10);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    b.setText("" + ((Integer.parseInt("" + b.getText()))%4));
                    fl = 1;
                    check();
                }
                if (id == 31 && Integer.parseInt("" + b.getText()) >3) {
                    a = findViewById(id - 1);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    a = findViewById(id + 1);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    a = findViewById(id - 10);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    a = findViewById(id + 10);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    b.setText("" + ((Integer.parseInt("" + b.getText()))%4));
                    fl = 1;
                    check();
                }
                if (id == 24 && Integer.parseInt("" + b.getText()) >3) {
                    a = findViewById(id - 1);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    a = findViewById(id + 1);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    a = findViewById(id - 10);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    a = findViewById(id + 10);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    b.setText("" + ((Integer.parseInt("" + b.getText()))%4));
                    fl = 1;
                    check();
                }
                if (id == 23 && Integer.parseInt("" + b.getText()) >3) {
                    a = findViewById(id - 1);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    a = findViewById(id + 1);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    a = findViewById(id - 10);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    a = findViewById(id + 10);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    b.setText("" + ((Integer.parseInt("" + b.getText()))%4));
                    fl = 1;
                    check();
                }
                if (id == 22 && Integer.parseInt("" + b.getText()) >3) {
                    a = findViewById(id - 1);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    a = findViewById(id + 1);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    a = findViewById(id - 10);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    a = findViewById(id + 10);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    b.setText("" + ((Integer.parseInt("" + b.getText()))%4));
                    fl = 1;
                    check();
                }
                if (id == 21 && Integer.parseInt("" + b.getText()) >3) {
                    a = findViewById(id - 1);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    a = findViewById(id + 1);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    a = findViewById(id - 10);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    a = findViewById(id + 10);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    b.setText("" + ((Integer.parseInt("" + b.getText()))%4));
                    fl = 1;
                    check();
                }
                if (id == 14 && Integer.parseInt("" + b.getText()) >3) {
                    a = findViewById(id - 1);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    a = findViewById(id + 1);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    a = findViewById(id - 10);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    a = findViewById(id + 10);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    b.setText("" + ((Integer.parseInt("" + b.getText()))%4));
                    fl = 1;
                    check();
                }
                if (id == 13 && Integer.parseInt("" + b.getText()) >3) {
                    a = findViewById(id - 1);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    a = findViewById(id + 1);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    a = findViewById(id - 10);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    a = findViewById(id + 10);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    b.setText("" + ((Integer.parseInt("" + b.getText()))%4));
                    fl = 1;
                    check();
                }
                if (id == 12 && Integer.parseInt("" + b.getText()) >3) {
                    a = findViewById(id - 1);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    a = findViewById(id + 1);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    a = findViewById(id - 10);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    a = findViewById(id + 10);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    b.setText("" + ((Integer.parseInt("" + b.getText()))%4));
                    fl = 1;
                    check();
                }
                if (id == 11 && Integer.parseInt("" + b.getText()) >3) {
                    a = findViewById(id - 1);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    a = findViewById(id + 1);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    a = findViewById(id - 10);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    a = findViewById(id + 10);
                    a.setText("" + (Integer.parseInt("" + a.getText()) + 1));
                    b.setText("" + ((Integer.parseInt("" + b.getText()))%4));
                    fl = 1;
                    check();
                }
            }

        }
        if(fl==1)
        {
            fl=0;
            check();
        }



    }

}