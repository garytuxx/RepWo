package de.caransgar.repwo.persistance

/**
 * This class provides access to Tasks via Database and Syncronization with other Devices.
 */
class TaskRepository (private val taskDao: TaskDao) {

    fun getTasks() = taskDao.getTasks();

    fun getTask(taskId: String) = taskDao.getTask(taskId)

}