package com.example.jonathanlam.sqlite_slidenerd;

//161 Android SQLite Database Schema Part 2 |
//https://www.youtube.com/watch?v=ge7m4nWmggs&t=2s&nohtml5=False

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by Jonathan Lam on 2017-05-10.
 */

public class JonathanHelper extends SQLiteOpenHelper
{
    private static final String DATABASE_NAME = "jonathandatabase";
    private static final String TABLE_NAME = "JONATHANTABLE";
    private static final int DATABASE_VERSION = 1;
    private static final String UID = "_id";
    private static final String NAME = "Name";

    private Context context;

    public JonathanHelper(Context context)
    {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);  //context, string, cursor factory, version number
        this.context = context;
        Log.d("JonathanHelper: ","Constructor executed.");
    }

    //Creating a database for the first time!!!!
    @Override
    public void onCreate(SQLiteDatabase db)
    {
        String queryCreate = "CREATE TABLE " + TABLE_NAME + " (" + UID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + NAME + " VARCHAR(255));";
        try
        {
            db.execSQL(queryCreate);
            Log.d("JonathanHelper","onCreate executed.");
        } catch (SQLException e)
        {
            Log.d("JonathanHelper:", " onCreate: " + e);
        }

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
        String queryDelete = "DROP TABLE " + TABLE_NAME + "IF EXISTS";

        try
        {
            Log.d("JonathanHelper","onUpgrade executed.");
            db.execSQL(queryDelete);
            onCreate(db);
        } catch (SQLException e)
        {
            Log.d("JonathanHelper:", " onUpgrade: " + e);
        }
    }
}
