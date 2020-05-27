package com.example.mypreloaddata.db

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.provider.BaseColumns._ID
import com.example.mypreloaddata.db.DatabaseContract.MahasiswaColums.Companion.NAMA
import com.example.mypreloaddata.db.DatabaseContract.MahasiswaColums.Companion.NIM
import com.example.mypreloaddata.db.DatabaseContract.TABLE_NAME

internal class DatabaseHelper (context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {
    companion object {
        private const val DATABASE_NAME = "dbmahasiswa"
        private const val DATABASE_VERSION = 1
        private val CREATE_TABLE_MAHASISWA = "CREATE TABLE $TABLE_NAME ($_ID INTEGER PRIMARY KEY AUTOINCREMENT, $NAMA TEXT NOT NULL, $NIM TEXT NOT NULL);"
    }

    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL(CREATE_TABLE_MAHASISWA)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db?.execSQL("DROP TABLE IF EXISTS $TABLE_NAME")
        onCreate(db)
    }

}
