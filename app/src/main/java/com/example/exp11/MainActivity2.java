package com.example.exp11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String str = intent.getStringExtra("b1");
        String str1 = intent.getStringExtra("b2");
        String str2 = intent.getStringExtra("b3");
        String str3 = intent.getStringExtra("b4");

        WebView web = findViewById(R.id.web);
        web.setWebViewClient(new WebViewClient());
        web.loadUrl(str);
        web.loadUrl(str1);
        web.loadUrl(str2);
        web.loadUrl(str3);
        WebSettings webSettings = web.getSettings();
        webSettings.setJavaScriptEnabled(true);


    }
}