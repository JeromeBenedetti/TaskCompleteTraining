package com.example.taskcompletetraining

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.taskcompletetraining.ui.theme.TaskCompleteTrainingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TaskCompleteTrainingTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    TaskCompleteLogo(Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun TaskCompleteLogo(modifier: Modifier = Modifier) {
    Column {
        val logo = painterResource(R.drawable.ic_task_completed)

        Column {
            Image(
                painter = logo,
                contentDescription = null,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TaskCompleteLogoPreview() {
    TaskCompleteTrainingTheme {
        TaskCompleteLogo()
    }
}