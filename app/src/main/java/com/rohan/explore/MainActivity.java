package com.rohan.explore;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void Mode(View view)
    {
        Intent intent = new Intent(this,Modes.class);
        startActivity(intent);

    }

    public void Metro(View view) {
        Intent i = new Intent(this, MetroMain.class);
        i.putExtra("Info", "subway_station");
        startActivity(i);
    }


    public void Bus(View view)
    {
        Intent a = new Intent(this,MetroMain.class);
        a.putExtra("Info","bus_station");
        startActivity(a);
    }

    public void Nearby(View view)
    {
        Intent n = new Intent(this,Nearby.class);
        startActivity(n);
    }

    public void Cab(View view)
    {
        Intent c = new Intent(Intent.ACTION_GET_CONTENT);
        startActivity(c);
    }

}
