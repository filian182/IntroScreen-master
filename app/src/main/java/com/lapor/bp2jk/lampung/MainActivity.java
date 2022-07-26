package com.lapor.bp2jk.lampung;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {

    Button myImageButtonone;
    Button myImageButtontwo;
    Button myImageButtontri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myImageButtonone = (Button) findViewById(R.id.imageButton2);
        myImageButtontwo = (Button) findViewById(R.id.imageButton3);
        myImageButtontri = (Button) findViewById(R.id.imageButton4);


        myImageButtonone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent one = new Intent(MainActivity.this, InfoActivity.class);
                startActivity(one);
            }
        });

        myImageButtontwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://docs.google.com/forms/d/e/1FAIpQLSe-m9wPAw1aaK1C123CCXclKrV600GUOoQt-zMUWRemsDkToQ/viewform");
            }
        });

        myImageButtontri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tri = new Intent(MainActivity.this, CekActivity.class);
                startActivity(tri);
            }
        });

    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }



        @Override public boolean onCreateOptionsMenu(Menu menu) {
// Inflate the menu; this adds items to the action bar if it is present. getMenuInflater().inflate(R.menu.menu_main, menu);
            return true;
        }
    }