package com.timejh.activitycontrol2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class BrowserActivity extends AppCompatActivity implements View.OnClickListener {

    private Button bt_back;
    private Button bt_go;
    private EditText ed_link;
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browser);

        bt_back = (Button) findViewById(R.id.bt_back);
        bt_go = (Button) findViewById(R.id.bt_go);
        ed_link = (EditText) findViewById(R.id.ed_link);
        webView = (WebView) findViewById(R.id.webView);

        bt_back.setOnClickListener(this);
        bt_go.setOnClickListener(this);

        webView.getSettings().setBuiltInZoomControls(false);
        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setSupportZoom(true);
        webView.getSettings().setJavaScriptEnabled(true);
//        webView.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
        //웹뷰 클라이언트를 지정(안하면 일반 내장 웹브라우저가 팝업된다)
        webView.setWebChromeClient(new WebChromeClient() {
            @Override
            public void onProgressChanged(WebView view, int newProgress) {
                super.onProgressChanged(view, newProgress);
            }
        });
        webView.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt_back:
                webView.goBack();
                break;
            case R.id.bt_go:
                String url = ed_link.getText().toString();
                if (url.equals("")) {
                    break;
                }
                webView.loadUrl(url);
                break;
        }
    }
}
