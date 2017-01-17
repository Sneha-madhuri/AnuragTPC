package com.example.sneha.anuragtpc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class SecondActivity extends AppCompatActivity {
    ImageButton imageButton;
    ImageButton imageButton2;
    ImageButton imageButton3;
    ImageButton imageButton4;
    ImageButton imageButton6;
    ImageButton imageButton7;
    //ImageButton imageButton8;
    ImageButton imageButton9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        imageButton=(ImageButton)findViewById(R.id.imageButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity=new Intent(SecondActivity.this,ThirdActivity.class);
                startActivity(intentLoadNewActivity);
            }
        });
        imageButton2=(ImageButton)findViewById(R.id.imageButton2);
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity=new Intent(SecondActivity.this,FourthActivity.class);
                startActivity(intentLoadNewActivity);
            }
        });
        imageButton3=(ImageButton)findViewById(R.id.imageButton3);
        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity=new Intent(SecondActivity.this,FifthActivity.class);
                startActivity(intentLoadNewActivity);
            }
        });
        imageButton4=(ImageButton)findViewById(R.id.imageButton4);
        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity=new Intent(SecondActivity.this,SixthActivity.class);
                startActivity(intentLoadNewActivity);
            }
        });
        imageButton6=(ImageButton)findViewById(R.id.imageButton6);
        imageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity=new Intent(SecondActivity.this,SeventhActivity.class);
                startActivity(intentLoadNewActivity);
            }
        });
        imageButton7=(ImageButton)findViewById(R.id.imageButton7);
        imageButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity=new Intent(SecondActivity.this,EigthActivity.class);
                startActivity(intentLoadNewActivity);
            }
        });

        imageButton9=(ImageButton)findViewById(R.id.imageButton9);
        imageButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity=new Intent(SecondActivity.this,TenthActivity.class);
                startActivity(intentLoadNewActivity);
            }
        });

    }
    }

