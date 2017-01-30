package com.timejh.activitycontroll;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class TransActivity extends AppCompatActivity {

    private static final String TAG = "TransActivity";

    private EditText ed_return;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trans);
        ed_return = (EditText) findViewById(R.id.ed_return);
        ed_return.setText(getIntent().getStringExtra("var"));
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String result = ed_return.getText().toString();
                Intent intent = new Intent();
                if(result == null || result.equals(""))
                    setResult(0, intent);
                else {
                    intent.putExtra("return", result);
                    setResult(1, intent);
                }
                finish();
            }
        });
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Logger.print("onRestart 재시작", TAG);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Logger.print("onStart 시작", TAG);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Logger.print("onResume 재시작", TAG);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Logger.print("onPause 정지", TAG);
    }

    @Override
    protected void onStop() {
        super.onStop();
        Logger.print("onStop 중지", TAG);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Logger.print("onDestroy 삭제", TAG);
    }
}
