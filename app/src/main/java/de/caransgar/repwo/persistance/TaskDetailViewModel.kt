package de.caransgar.repwo.persistance

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import de.caransgar.repwo.persistance.entities.Task
import de.caransgar.repwo.persistance.entities.TaskState

class TaskDetailViewModel(taskRepository: TaskRepository, private val taskId: String): ViewModel() {

    val getStatus: LiveData<TaskState>

    val task: LiveData<Task> = taskRepository.getTask(taskId)

}