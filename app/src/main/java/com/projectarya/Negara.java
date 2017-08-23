package com.projectarya;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Negara extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_negara);

        ImageButton next= (ImageButton) findViewById(R.id.indonesia);
        next.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent myIntent = new
                        Intent(v.getContext(), Indonesia.class);
                startActivityForResult(myIntent, 0);
            }
        });

        ImageButton next2= (ImageButton) findViewById(R.id.filipina);
        next2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent myIntent = new
                        Intent(v.getContext(), Filipina.class);
                startActivityForResult(myIntent, 0);
            }
        });

        ImageButton next3= (ImageButton) findViewById(R.id.brunei);
        next3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent myIntent = new
                        Intent(v.getContext(), Brunei.class);
                startActivityForResult(myIntent, 0);
            }
        });

        ImageButton next4= (ImageButton) findViewById(R.id.malaysia);
        next4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent myIntent = new
                        Intent(v.getContext(), Malaysia.class);
                startActivityForResult(myIntent, 0);
            }
        });

        ImageButton next5= (ImageButton) findViewById(R.id.myanmar);
        next5.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent myIntent = new
                        Intent(v.getContext(), Myanmar.class);
                startActivityForResult(myIntent, 0);
            }
        });

        ImageButton next6= (ImageButton) findViewById(R.id.timorleste);
        next6.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent myIntent = new
                        Intent(v.getContext(), TimorLeste.class);
                startActivityForResult(myIntent, 0);
            }
        });

        ImageButton next7= (ImageButton) findViewById(R.id.singapura);
        next7.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent myIntent = new
                        Intent(v.getContext(), Singapura.class);
                startActivityForResult(myIntent, 0);
            }
        });

        ImageButton next8= (ImageButton) findViewById(R.id.vietnam);
        next8.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent myIntent = new
                        Intent(v.getContext(), Vietnam.class);
                startActivityForResult(myIntent, 0);
            }
        });

        ImageButton next9= (ImageButton) findViewById(R.id.kamboja);
        next9.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent myIntent = new
                        Intent(v.getContext(), Kamboja.class);
                startActivityForResult(myIntent, 0);
            }
        });

        ImageButton next10= (ImageButton) findViewById(R.id.laos);
        next10.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent myIntent = new
                        Intent(v.getContext(), Laos.class);
                startActivityForResult(myIntent, 0);
            }
        });

        ImageButton next11= (ImageButton) findViewById(R.id.thailand);
        next11.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent myIntent = new
                        Intent(v.getContext(), Thailand.class);
                startActivityForResult(myIntent, 0);
            }
        });
    }

    @Override
    public void onClick(View v) {

    }
}
