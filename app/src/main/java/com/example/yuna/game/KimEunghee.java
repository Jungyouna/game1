package com.example.yuna.game;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class KimEunghee extends AppCompatActivity implements professorBase {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kim_eunghee);


        final ViewFlipper viewflipper = (ViewFlipper) findViewById(R.id.ViewFlippereh);
        ImageView imageView225 = (ImageView) findViewById(R.id.imageView225);
        imageView225.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(1);
            }
        });


        ImageView imageView226 = (ImageView) findViewById(R.id.imageView226);
        imageView226.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(2);
            }
        });


        ImageView imageView227 = (ImageView) findViewById(R.id.imageView227);
        imageView227.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(3);
            }
        });


        ImageView imageView228 = (ImageView) findViewById(R.id.imageView228);
        imageView228.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(4);
            }
        });


        ImageView imageView229 = (ImageView) findViewById(R.id.imageView229);
        imageView229.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(5);
            }
        });


        ImageView imageView230 = (ImageView) findViewById(R.id.imageView230);
        imageView230.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(6);
            }
        });


        ImageView imageView231 = (ImageView) findViewById(R.id.imageView231);
        imageView231.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(7);
            }
        });



        Button button85 = (Button) findViewById(R.id.button85);
        button85.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewflipper.setDisplayedChild(8);
            }
        });


        ImageView imageView233 = (ImageView) findViewById(R.id.imageView233);
        imageView233.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(9);
            }
        });


        ImageView imageView234 = (ImageView) findViewById(R.id.imageView234);
        imageView234.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(10);
            }
        });















    }
}
