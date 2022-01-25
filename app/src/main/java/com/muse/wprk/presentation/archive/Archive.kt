package com.muse.wprk.presentation.archive

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import java.time.LocalDate

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun Archive(
    gradient: Color
) {
    val days = ArchiveViewModel().getArchiveList()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(gradient)
    ){
        LazyRow(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .background(gradient)
                .padding(5.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            for (day in days) {
                val month = ArchiveViewModel().getMonth(day)
                val dayOfWeek = ArchiveViewModel().getDayOfWeek(day)
                val date = ArchiveViewModel().getDate(day)
                item {
                    Cal_Container(month = month, date = date, dayOfWeek = dayOfWeek)
                }
            }
        }

    }

}