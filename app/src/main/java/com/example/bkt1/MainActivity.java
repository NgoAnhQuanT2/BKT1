package com.example.bkt1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText username,password;
        username =  (EditText) findViewById(R.id.username) ;
        password =  (EditText) findViewById(R.id.password) ;
        Button button2 = (Button) findViewById(R.id.buttondangnhap);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getText().toString().equals("ngoanhquan") && password.getText().toString().equals("2050531200256")){
                    Toast.makeText(MainActivity.this,"Dang nhap thanh cong",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this,ListCasi.class);
                    startActivity(intent);}
                else Toast.makeText(MainActivity.this,"Dang nhap that bai",Toast.LENGTH_SHORT).show();
            }
        });

    }
}