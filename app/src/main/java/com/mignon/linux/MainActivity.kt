
package com.mignon.linux

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.statusBarColor = Color.rgb(10, 14, 20)
        window.navigationBarColor = Color.rgb(10, 14, 20)
        window.decorView.systemUiVisibility =
            View.SYSTEM_UI_FLAG_FULLSCREEN or
            View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or
            View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY

        val background = Color.rgb(10, 14, 20)
        val green = Color.rgb(0, 255, 136)
        val secondary = Color.rgb(155, 170, 185)

        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setPadding(32, 32, 32, 32)
            setBackgroundColor(background)
        }

        val logo = TextView(this).apply {
            text = "🐧"
            textSize = 64f
            gravity = Gravity.CENTER
        }

        val title = TextView(this).apply {
            text = "MIGNON LINUX"
            textSize = 30f
            setTextColor(green)
            gravity = Gravity.CENTER
            letterSpacing = 0.12f
        }

        val subtitle = TextView(this).apply {
            text = "YOUR LINUX DESKTOP, REIMAGINED."
            textSize = 13f
            setTextColor(secondary)
            gravity = Gravity.CENTER
        }

        val status = TextView(this).apply {
            text = "\nSYSTEM STATUS\n\nAndroid host ready\nLinux environment: Not installed"
            textSize = 16f
            setTextColor(Color.WHITE)
            gravity = Gravity.CENTER
        }

        layout.addView(logo)
        layout.addView(title)
        layout.addView(subtitle)
        layout.addView(status)

        setContentView(layout)
    }
}
