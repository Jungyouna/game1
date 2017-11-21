package com.example.yuna.game;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class ChoiSunghee extends AppCompatActivity implements professorBase {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choi_sunghee);


        final ViewFlipper viewflipper = (ViewFlipper) findViewById(R.id.ViewFlippersh);
        ImageView imageView204 = (ImageView) findViewById(R.id.imageView204);
        imageView204.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(1);
            }
        });



        ImageView imageView205 = (ImageView) findViewById(R.id.imageView205);
        imageView205.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(2);
            }
        });



        ImageView imageView206 = (ImageView) findViewById(R.id.imageView206);
        imageView206.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(3);
            }
        });

        ImageView imageView207 = (ImageView) findViewById(R.id.imageView207);
        imageView207.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(4);
            }
        });



        Button button80 = (Button) findViewById(R.id.button80);
        button80.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewflipper.setDisplayedChild(5);
            }
        });


        ImageView imageView209 = (ImageView) findViewById(R.id.imageView209);
        imageView209.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(6);
            }
        });


        ImageView imageView210 = (ImageView) findViewById(R.id.imageView210);
        imageView210.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(7);
            }
        });


        Button button82 = (Button) findViewById(R.id.button82);
        button82.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewflipper.setDisplayedChild(8);
            }
        });


        ImageView imageView213 = (ImageView) findViewById(R.id.imageView213);
        imageView213.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(9);
            }
        });


        ImageView imageView214 = (ImageView) findViewById(R.id.imageView214);
        imageView214.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(10);
            }
        });

        Button button81 = (Button) findViewById(R.id.button81);
        button81.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewflipper.setDisplayedChild(11);
            }
        });


        ImageView imageView216 = (ImageView) findViewById(R.id.imageView216);
        imageView216.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(12);
            }
        });

        ImageView imageView217 = (ImageView) findViewById(R.id.imageView217);
        imageView217.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(13);
            }
        });


        Button button83 = (Button) findViewById(R.id.button83);
        button83.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewflipper.setDisplayedChild(14);
            }
        });



        ImageView imageView219 = (ImageView) findViewById(R.id.imageView219);
        imageView219.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(15);
            }
        });



        ImageView imageView220 = (ImageView) findViewById(R.id.imageView220);
        imageView220.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(16);
            }
        });


        Button button84 = (Button) findViewById(R.id.button84);
        button84.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewflipper.setDisplayedChild(17);
            }
        });



        ImageView imageView222 = (ImageView) findViewById(R.id.imageView222);
        imageView222.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(18);
            }
        });



        ImageView imageView223 = (ImageView) findViewById(R.id.imageView223);
        imageView223.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(19);
            }
        });




    }
}
