package com.projectarya;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Link extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_link);

        String url = "https://smkassalaambandung.sch.id";  //Pendefinisian URL
        WebView view = (WebView) this.findViewById(R.id.webkuy);  //sinkronisasi object berdasarkan id
        view.getSettings().setJavaScriptEnabled(true);  //untuk mengaktifkan javascript
        view.loadUrl(url);   //agar URL terload saat dibuka aplikasi
    }
}
