package com.ajp.musicplayerdemo.poc.ui

import android.content.Context
import java.io.File
import java.io.FileNotFoundException

/**
 * Writing into a file
 */
suspend fun Context.writeIntoFile(name: String, data: String) {
    try {
        val outStream = openFileOutput(name, Context.MODE_PRIVATE)
        outStream.use {
            it.write(data.toByteArray())
        }
    } catch (e: Exception) {
        // DO nothing
    }

}

/**
 * Reading from the file
 */
suspend fun Context.readFromFile(name: String): String {
    return try {

        openFileInput(name).bufferedReader().use {
            return it.readText()
        }
    } catch (e: FileNotFoundException) {
        ""
    }
}

/**
 * Creating file object
 * In a directory
 */

/**
 *
 */
suspend fun Context.createCacheFile(name: String, text: String) {
    val file = File(cacheDir, name)
    file.writeBytes(text.toByteArray())
}

suspend fun Context.readFromCacheFile(name: String) : String {
    val file = File(cacheDir, name)
   return file.readBytes().toString()
}