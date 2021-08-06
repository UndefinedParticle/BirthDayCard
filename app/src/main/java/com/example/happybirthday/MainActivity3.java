package com.example.happybirthday;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.net.Uri;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {
    Button UrlOpen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        UrlOpen =findViewById(R.id.specialButton);
        UrlOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent GetIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://photos.app.goo.gl/FPstQXz3s4HRKzwe6"));
                startActivity(GetIntent);
            }
        });
    }


}