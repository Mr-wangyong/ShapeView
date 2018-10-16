package com.mrwang;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.FrameLayout;

import com.inject.ShapeBuilder;

/**
 * @author chengwangyong
 * @date 2018/9/23
 */
public class ShapeFrameLayout extends FrameLayout {
    public ShapeFrameLayout(@NonNull Context context) {
        this(context, null);
    }

    public ShapeFrameLayout(@NonNull Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    @ShapeBuilder
    public ShapeFrameLayout(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
