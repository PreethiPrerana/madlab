package com.example.program1;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ActionBar actionBar=getSupportActionBar();
        assert actionBar!=null;
        actionBar.setTitle("WELCOME");
        TextView rec_msg=(TextView) findViewById(R.id.result);
        Intent intent=getIntent();
        String fn=intent.getStringExtra("FNAME");
        String ln=intent.getStringExtra("LNAME");
        String str="Welcome "+fn+" "+ln+" !!";
        rec_msg.setText(str);
    }
}