package com.akki.textgredient;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.widget.TextView;

public class GradientTextView extends android.support.v7.widget.AppCompatTextView {
    private float mXStart, mXEnd, mYStart, mYEnd;
    private int mStartColor, mEndColor;


    public GradientTextView(Context context) {
        super(context, null, -1);
    }

    public GradientTextView(Context context, AttributeSet attrs) {
        super(context, attrs, -1);

        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.Options, 0, 0);

        int startColor = a.getColor(R.styleable.Options_startColor, context.getResources().getColor(android.R.color.white));
        int endColor = a.getColor(R.styleable.Options_endColor, context.getResources().getColor(android.R.color.black));
        a.recycle();
        mStartColor = startColor;
        mEndColor = endColor;
    }

    public GradientTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        getPaint().setShader( new LinearGradient( 0, 0, getWidth(), getHeight(), mStartColor, mEndColor, Shader.TileMode.CLAMP ) );
    }
}
