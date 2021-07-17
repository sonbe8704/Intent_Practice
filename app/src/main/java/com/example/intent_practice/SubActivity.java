package com.example.intent_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {
    private TextView tv_sub;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        tv_sub = findViewById(R.id.tv_sub);
        Intent intent = getIntent();
        String str= intent.getStringExtra("str");
        tv_sub.setText(str);//서브로 전달은 가능
        //서브에서 메인은 어떻게 가는지
        Intent intent2 = new Intent(SubActivity.this,MainActivity.class);
        //intent를 또 실행하기에는 액티비티 위에 또 다른 액티비티가 생성된다.
        //종료하면서 반환하는 것이 있을듯?
    }
}