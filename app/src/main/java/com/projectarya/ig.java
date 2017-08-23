package com.projectarya;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class ig extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ig);
        String url = "https://www.instagram.com/kuyainimah/?hl=en";  //Pendefinisian URL
        WebView view = (WebView) this.findViewById(R.id.insta);  //sinkronisasi object berdasarkan id
        view.getSettings().setJavaScriptEnabled(true);  //untuk mengaktifkan javascript
        view.loadUrl(url);   //agar URL terload saat dibuka aplikasi
    }
}
