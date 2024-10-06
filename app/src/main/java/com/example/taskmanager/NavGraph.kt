package com.example.taskmanager

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun TaskManagerApp() {
    val navController = rememberNavController()
    val viewModel: TaskViewModel = viewModel()
    NavHost(navController = navController, startDestination = Screen.TaskList.route) {
        composable(Screen.TaskList.route) { TaskListScreen(navController, viewModel) }
        composable(Screen.AddTask.route) { AddTaskScreen(navController, viewModel) }
    }
}
