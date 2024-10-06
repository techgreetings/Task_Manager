package com.example.taskmanager

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

data class Task(val id:Int, val name:String)
class TaskViewModel: ViewModel() {
    private val taskId=0
    var tasks by mutableStateOf(listOf<Task>())
    private set

    fun addTask(name:String){
        tasks  = tasks +Task(taskId+ 1,name)
    }

    fun removeTask(task: Task){
          tasks = tasks.filter { it.id!= task.id }
    }
}