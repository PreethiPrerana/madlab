package com.example.program1;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar=getSupportActionBar();
        assert actionBar!=null;
        actionBar.setTitle("ENTER YOUR DETAILS");
        EditText fName=findViewById(R.id.fname);
        EditText lName=findViewById(R.id.lname);
        Button save=findViewById(R.id.btn_save);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Fname=fName.getText().toString();
                String Lname=lName.getText().toString();
                Toast.makeText(getApplicationContext(),"DETAILS SENT SUCCESSFULLY",Toast.LENGTH_LONG).show();;
                Intent intent=new Intent(getApplicationContext(),SecondActivity.class);
                intent.putExtra("FNAME",Fname);
                intent.putExtra("LNAME",Lname);
                startActivity(intent);
            }
        });
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.d("lifecycle","onStart invoked ");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.d("lifecycle","onResume invoked ");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.d("lifecycle","onPause invoked ");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.d("lifecycle","onStop invoked ");
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("lifecycle","onRestart invoked ");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("lifecycle","onDestroy invoked ");
    }
}