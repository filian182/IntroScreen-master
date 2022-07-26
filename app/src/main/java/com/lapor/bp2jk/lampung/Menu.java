package com.lapor.bp2jk.lampung;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;


public class Menu extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        CardView cdBukutamu = findViewById(R.id.cdbukutamu);
        CardView cdAset = findViewById(R.id.cdaset);
        CardView cdkepuasan = findViewById(R.id.cdkepuasan);
        CardView cdlapor = findViewById(R.id.cdlapor);
        /// myImageButtontri = (Button) findViewById(R.id.imageButton4);///
        CardView cdsdm = findViewById(R.id.cdsdm);

        cdAset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Menu.this, AsetActivity.class);
                intent.putExtra("ViewType", "assets");
                startActivity(intent);
            }
        });


        cdsdm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Menu.this, SdmActivity.class);
                startActivity(intent);
            }
        });

        cdlapor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Menu.this, MainActivity.class);
                startActivity(intent);
            }
        });

        cdkepuasan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://docs.google.com/forms/d/e/1FAIpQLSfMSTTvDOumg9C1bkLmHhnuXweSYdgzATBVsni9wEZxViO8fw/viewform");
            }
        });

        cdBukutamu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.pedulilindungi.id/");
            }
          });
    }



    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }



    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setIcon(R.mipmap.ic_launcher)
                .setTitle("BP2JK Wilayah Lampung")
                .setMessage("Anda yakin ingin keluar?")
                .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }

                })
                .setNegativeButton("Tidak", null)
                .show();
    }
}