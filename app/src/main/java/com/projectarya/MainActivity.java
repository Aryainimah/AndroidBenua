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

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button next = (Button) findViewById(R.id.negara);
        next.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent myIntent = new
                        Intent(v.getContext(), Negara.class);
                startActivityForResult(myIntent, 0);
            }
        });

        next = (Button) findViewById(R.id.creator);
        next.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent myIntent = new
                        Intent(v.getContext(), Creator.class);
                startActivityForResult(myIntent, 0);
            }
        });

        ImageButton next2 = (ImageButton) findViewById(R.id.smk);
        next2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent myIntent = new
                        Intent(v.getContext(), Link.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button exit = (Button) findViewById(R.id.exit);
        exit.setOnClickListener(this);}
    public void onClick(View clicked) {
        switch (clicked.getId()) {
            case R.id.exit:
                exit();
                break;
        }
    }

    private void exit() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Apakah Kamu Benar Benar Ingin Keluar?")
                .setCancelable(false)
                .setPositiveButton("Ya", new
                        DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                MainActivity.this.finish();
                            }
                        })
                .setNegativeButton("Tidak", new
                        DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int arg1) {
                                dialog.cancel();
                            }
                        }).show();
    }
}

