package com.ajp.discover.features.folder

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

/**
 * Lists down all the folder content in the
 */
@Composable
fun FolderDestination() {
    // pass list of files here
    LazyColumn(Modifier.fillMaxSize()) {

    }
}

/**
 * Make this reusable component
 * Takes a File Model for display
 */
@Composable
fun FileItem() {
    Text(text = "File name", modifier = Modifier.padding(10.dp))
}