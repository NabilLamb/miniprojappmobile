package com.example.miniprojappmobile;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.BoringLayout;

import androidx.annotation.Nullable;

import java.lang.reflect.Array;

public class Data extends SQLiteOpenHelper {

    public static final String nameDB = "WorkOutHome.db";
    public static final String nameColLogin = "username";
    public static final String nameColMotPass = "password";

    public Data(@Nullable Context context) {
        super(context, nameDB, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table users(username TEXT primary key, password TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS users");
        onCreate(sqLiteDatabase);
    }

    //fonction ajout
    public boolean insert_data(String login, String pass) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(nameColLogin, login);
        values.put(nameColMotPass, pass);
        long result = db.insert("users", null, values);
        if (result == -1)
            return false;
        else
            return true;


    }

    public Boolean checkusername(String username) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("select * from users where username=?",new String[]{username});
        if (cursor.getCount()>0)
            return true;
        else
            return false;
    }

    public Boolean checkusernamepassword(String username, String password)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("select * from users where username=? and password=?",new String[] {username,password});
        if (cursor.getCount()>0)
            return true;
        else
            return false;
    }
}
