package com.example.yuna.game;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button startButton = (Button) findViewById(R.id.nextButton3); //시작버튼 이벤트처리
        Button exitButton = (Button) findViewById(R.id.exitButton); //종료버튼 이벤트처리

        startButton.setOnClickListener(new View.OnClickListener() { //시작버튼 이벤트추가
            @Override
            public void onClick(View v) { //확인버튼 누르면 onClick 함수 실행
                Intent intent = new Intent(getApplicationContext(), com.example.yuna.game.NaBanghyun.class); //새로운 창을 열기 위해서 필요한 객체
                startActivity(intent); //intent 실행
            }
        });

        exitButton.setOnClickListener(new View.OnClickListener() { //종료버튼 이벤트추가
            @Override
            public void onClick(View v) { //종료버튼 누르면 onClick 함수 실행
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this); //객체할당 (MainActivity 에 중복)
                builder.setMessage("검은달을 종료하시겠습니까?"); //해당 빌더에 메세지 설정
                builder.setTitle("") //제목
                        .setCancelable(false) //사용자가 임의적으로 종료할 수없도록 설정
                        .setPositiveButton("예", new DialogInterface.OnClickListener() { //Yes 버튼 생성
                            @Override
                            public void onClick(DialogInterface dialog, int i) { //Yes 버튼에 대한 이벤트 처리
                                finish(); //클릭하면 프로그램 전체 종료
                            }
                        })
                        .setNegativeButton("아니요", new DialogInterface.OnClickListener() { //No 버튼 생성
                            @Override
                            public void onClick(DialogInterface dialog, int i) { //No 버튼에 대한 이벤트 처리
                                dialog.cancel(); //dialog 창이
                            }
                        });
                AlertDialog alert = builder.create(); //dialog 객체를 빌더에서 받아옴
                alert.show(); //dialog 가 보여지도록 함수설정
            }
        });
    }
}
