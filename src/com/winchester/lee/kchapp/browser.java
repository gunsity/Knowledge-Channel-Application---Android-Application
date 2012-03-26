package com.winchester.lee.kchapp;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings.PluginState;
import android.webkit.WebView;

public class browser extends Activity {
    /** Called when the activity is first created. */
	
	
    @Override
    
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.browse);
        String extra = getIntent().getStringExtra("link");
        WebView myWebView = (WebView)findViewById(R.id.webview1);
        myWebView.getSettings().setJavaScriptEnabled(true);
        myWebView.getSettings().setPluginState(PluginState.ON_DEMAND);
        myWebView.loadUrl("" + extra);
    }

} 