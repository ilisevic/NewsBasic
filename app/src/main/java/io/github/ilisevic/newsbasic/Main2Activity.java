package io.github.ilisevic.newsbasic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Main2Activity extends AppCompatActivity {
WebView webView;
String url = "http://politika.rs";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
Bundle pass_from_main = getIntent().getExtras();
if(pass_from_main != null)
{

  url = pass_from_main.getString("pass_URL")  ;
}
        webView = findViewById(R.id.webviewdesk);

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        WebViewClient webViewClient = new WebViewClient();
        webView.setWebViewClient(webViewClient);
        webView.loadUrl(url);


    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode==KeyEvent.KEYCODE_BACK)&& this.webView.canGoBack())
        {

            this.webView.goBack();
            return true;
        }


        return super.onKeyDown(keyCode, event);
    }
    //    private class MyWebClient extends  WebViewClient{
//        @Override
//        public boolean shouldOverrideUrlLoading(WebView view, String url) {
//            return super.shouldOverrideUrlLoading(view, url);
//        }
//    }
}
