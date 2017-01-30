package com.timejh.activitycontroll;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class CommonActivity extends AppCompatActivity {

    private static final String TAG = "CommonActivity";

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common);

        textView = (TextView) findViewById(R.id.textView);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        textView.setText(bundle.getString("var"));
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
