package com.aho.lab75.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = arrayOf(Record::class), version = 1 )
abstract class RecordDatabase: RoomDatabase() {

}