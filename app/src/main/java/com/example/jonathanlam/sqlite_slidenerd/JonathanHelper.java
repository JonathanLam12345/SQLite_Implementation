package com.example.jonathanlam.sqlite_slidenerd;

//161 Android SQLite Database Schema Part 2 |
//https://www.youtube.com/watch?v=ge7m4nWmggs&t=2s&nohtml5=False

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Jonathan Lam on 2017-05-10.
 */

public class JonathanHelper extends SQLiteOpenHelper
{
    private static final String DATABASE_NAME = "jonathandatabase";
    private static final String TABLE_NAME = "JONATHANTABLE";
    private static final int DATABASE_VERSION = 1;

    public JonathanHelper(Context context)
    {
        super(context, "", null, DATABASE_VERSION);  //context, string, cursor factory, version number
    }

    //Creating a database for the first time!!!!
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase)
    {
        String query = "CREATE TABLE " + TABLE_NAME + " (_id INTEGER PRIMARY KEY AUTOINCREMENT, NAME VARCHAR(255));";
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1)
    {

    }
}
