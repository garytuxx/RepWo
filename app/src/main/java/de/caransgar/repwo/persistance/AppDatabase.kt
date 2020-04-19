package de.caransgar.repwo.persistance

import androidx.room.Database
import androidx.room.RoomDatabase
import de.caransgar.repwo.persistance.entities.Task

@Database(entities = [Task::class], version = 0)
abstract class AppDatabase : RoomDatabase() {

    /**
     * Data Access Object for Tasks.
     */
    abstract fun taskDao(): TaskDao

}