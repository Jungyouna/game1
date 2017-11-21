package com.example.yuna.game;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class KwonJinbaek extends AppCompatActivity implements professorBase {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kwon_jinbaek);

        final ViewFlipper viewflipper = (ViewFlipper) findViewById(R.id.ViewFlipperjb);
        ImageView imageView181 = (ImageView) findViewById(R.id.imageView181);
        imageView181.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(1);
            }
        });

        ImageView imageView182 = (ImageView) findViewById(R.id.imageView182);
        imageView182.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(2);
            }
        });

        ImageView imageView183 = (ImageView) findViewById(R.id.imageView183);
        imageView183.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(3);
            }
        });

        Button button74 = (Button) findViewById(R.id.button74);
        button74.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewflipper.setDisplayedChild(4);
            }
        });

        ImageView imageView185 = (ImageView) findViewById(R.id.imageView185);
        imageView185.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(5);
            }
        });

        ImageView imageView186 = (ImageView) findViewById(R.id.imageView186);
        imageView186.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(6);
            }
        });

        ImageView imageView187 = (ImageView) findViewById(R.id.imageView187);
        imageView187.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(7);
            }
        });

        Button button77 = (Button) findViewById(R.id.button77);
        button77.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewflipper.setDisplayedChild(8);
            }
        });

        ImageView imageView189 = (ImageView) findViewById(R.id.imageView189);
        imageView189.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(9);
            }
        });

        ImageView imageView190 = (ImageView) findViewById(R.id.imageView190);
        imageView190.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(10);
            }
        });

        ImageView imageView191 = (ImageView) findViewById(R.id.imageView191);
        imageView191.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(11);
            }
        });

        Button button76 = (Button) findViewById(R.id.button76);
        button76.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewflipper.setDisplayedChild(12);
            }
        });


        ImageView imageView193 = (ImageView) findViewById(R.id.imageView193);
        imageView193.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(13);
            }
        });


        ImageView imageView194 = (ImageView) findViewById(R.id.imageView194);
        imageView194.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(14);
            }
        });


        ImageView imageView195 = (ImageView) findViewById(R.id.imageView195);
        imageView195.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(15);
            }
        });

        Button button75 = (Button) findViewById(R.id.button75);
        button75.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewflipper.setDisplayedChild(16);
            }
        });


        ImageView imageView197 = (ImageView) findViewById(R.id.imageView197);
        imageView197.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(17);
            }
        });

        Button button78 = (Button) findViewById(R.id.button78);
        button78.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewflipper.setDisplayedChild(18);
            }
        });

        ImageView imageView199 = (ImageView) findViewById(R.id.imageView199);
        imageView199.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(19);
            }
        });

        ImageView imageView200 = (ImageView) findViewById(R.id.imageView200);
        imageView200.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(20);
            }
        });

        Button button79 = (Button) findViewById(R.id.button79);
        button79.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewflipper.setDisplayedChild(21);
            }
        });

        ImageView imageView202 = (ImageView) findViewById(R.id.imageView202);
        imageView202.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(22);
            }
        });



    }
}
