package com.example.a77534.myapplication;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Window;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView mwv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);

        mwv= (WebView) findViewById(R.id.mwebview);

        mwv.getSettings().setJavaScriptEnabled(true);

        //String s="http://10.0.2.3:52119/";
        //String s="http://10.0.2.2";


        //String s="http://192.168.191.1:80/webiis";


       // String s="http://www.baidu.com";


        String s="http://192.168.1.109:80/Home/Index";

        mwv.loadUrl(s);

        mwv.setWebViewClient(new HellowebClient());

    }

    private class HellowebClient extends WebViewClient {

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {

            view.loadUrl(url);

            return true;
        }
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {

        if (keyCode==KeyEvent.KEYCODE_BACK && mwv.canGoBack())
        {
            mwv.goBack();
            return true;
        }
        return false;

    }
}
