package com.timejh.activitycontroll;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * CommonActivity 와 TransActivity를 start 하고
 * 콘솔에 출력되는 로그를 관찰하세요
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "MainActivity";

    public static final int ONE = 1;
    public static final int TWO = 2;

    private Button bt_CommonActivity;
    private Button bt_TransActivity1;
    private Button bt_TransActivity2;

    private Button bt_DIAL;
    private Button bt_BROWSE;
    private Button bt_SMS;

    private EditText ed_editText;
    private TextView tv_TransActivity1;
    private TextView tv_TransActivity2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt_CommonActivity = (Button) findViewById(R.id.bt_CommonActivity);
        bt_TransActivity1 = (Button) findViewById(R.id.bt_TransActivity1);
        bt_TransActivity2 = (Button) findViewById(R.id.bt_TransActivity2);
        bt_DIAL = (Button) findViewById(R.id.bt_DIAL);
        bt_BROWSE = (Button) findViewById(R.id.bt_BROWSE);
        bt_SMS = (Button) findViewById(R.id.bt_SMS);
        ed_editText = (EditText) findViewById(R.id.editText);

        tv_TransActivity1 = (TextView) findViewById(R.id.tv_TransActivity1);
        tv_TransActivity2 = (TextView) findViewById(R.id.tv_TransActivity2);

        bt_CommonActivity.setOnClickListener(this);
        bt_TransActivity1.setOnClickListener(this);
        bt_TransActivity2.setOnClickListener(this);
        bt_DIAL.setOnClickListener(this);
        bt_BROWSE.setOnClickListener(this);
        bt_SMS.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = null;
        switch (view.getId()) {
            case R.id.bt_CommonActivity :
                intent = new Intent(MainActivity.this, CommonActivity.class);
                intent.putExtra("var", ed_editText.getText().toString());
                startActivity(intent);
                break;
            case R.id.bt_TransActivity1 :
                intent = new Intent(MainActivity.this, TransActivity.class);
                intent.putExtra("var", ed_editText.getText().toString());
                startActivityForResult(intent, ONE);
                break;
            case R.id.bt_TransActivity2 :
                intent = new Intent(MainActivity.this, TransActivity.class);
                intent.putExtra("var", ed_editText.getText().toString());
                startActivityForResult(intent, TWO);
                break;
            case R.id.bt_DIAL :
                intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + ed_editText.getText().toString()));
                startActivity(intent);
                break;
            case R.id.bt_BROWSE :
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://" + ed_editText.getText().toString()));
                startActivity(intent);
                break;
            case R.id.bt_SMS :
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("smsto:" + ed_editText.getText().toString()));
                startActivity(intent);
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == 0) {
            return;
        }
        String result = data.getStringExtra("return");
        switch (requestCode) {
            case ONE : tv_TransActivity1.setText(result);
                break;
            case TWO : tv_TransActivity2.setText(result);
                break;
        }
        Logger.print(tv_TransActivity1.getText().toString(), TAG + "here");
        Logger.print(tv_TransActivity2.getText().toString(), TAG + "here");
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
