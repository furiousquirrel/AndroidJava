package com.example.a16727830.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView linktext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linktext=findViewById(R.id.link_text);
    }

    @Override
    protected void onStart() {
        super.onStart();
        final Intent intent =getIntent();
        final String link =intent.getData().toString();
        linktext.setText(link);
    }
}
