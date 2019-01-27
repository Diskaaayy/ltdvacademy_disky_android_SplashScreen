package com.example.diskaay.splashscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {
    private static int splash_time_out = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // langsung pindah ke MainActivity atau activity lain begitu memasuki
        // splash screen ini
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}