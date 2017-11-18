package com.example.yuna.game;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class ImKiwook extends AppCompatActivity implements professorBase {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_im_kiwook);

        final ViewFlipper viewflipper = (ViewFlipper) findViewById(R.id.ViewFlipperk);
        ImageView imageView101 = (ImageView) findViewById(R.id.imageView101);
        imageView101.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(1);
            }
        });

        Button button55 = (Button) findViewById(R.id.button55);
        button55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewflipper.setDisplayedChild(3);
            }
        });

        ImageView imageView117 = (ImageView) findViewById(R.id.imageView117);
        imageView117.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(2);
            }
        });

        ImageView imageView119 = (ImageView) findViewById(R.id.imageView119);
        imageView119.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(4);
            }
        });

        Button button57 = (Button) findViewById(R.id.button57);
        button57.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewflipper.setDisplayedChild(5);
            }
        });

        ImageView imageView121 = (ImageView) findViewById(R.id.imageView121);
        imageView121.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(6);
            }
        });

        Button button60 = (Button) findViewById(R.id.button60);
        button60.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewflipper.setDisplayedChild(7);
            }
        });

        ImageView imageView123 = (ImageView) findViewById(R.id.imageView123);
        imageView123.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(8);
            }
        });

        Button button63 = (Button) findViewById(R.id.button63);
        button63.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewflipper.setDisplayedChild(9);
            }
        });

        ImageView imageView125 = (ImageView) findViewById(R.id.imageView125);
        imageView125.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(10);
            }
        });

        Button button64 = (Button) findViewById(R.id.button64);
        button64.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewflipper.setDisplayedChild(11);
            }
        });

        Button button62 = (Button) findViewById(R.id.button62);
        button62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewflipper.setDisplayedChild(11);
            }
        });

        ImageView imageView127 = (ImageView) findViewById(R.id.imageView127);
        imageView127.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(12);
            }
        });

        Button button61 = (Button) findViewById(R.id.button61);
        button61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewflipper.setDisplayedChild(13);
            }
        });

        ImageView imageView130 = (ImageView) findViewById(R.id.imageView130);
        imageView130.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(12);
            }
        });

        Button button58 = (Button) findViewById(R.id.button58);
        button58.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewflipper.setDisplayedChild(14);
            }
        });

        ImageView imageView131 = (ImageView) findViewById(R.id.imageView131);
        imageView131.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(10);
            }
        });

        Button button56 = (Button) findViewById(R.id.button56);
        button56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewflipper.setDisplayedChild(12);
            }
        });

    }
}
