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
        ImageView imageView19 = (ImageView) findViewById(R.id.imageView19);
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        ImageView imageView3 = (ImageView) findViewById(R.id.imageView3);
        ImageView imageView7 = (ImageView) findViewById(R.id.imageView7);
        ImageView imageView12 = (ImageView) findViewById(R.id.imageView12);
        ImageView imageView16 = (ImageView) findViewById(R.id.imageView16);
        ImageView imageView17 = (ImageView) findViewById(R.id.imageView17);
        ImageView imageView36 = (ImageView) findViewById(R.id.imageView36);
        ImageView imageView18 = (ImageView) findViewById(R.id.imageView18);


        imageView13.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.showNext();
            }
        });
        imageView.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.showNext();
            }
        });
        imageView3.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.showNext();
            }
        });
        imageView7.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.showNext();
            }
        });
        imageView12.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.showNext();
            }
        });
        imageView16.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.showNext();
            }
        });
        imageView17.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.showNext();
            }
        });
        imageView36.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.showNext();
            }
        });
        imageView18.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                viewflipper.showNext();
            }
        });
        imageView19.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ParkJungho.class);
                startActivity(intent);
            }
        });
    }
}
