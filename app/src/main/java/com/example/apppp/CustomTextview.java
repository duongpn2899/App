package com.example.apppp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

import org.jetbrains.annotations.Nullable;

@SuppressLint("AppCompatCustomView")
public class CustomTextview  extends TextView {


    public CustomTextview(Context context) {
        super(context);
    }

    public CustomTextview(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomTextview(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int dai = getMeasuredWidth();
        setMeasuredDimension(dai,dai);
    }
}
