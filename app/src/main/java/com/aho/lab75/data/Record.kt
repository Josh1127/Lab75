package com.aho.lab75.data

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class Record(
    @NonNull
    @ColumnInfo(name="Date")
    var date: String,
    @NonNull
    var item:String,
    @NonNull
    var price: String) {
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0
}