package com.example.jonathanlam.sqlite_slidenerd;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity
{
    JonathanHelper jonathanHelper;
    String userName;
    String password;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        jonathanHelper = new JonathanHelper(this);
    }

    public void addUser()
    {
        userName = "Jonathan Lam";
        password = "password123";

        /*
        SQLite is efficient because it avoid the database creation overhead by
        creating the database only when someone tries accessing it for the first time.
        By initializing JonathanHelper, we have not yet accessed the database,
        to access the database object that represents the physical database file stored
        on our device, called the getWriteDatabase() method and that'll trigger the
        other lifecycle methods of SQLiteOpenHelper.
        */
        //sqLiteDatabase is a reference to the datbase.
        SQLiteDatabase sqLiteDatabase = jonathanHelper.getWritableDatabase();

    }
}

