package com.example.jonathanlam.sqlite_slidenerd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity
{
    JonathanHelper jonathanHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        jonathanHelper = new JonathanHelper(this);
    }
}
