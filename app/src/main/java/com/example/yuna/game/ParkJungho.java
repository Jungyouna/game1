package com.example.yuna.game;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class ParkJungho extends AppCompatActivity implements professorBase {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_park_jungho);

        final ViewFlipper viewflipper = (ViewFlipper) findViewById(R.id.viewFlipperj);
        ImageView imageView14j = (ImageView) findViewById(R.id.imageView14j);
        imageView14j.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(1);
            }
        });

        Button button3j = (Button) findViewById(R.id.button3j);
        button3j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewflipper.setDisplayedChild(2);
            }
        });
        Button button2j = (Button) findViewById(R.id.button2j);
        button2j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewflipper.setDisplayedChild(8);
            }
        });

        ImageView imageView4 = (ImageView) findViewById(R.id.imageView4);
        imageView4.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(3);
            }
        });

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewflipper.setDisplayedChild(4);
            }
        });
        Button button4 =(Button)findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewflipper.setDisplayedChild(6);
            }
        });

        ImageView imageView22 = (ImageView) findViewById(R.id.imageView22);
        imageView22.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(5);
            }
        });

        ImageView imageView25 = (ImageView) findViewById(R.id.imageView25);
        imageView25.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(7);
            }
        });

        ImageView imageView26 = (ImageView) findViewById(R.id.imageView26);
        imageView26.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(9);
            }
        });

        Button button2jj =(Button)findViewById(R.id.button2jj);
        button2jj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewflipper.setDisplayedChild(10);
            }
        });

        ImageView imageView28 = (ImageView) findViewById(R.id.imageView28);
        imageView28.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(11);
            }
        });

        ImageView imageView29 = (ImageView) findViewById(R.id.imageView29);
        imageView29.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(12);
            }
        });

        ImageView imageView30 = (ImageView) findViewById(R.id.imageView30);
        imageView30.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(13);
            }
        });

        Button button5 =(Button)findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewflipper.setDisplayedChild(14);
            }
        });

        ImageView imageView32 = (ImageView) findViewById(R.id.imageView32);
        imageView32.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(15);
            }
        });

        Button button6 =(Button)findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewflipper.setDisplayedChild(16);
            }
        });

        Button button7 =(Button)findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewflipper.setDisplayedChild(16);
            }
        });

        Button button4jj =(Button)findViewById(R.id.button4jj);
        button4jj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewflipper.setDisplayedChild(17);
            }
        });

        ImageView imageView34 = (ImageView) findViewById(R.id.imageView34);
        imageView34.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(7);
            }
        });

        ImageView imageView35 = (ImageView) findViewById(R.id.imageView35);
        imageView35.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(7);
            }
        });
    }
}
