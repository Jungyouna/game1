package com.example.yuna.game;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Pattern;

public class RegisterActivity extends AppCompatActivity implements TextWatcher{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText nameText = (EditText) findViewById(R.id.nameText); //이름 저장 객체
        Button genderButton = (Button) findViewById(R.id.genderButton); //이름값 전달 버튼
        nameText.setFilters(new InputFilter[]{filterKor});
        nameText.addTextChangedListener(this); //사용자가 입력한 문자열의 상태가 바뀌는 것을 에디트 텍스트 밖으로 알림

        genderButton.setOnClickListener(new View.OnClickListener() { //확인버튼 이벤트추가
            @Override
            public void onClick(View v) { //확인버튼 누르면 onClick 함수 실행
                //String name = nameText.getText().toString(); //문자열에 이름저장
                Intent intent = new Intent(getApplicationContext(), com.example.yuna.game.StartActivity.class); //새로운 창을 열기 위해서 필요한 객체
                //intent.putExtra("nameText", name); //변수를 전달할수 있도록 문자열 보냄
                startActivity(intent); //intent 실행
            }
        });
    }

    @Override
    public void afterTextChanged(Editable s) {
        //입력이 끝났을 때
        if (s.length() > 4) {
            s.delete(3, s.length()-1);
        }
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        //입력하기 전에
    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        //입력되는 텍스트에 변화가 있을 때
        if (s.length() >= 4) {
            Toast.makeText(RegisterActivity.this, "이름은 4글자 까지만 입력 가능합니다", Toast.LENGTH_SHORT).show();
        }

    }

    //한글만 허용
    public InputFilter filterKor = new InputFilter() {
        public CharSequence filter (CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {
            Pattern ps = Pattern.compile("^[ㄱ-ㅣ가-힣]*$");
            if (!ps.matcher(source).matches()) {
                Toast.makeText(RegisterActivity.this, "한글만 입력 가능합니다", Toast.LENGTH_SHORT).show();
                return "";
            }
            return null;
        }
    };
}
