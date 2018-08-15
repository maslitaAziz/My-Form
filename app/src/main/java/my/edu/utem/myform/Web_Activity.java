package my.edu.utem.myform;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Web_Activity extends AppCompatActivity {

    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_);
        webView = findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient());  //buka kat web view, in app browser
        webView.getSettings().setJavaScriptEnabled(true);  //kebanyakan mobile ada JS
        webView.loadUrl("http://www.google.com");
    }
/*
    //nak pergi previous page
    @Override
    public void onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            super.onBackPressed();
        }
    }
    */
}
