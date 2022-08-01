package com.example.prog2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AlertDialog;

import android.os.Bundle;
import android.view.View;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv=findViewById(R.id.tv);
        registerForContextMenu(tv);
    }
    @Override
    public void onCreateContextMenu(ContextMenu menu,View v,ContextMenu.ContextMenuInfo info){
        super.onCreateContextMenu(menu,v,info);
        menu.setHeaderTitle("Choose an option");
        getMenuInflater().inflate(R.menu.example_menu,menu);
    }
    @Override
    public boolean onContextItemSelected(MenuItem item){
        AlertDialog.Builder b=new AlertDialog.Builder(MainActivity.this);
        switch (item.getItemId()){
            case R.id.op1:
                b.setMessage("option 1 selected");
                break;
            case R.id.op2;
                b.setMessage("option 2 selected");
                break;
            case R.id.op3:
                b.setMessage("option 3 selected");
                break;
        }
        b.setCancelable(true);
        AlertDialog d=b.create();
        d.show();
        return super.onContextItemSelected(item);
    }
}