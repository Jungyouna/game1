package com.example.yuna.game;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class GamestartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamestart);

        Button itemButton = (Button) findViewById(R.id.itemButton);

        itemButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), com.example.yuna.game.ItemboxActivity.class);
                startActivity(intent);
            }
        });
    }
}
