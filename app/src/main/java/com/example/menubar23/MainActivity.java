package com.example.menubar23;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.my_menu,menu);
        return true;
    }
    public boolean onOptionsItemSelected(@NonNull MenuItem item)
    {
        int itemId=item.getItemId();
        if(itemId == R.id.android_search)
        {
            Toast.makeText(this, "You clicked on serach", Toast.LENGTH_SHORT).show();
        }
        else if (itemId ==R.id.android_home)
        {
            Toast.makeText(this, "You clicked on Home ", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}