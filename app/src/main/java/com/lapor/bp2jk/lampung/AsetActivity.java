package com.lapor.bp2jk.lampung;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;


public class AsetActivity extends AppCompatActivity {

    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aset);

        pdfView = findViewById(R.id.pdfViewer);

        PDFView pdfView = findViewById(R.id.pdfViewer);
        pdfView.fromAsset("bmnbp2jk.pdf")
                .enableSwipe(true)
                .enableDoubletap(false)
                .load();


        }
    }
