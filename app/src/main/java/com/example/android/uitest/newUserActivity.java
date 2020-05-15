package com.example.android.uitest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class newUserActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_user);

       final Button signUpKnap = findViewById(R.id.signUpKnap);
       final EditText userEmail = findViewById(R.id.userEmail);
       final EditText userPass = findViewById(R.id.userPass);
       final EditText phoneNumber = findViewById(R.id.phoneNumber);
       final EditText forNavn = findViewById(R.id.forNavn);
       final EditText efterNavn = findViewById(R.id.efterNavn);
       final TextView fejlBesked = findViewById(R.id.fejlBesked);




        signUpKnap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (userEmail.getText().toString().trim().length() > 0 && userPass.getText().toString().trim().length() > 0 && phoneNumber.getText().toString().trim().length() > 0 && forNavn.getText().toString().trim().length() > 0 && efterNavn.getText().toString().trim().length() > 0){
                forsideChange();}
                fejlBesked.setVisibility(View.VISIBLE);

            }
        });
    }

    private void forsideChange(){
        Intent intent = new Intent(this,forsideActivity.class);
        startActivity(intent);
    }

}
