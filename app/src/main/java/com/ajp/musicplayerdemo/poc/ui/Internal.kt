package com.ajp.musicplayerdemo.poc.ui

import android.content.Context
import android.util.Log
import java.io.File
import java.io.FileNotFoundException

/**
 * Reading A file character by character
 */
fun Context.readFileFromInternalStorage(name: String): String {
    checkAvailability(filesDir, "",
        ifPresent = {

        },
        ifNotPresent = {

        })

    return try {
        val input = openFileInput(name)
        var read = input.read()
        val out = StringBuilder()
        while (read != -1) {
            out.append(read.toChar())
            Log.i("FILE_CHARACTER", "${read.toChar()} $read")
            read = input.read()
        }
        return out.toString()
    } catch (e: Exception) {
        ""
    }
}

fun Context.readFileFromInternalStorageAsByteArray(name: String): String {
    return try {
        val inputStream = openFileInput(name)
        val bytes = inputStream.readBytes()
        val text = String(bytes)
        inputStream.close()
        text
    } catch (e: FileNotFoundException) {
        ""
    }
}

fun printCharacters() {
    for (i in 0..1000) {
        Log.i("FILE_CHARACTER", "$i ${i.toChar()}")
    }
}

fun checkAvailability(
    filDir: File,
    name: String,
    ifPresent: (() -> Unit)? = null,
    ifNotPresent: (() -> Unit)? = null
) {
    if (filDir.exists()) ifPresent?.let { it() }
    else ifNotPresent?.let { it() }
}