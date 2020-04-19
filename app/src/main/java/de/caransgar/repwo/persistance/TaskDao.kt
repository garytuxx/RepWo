package de.caransgar.repwo.persistance

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import de.caransgar.repwo.persistance.entities.Task

@Dao
interface TaskDao {

    @Query("SELECT * FROM tasks ORDER BY name")
    fun getTasks(): LiveData<List<Task>>

    @Query("SELECT * FROM tasks WHERE id = :taskId")
    fun getTask(taskId: String): LiveData<Task>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(tasks: List<Task>)

}