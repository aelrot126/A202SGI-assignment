package com.example.yj.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class selection extends AppCompatActivity {

    Button gp;
    Button avanue;
    Button gpg;
    Button pp;
    Button ts;
    Button sq;
    Button qb;
    Button pm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);

        gp = (Button) findViewById(R.id.button2);
        gp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent start = new Intent(selection.this,gp.class);
                startActivity(start);




            }
        });
        avanue = (Button) findViewById(R.id.button3);
        avanue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent start = new Intent(selection.this,avanue.class);
                startActivity(start);
            }
        });
        gpg = (Button) findViewById(R.id.button4);
        gpg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent start = new Intent(selection.this,gpg.class);
                startActivity(start);
            }
        });
        pp = (Button) findViewById(R.id.button5);
        pp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent start = new Intent(selection.this,pp.class);
                startActivity(start);
            }
        });
        ts = (Button) findViewById(R.id.button6);
        ts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent start = new Intent(selection.this,ts.class);
                startActivity(start);
            }
        });
        sq = (Button) findViewById(R.id.button7);
        sq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent start = new Intent(selection.this,sq.class);
                startActivity(start);
            }
        });
        qb = (Button) findViewById(R.id.button8);
        qb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent start = new Intent(selection.this,qb.class);
                startActivity(start);
            }
        });
        pm = (Button) findViewById(R.id.button9);
        pm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent start = new Intent(selection.this,pm.class);
                startActivity(start);
            }
        });
    }
}
