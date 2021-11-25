package com.metehanbolat.draggablemusicknob

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.metehanbolat.draggablemusicknob.ui.theme.DraggableMusicKnobTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DraggableMusicKnobTheme {

            }
        }
    }
}