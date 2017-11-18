package com.example.yuna.game;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class ChoiJaesung extends AppCompatActivity implements professorBase {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choi_jaesung);

        final ViewFlipper viewflipper = (ViewFlipper) findViewById(R.id.ViewFlipperc);
        ImageView imageView41 = (ImageView) findViewById(R.id.imageView41);
        imageView41.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(1);
            }
        });

        Button button43 = (Button) findViewById(R.id.button43);
        button43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewflipper.setDisplayedChild(2);
            }
        });

        ImageView imageView83 = (ImageView) findViewById(R.id.imageView83);
        imageView83.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(3);
            }
        });

        ImageView imageView97 = (ImageView) findViewById(R.id.imageView97);
        imageView97.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(4);
            }
        });

        ImageView imageView99 = (ImageView) findViewById(R.id.imageView99);
        imageView99.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(4);
            }
        });

        Button button46 = (Button) findViewById(R.id.button46);
        button46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewflipper.setDisplayedChild(5);
            }
        });

        Button button45 = (Button) findViewById(R.id.button45);
        button45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewflipper.setDisplayedChild(5);
            }
        });

        Button button47 = (Button) findViewById(R.id.button47);
        button47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewflipper.setDisplayedChild(6);
            }
        });

        ImageView imageView100 = (ImageView) findViewById(R.id.imageView100);
        imageView100.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(7);
            }
        });

        Button button44 = (Button) findViewById(R.id.button44);
        button44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewflipper.setDisplayedChild(8);
            }
        });

        ImageView imageView103 = (ImageView) findViewById(R.id.imageView103);
        imageView103.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(9);
            }
        });

        ImageView imageView104 = (ImageView) findViewById(R.id.imageView104);
        imageView104.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(10);
            }
        });

        ImageView imageView105 = (ImageView) findViewById(R.id.imageView105);
        imageView105.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(11);
            }
        });

        ImageView imageView106 = (ImageView) findViewById(R.id.imageView106);
        imageView106.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(12);
            }
        });

        ImageView imageView107 = (ImageView) findViewById(R.id.imageView107);
        imageView107.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(13);
            }
        });

        Button button51 = (Button) findViewById(R.id.button51);
        button51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewflipper.setDisplayedChild(15);
            }
        });

        ImageView imageView109 = (ImageView) findViewById(R.id.imageView109);
        imageView109.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(7);
            }
        });

        Button button50 = (Button) findViewById(R.id.button50);
        button50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewflipper.setDisplayedChild(14);
            }
        });

        ImageView imageView110 = (ImageView) findViewById(R.id.imageView110);
        imageView110.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(16);
            }
        });

        Button button48 = (Button) findViewById(R.id.button48);
        button48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewflipper.setDisplayedChild(17);
            }
        });

        ImageView imageView112 = (ImageView) findViewById(R.id.imageView112);
        imageView112.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(18);
            }
        });

        ImageView imageView113 = (ImageView) findViewById(R.id.imageView113);
        imageView113.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(19);
            }
        });

        ImageView imageView115 = (ImageView) findViewById(R.id.imageView115);
        imageView115.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(7);
            }
        });

        Button button52 = (Button) findViewById(R.id.button52);
        button52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewflipper.setDisplayedChild(21);
            }
        });

        Button button54 = (Button) findViewById(R.id.button54);
        button54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewflipper.setDisplayedChild(20);
            }
        });

        Button button53 = (Button) findViewById(R.id.button53);
        button53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewflipper.setDisplayedChild(21);
            }
        });

        ImageView imageView116 = (ImageView) findViewById(R.id.imageView116);
        imageView116.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(16);
            }
        });

        Button button49 = (Button) findViewById(R.id.button49);
        button49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewflipper.setDisplayedChild(10);
            }
        });

    }
}
