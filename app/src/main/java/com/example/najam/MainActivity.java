package com.example.najam;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button login;
    Button Registration;
    EditText cnic;
    EditText password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = findViewById(R.id.check_btn);
        cnic = findViewById(R.id.cnic);
        password = findViewById(R.id.pass_text);
        Registration = findViewById(R.id.reg_button);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String CNIC = cnic.getText().toString();
                String pass = password.getText().toString();

                if ((CNIC.equals("3740595356539") && pass.equals("1234")) || (CNIC.equals("6110113838199") && pass.equals("5678"))){

                    Intent main_menu = new Intent(MainActivity.this, MainPage.class);
                    startActivity(main_menu);
                }
                else{

                    Toast.makeText(MainActivity.this, "Invalid Credentials!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        Registration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent reg_menu = new Intent(MainActivity.this, Registration.class);
                startActivity(reg_menu);
            }
        });

    }
}