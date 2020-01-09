package com.shohiebsense.edittextcolorabuse;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import com.google.android.material.textfield.TextInputLayout;

public class AbusedTextInputLayout extends TextInputLayout {
    public AbusedTextInputLayout(@NonNull Context context) {
        super(new ContextThemeWrapper(context, R.style.AbusedTextInputLayout));
        setHintTextAppearance(R.style.HintAbusedTextInputLayout);
        setDefaultHintTextColor(ContextCompat.getColorStateList(context, R.color.color_label));
    }

    public AbusedTextInputLayout(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(new ContextThemeWrapper(context, R.style.AbusedTextInputLayout));
        setHintTextAppearance(R.style.HintAbusedTextInputLayout);
        setDefaultHintTextColor(ContextCompat.getColorStateList(context, R.color.color_label));
    }

    public AbusedTextInputLayout(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(new ContextThemeWrapper(context, R.style.AbusedTextInputLayout));
        setHintTextAppearance(R.style.HintAbusedTextInputLayout);
        setDefaultHintTextColor(ContextCompat.getColorStateList(context, R.color.color_label));
    }


}
