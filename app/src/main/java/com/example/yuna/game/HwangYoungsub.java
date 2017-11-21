package com.example.yuna.game;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class HwangYoungsub extends AppCompatActivity implements professorBase {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hwang_youngsub);

        final ViewFlipper viewflipper = (ViewFlipper) findViewById(R.id.ViewFlipperys);
        ImageView imageView240 = (ImageView) findViewById(R.id.imageView240);
        imageView240.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(1);
            }
        });

        ImageView imageView241 = (ImageView) findViewById(R.id.imageView241);
        imageView241.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(2);
            }
        });
        ImageView imageView242 = (ImageView) findViewById(R.id.imageView242);
        imageView242.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(3);
            }
        });
        ImageView imageView243 = (ImageView) findViewById(R.id.imageView243);
        imageView243.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(4);
            }
        });


        Button button87 = (Button) findViewById(R.id.button87);
        button87.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewflipper.setDisplayedChild(5);
            }
        });



        ImageView imageView245 = (ImageView) findViewById(R.id.imageView245);
        imageView245.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(6);
            }
        });

        ImageView imageView246 = (ImageView) findViewById(R.id.imageView246);
        imageView246.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(7);
            }
        });

        ImageView imageView247 = (ImageView) findViewById(R.id.imageView247);
        imageView247.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(8);
            }
        });

        ImageView imageView248 = (ImageView) findViewById(R.id.imageView248);
        imageView248.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(9);
            }
        });

        ImageView imageView249 = (ImageView) findViewById(R.id.imageView249);
        imageView249.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(10);
            }
        });



        Button button88 = (Button) findViewById(R.id.button88);
        button88.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewflipper.setDisplayedChild(11);
            }
        });


        ImageView imageView251 = (ImageView) findViewById(R.id.imageView251);
        imageView251.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(12);
            }
        });

        ImageView imageView252 = (ImageView) findViewById(R.id.imageView252);
        imageView252.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(13);
            }
        });

        ImageView imageView253 = (ImageView) findViewById(R.id.imageView253);
        imageView253.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(14);
            }
        });

        ImageView imageView254 = (ImageView) findViewById(R.id.imageView254);
        imageView254.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(15);
            }
        });

        ImageView imageView255 = (ImageView) findViewById(R.id.imageView255);
        imageView255.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(16);
            }
        });


        Button button89 = (Button) findViewById(R.id.button89);
        button89.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewflipper.setDisplayedChild(17);
            }
        });

        ImageView imageView257 = (ImageView) findViewById(R.id.imageView257);
        imageView257.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(18);
            }
        });

        ImageView imageView258 = (ImageView) findViewById(R.id.imageView258);
        imageView258.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(19);
            }
        });


        Button button90 = (Button) findViewById(R.id.button90);
        button90.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewflipper.setDisplayedChild(20);
            }
        });


        ImageView imageView260 = (ImageView) findViewById(R.id.imageView260);
        imageView260.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(21);
            }
        });



        ImageView imageView261 = (ImageView) findViewById(R.id.imageView261);
        imageView261.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(22);
            }
        });





    }
}
