package com.example.yuna.game;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class PrologueActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prologue);

        final ViewFlipper viewflipper = (ViewFlipper) findViewById(R.id.viewflipper);
        ImageView imageView13 = (ImageView) findViewById(R.id.imageView13);
        ImageView imageView21 = (ImageView) findViewById(R.id.imageView21);
        ImageView imageView22 = (ImageView) findViewById(R.id.imageView22);
        ImageView imageView28 = (ImageView) findViewById(R.id.imageView28);
        ImageView imageView29 = (ImageView) findViewById(R.id.imageView29);
        ImageView imageView30 = (ImageView) findViewById(R.id.imageView30);
        ImageView imageView32 = (ImageView) findViewById(R.id.imageView32);
        ImageView imageView36 = (ImageView) findViewById(R.id.imageView36);
        ImageView imageView37 = (ImageView) findViewById(R.id.imageView37);
        ImageView imageView38 = (ImageView) findViewById(R.id.imageView38);


        imageView13.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.showNext();
            }
        });
        imageView21.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.showNext();
            }
        });
        imageView22.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.showNext();
            }
        });
        imageView28.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.showNext();
            }
        });
        imageView29.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.showNext();
            }
        });
        imageView30.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.showNext();
            }
        });
        imageView32.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.showNext();
            }
        });
        imageView36.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.showNext();
            }
        });
        imageView37.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.showNext();
            }
        });
        imageView38.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), GamestartActivity.class);
                startActivity(intent);
            }
        });
    }
}
