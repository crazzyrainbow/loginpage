package com.example.ac__task1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button1;
    //Button login;

    EditText text1, text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.button1);
        text1 = findViewById(R.id.text1);
        text1 = findViewById(R.id.text2);
        Intent i = getIntent();
        //User name
        String user_name = i.getStringExtra("user_name");
        //password
        String password = i.getStringExtra("password");


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*String user_name = text1.getText().toString();
                String password = text2.getText().toString();*/
                int x = check_data(user_name, password);

                Intent i;
                if (x == 1) {
                    //Intent i;
                    i = new Intent(getApplicationContext(), MainActivity2.class);
                    startActivity(i);
                } else {
                    //Intent i;
                    i = new Intent(getApplicationContext(), MainActivity3.class);
                    startActivity(i);
                }
            }
        });

    }

    public int check_data(String user, String pass) {
        String user1 = user;
        String key = pass;
        if (user1 == "ankit" && key == "ankit") {
            //success-full login
            return 1;
        } else {
            //login Denied
            return 0;
        }
    }
}