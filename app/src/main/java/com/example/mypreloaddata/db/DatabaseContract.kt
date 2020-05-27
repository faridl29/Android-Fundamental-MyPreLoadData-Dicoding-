package com.example.mypreloaddata.db

import android.provider.BaseColumns

internal object DatabaseContract {
    var TABLE_NAME = "table_mahasiswa"

    internal class MahasiswaColums : BaseColumns {
        companion object {
            const val NAMA = "nama"
            const val NIM = "nim"
        }
    }
}