package com.example.android.uitest;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //sørger for Textviewet kan klikkes og sende brugeren videre til en glemt tlf, e-mail eller password.
        TextView forgotUserPass = findViewById(R.id.forgotsUserPass2);
        String forgotText = "Klik her!";
        SpannableString forgotSpan = new SpannableString(forgotText);
        ClickableSpan forgotClickSpan = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                openForgot();
            }
        };
        forgotSpan.setSpan(forgotClickSpan,0,9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        forgotUserPass.setText(forgotSpan);
        forgotUserPass.setMovementMethod(LinkMovementMethod.getInstance());

        //Sørger for Textviewet kan klikkes og sende brugeren videre til noget sign-up
        TextView newUserFront = findViewById(R.id.nyBruger);
        String newUserText = "Ny hos klinikken? Opret en bruger her!";
        SpannableString newUserSpan = new SpannableString(newUserText);
        ClickableSpan newUserClickSpan = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                openNewUser();
            }
        };
        newUserSpan.setSpan(newUserClickSpan,18,38, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        newUserFront.setText(newUserSpan);
        newUserFront.setMovementMethod(LinkMovementMethod.getInstance());

        Button logInKnap = findViewById(R.id.logInKnap);
        logInKnap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLogInd();
            }
        });




        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });



    }
    public void openForgot(){
        Intent intent = new Intent(this, forgotsUserPass.class);
        startActivity(intent);
    }

    public void openNewUser(){
        Intent intent = new Intent(this, newUserActivity.class);
        startActivity(intent);
    }

    public void openLogInd(){
        Intent intent = new Intent(this, forsideActivity.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
