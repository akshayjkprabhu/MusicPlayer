package com.ajp.musicplayerdemo.poc

import android.os.Bundle
import android.os.strictmode.UntaggedSocketViolation
import android.provider.MediaStore
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.lifecycle.lifecycleScope
import com.ajp.musicplayerdemo.poc.ui.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class POCActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            val text = remember {
                mutableStateOf(readFileFromInternalStorageAsByteArray("sample_name.txt"))
            }
            MainScreen(text) { it ->
                readAndWriteFromFile(it){
                    text.value = it
                }
            }
        }
    }

    private fun readAndWriteFromFile(it: String, update : (String) -> Unit) {
        lifecycleScope.launchWhenCreated {
            printThread()
            withContext(Dispatchers.IO) {
                printThread()
//                val line = readFileFromInternalStorageAsByteArray("sample_name.txt")
                writeIntoFile("sample_name.txt",it)
            }
            printThread()
        }
    }
}