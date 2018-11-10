package com.example.jack.mcarz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class salesdashboard extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button butt1 = (Button) findViewById(R.id.button1);
        Button butt2 = (Button) findViewById(R.id.button2);
        Button butt3 = (Button) findViewById(R.id.button3);


        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 = new Intent(salesdashboard.this, MapsActivity.class);
            }
        });

        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 = new Intent(salesdashboard.this, spares.class);
            }
        });


    }
}