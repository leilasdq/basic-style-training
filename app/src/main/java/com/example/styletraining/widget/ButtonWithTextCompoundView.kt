package com.example.styletraining.widget

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.FrameLayout
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.withStyledAttributes
import androidx.core.widget.TextViewCompat
import com.example.styletraining.R

@SuppressLint("CustomViewStyleable")
class ButtonWithTextCompoundView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
) : LinearLayout(context, attrs, defStyleAttr) {

    private val contentLayout: View by lazy {
        LayoutInflater.from(context).inflate(R.layout.compound_view_button_text, this, false)
    }

    private val title: TextView = contentLayout.findViewById(R.id.tv_compound_title_btn)
    private val btn: Button = contentLayout.findViewById(R.id.btn_compound_title_btn)

    init {
        addView(
            contentLayout,
            FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.MATCH_PARENT,
                FrameLayout.LayoutParams.MATCH_PARENT,
                Gravity.CENTER
            )
        )
        context.withStyledAttributes(attrs, R.styleable.TitleButton) {
            for (i in 0 until indexCount) {
                val attr: Int = getIndex(i)
                //if (attr == R.styleable.TitleButton_button_background) buttonBack = getDrawable(attr)
            }
        }
    }

    /*var buttonBack: Drawable?
        get() = btn.background
        set(value) {
            btn.background = value
        }*/

}