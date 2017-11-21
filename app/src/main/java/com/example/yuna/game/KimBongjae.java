package com.example.yuna.game;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class KimBongjae extends AppCompatActivity implements professorBase {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kim_bongjae);

        final ViewFlipper viewflipper = (ViewFlipper) findViewById(R.id.ViewFlipperb);
        ImageView imageView159 = (ImageView) findViewById(R.id.imageView159);
        imageView159.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(1);
            }
        });


        Button button70 = (Button) findViewById(R.id.button70);
        button70.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewflipper.setDisplayedChild(2);
            }
        });


        ImageView imageView161 = (ImageView) findViewById(R.id.imageView161);
        imageView161.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(3);
            }
        });


        ImageView imageView162 = (ImageView) findViewById(R.id.imageView162);
        imageView162.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(4);
            }
        });


        ImageView imageView163 = (ImageView) findViewById(R.id.imageView163);
        imageView163.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(5);
            }
        });


        ImageView imageView164 = (ImageView) findViewById(R.id.imageView164);
        imageView164.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(6);
            }
        });


        ImageView imageView165 = (ImageView) findViewById(R.id.imageView165);
        imageView165.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(7);
            }
        });


        ImageView imageView166 = (ImageView) findViewById(R.id.imageView166);
        imageView166.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(8);
            }
        });



        Button button72 = (Button) findViewById(R.id.button72);
        button72.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewflipper.setDisplayedChild(9);
            }
        });


        ImageView imageView168 = (ImageView) findViewById(R.id.imageView168);
        imageView168.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(10);
            }
        });


        ImageView imageView169 = (ImageView) findViewById(R.id.imageView169);
        imageView169.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(11);
            }
        });


        ImageView imageView170 = (ImageView) findViewById(R.id.imageView170);
        imageView170.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(12);
            }
        });




        Button button73 = (Button) findViewById(R.id.button73);
        button73.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewflipper.setDisplayedChild(13);
            }
        });



        ImageView imageView172 = (ImageView) findViewById(R.id.imageView172);
        imageView172.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(14);
            }
        });



        ImageView imageView173 = (ImageView) findViewById(R.id.imageView173);
        imageView173.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(7);
            }
        });



        Button button71 = (Button) findViewById(R.id.button71);
        button71.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewflipper.setDisplayedChild(15);
            }
        });




        ImageView imageView174 = (ImageView) findViewById(R.id.imageView174);
        imageView174.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(16);
            }
        });




        ImageView imageView175 = (ImageView) findViewById(R.id.imageView175);
        imageView175.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(17);
            }
        });




        ImageView imageView176 = (ImageView) findViewById(R.id.imageView176);
        imageView176.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(18);
            }
        });



        ImageView imageView177 = (ImageView) findViewById(R.id.imageView177);
        imageView177.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(19);
            }
        });



        ImageView imageView178 = (ImageView) findViewById(R.id.imageView178);
        imageView178.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(20);
            }
        });



        ImageView imageView179 = (ImageView) findViewById(R.id.imageView179);
        imageView179.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.setDisplayedChild(21);
            }
        });











    }
}
