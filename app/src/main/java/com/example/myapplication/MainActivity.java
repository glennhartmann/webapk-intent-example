package com.example.myapplication;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button httpButton = findViewById(R.id.http_button);
        httpButton.setOnClickListener(v -> launchUrl("http://slash-statuesque-bracket.glitch.me/pwatest/"));

        final Button httpsButton = findViewById(R.id.https_button);
        httpsButton.setOnClickListener(v -> launchUrl("https://slash-statuesque-bracket.glitch.me/pwatest/"));

        final Button httpButton2 = findViewById(R.id.http_button2);
        httpButton2.setOnClickListener(v -> launchUrl("http://elite-small-find.glitch.me/pwatest/"));

        final Button httpsButton2 = findViewById(R.id.https_button2);
        httpsButton2.setOnClickListener(v -> launchUrl("https://elite-small-find.glitch.me/pwatest/"));
    }

    private void launchUrl(String url) {
        try {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
        } catch (ActivityNotFoundException e) {
            e.printStackTrace();
        }
    }
}