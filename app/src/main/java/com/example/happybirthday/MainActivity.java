package com.example.happybirthday;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView first_Name;
    Button first_Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        first_Name=findViewById(R.id.firstName);
        first_Button=findViewById(R.id.button1);
        first_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data=first_Name.getText().toString();
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("dataName",data);
                startActivity(intent);

            }
        });

    }


}