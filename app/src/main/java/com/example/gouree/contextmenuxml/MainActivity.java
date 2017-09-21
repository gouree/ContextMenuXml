package com.example.gouree.contextmenuxml;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //invoke context menu on long click anywhere in relative layout
        RelativeLayout r= (RelativeLayout)findViewById(R.id.rel);
       // TextView txt =(TextView)findViewById(R.id.textView);
        //register relativelayout for context menu
        this.registerForContextMenu(r);

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        //inflating the context menu
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);

    }

    public boolean onContextItemSelected(MenuItem item) {

        //display toast messages on click of each item
        switch (item.getItemId())
        {
            case R.id.action1:
                Toast.makeText(this, "ACTION 1 SELECTED", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action2:
                Toast.makeText(this, "ACTION 2 SELECTED", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action3:
                Toast.makeText(this, "ACTION 3 SELECTED", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onContextItemSelected(item);
    }
}
