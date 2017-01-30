package com.timejh.activitycontrol2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button bt_BrowserActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt_BrowserActivity = (Button) findViewById(R.id.bt_BrowserActivity);
        bt_BrowserActivity.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt_BrowserActivity :
                startActivity(new Intent(MainActivity.this, BrowserActivity.class));
                break;
        }
    }
}
