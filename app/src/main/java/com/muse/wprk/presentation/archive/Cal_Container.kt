package com.muse.wprk.presentation.archive

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.toddway.shelf.Shelf.Companion.item
import org.intellij.lang.annotations.JdkConstants

@Composable
fun Cal_Container(
    month: String,
    date: String,
    dayOfWeek: String
) {
    Box(
        modifier = Modifier
            .size(70.dp)
            .background(Color.Yellow),
    ) {

        Text(
            text = dayOfWeek,
            color = Color.Black,
            modifier = Modifier
                .align(Alignment.TopCenter)
        )
        Text(text = date,
            color = Color.Black,
            modifier = Modifier
                .align(Alignment.Center)
        )
        Text(text = month,
            color = Color.Black,
            modifier = Modifier
            .align(Alignment.BottomCenter)
        )
    }
    Spacer(modifier = Modifier.width(2.dp))
}
