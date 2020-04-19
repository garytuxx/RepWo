package de.caransgar.repwo.persistance.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.Instant

/**
 *
 */
@Entity(tableName = "tasks")
data class Task(

    @PrimaryKey
    @ColumnInfo(name = "id")
    val taskId: String,

    val name: String,

    val description: String,

    /**
     * Time the task has to be done again after the last time.
     */
    val dueIntervalSeconds: Int,

    /**
     *
     */
    val taskLength: Int,

    val startDate: Instant,

    val endDate: Instant,

    val imageUrl: String = ""
) {

}