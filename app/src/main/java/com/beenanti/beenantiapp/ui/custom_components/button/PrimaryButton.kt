package com.beenanti.beenantiapp.ui.custom_components.button

import android.content.Context
import android.graphics.Canvas
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.view.Gravity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.content.ContextCompat
import com.beenanti.beenantiapp.R

class PrimaryButton: AppCompatButton {

    private lateinit var enabledColorBackground: Drawable
    private lateinit var disabledColorBackground: Drawable

    constructor(context: Context) : super(context) {
        init()
    }
    constructor(context: Context, attributeSet: AttributeSet) : super(context, attributeSet) {
        init()
    }

    constructor(context: Context, attributeSet: AttributeSet, defStyleAttr: Int) : super(
        context,
        attributeSet,
        defStyleAttr
    ) {
        init()
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        background = if (isEnabled) enabledColorBackground else disabledColorBackground

        height = 48
        textSize = 16f
        gravity = Gravity.CENTER
        setTextColor(ContextCompat.getColor(context, android.R.color.black))
    }

    private fun init() {
        enabledColorBackground = ContextCompat.getDrawable(context, R.drawable.button_background) as Drawable
        disabledColorBackground = ContextCompat.getDrawable(context, R.drawable.button_backgroud_disable) as Drawable
    }
}