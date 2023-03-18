package com.beenanti.beenantiapp.ui.custom_components.button

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatButton

class PrimaryButton: AppCompatButton {

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

    private fun init() {}
}