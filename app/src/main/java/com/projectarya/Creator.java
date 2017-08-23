package com.projectarya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Creator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creator);

        ImageButton next= (ImageButton) findViewById(R.id.ins);
        next.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent myIntent = new
                        Intent(v.getContext(), ig.class);
                startActivityForResult(myIntent, 0);
            }
        });
    }
}
