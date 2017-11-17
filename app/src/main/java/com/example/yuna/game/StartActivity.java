package com.example.yuna.game;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        ImageView imageView20 = (ImageView) findViewById(R.id.imageView20);

        imageView20.setOnClickListener(new ImageView.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), com.example.yuna.game.PrologueActivity.class);
                startActivity(intent);
            }
        });
    }
}
