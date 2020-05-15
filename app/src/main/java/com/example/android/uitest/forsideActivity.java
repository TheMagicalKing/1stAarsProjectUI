package com.example.android.uitest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class forsideActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forside);

        final Button button;

    }

    private void openChat(){

        Intent intent = new Intent(this, klientChat.class);
        startActivity(intent);

    }

    private void openOevelse(){

        Intent intent = new Intent(this, oevelseActivity.class);
        startActivity(intent);

    }
}
