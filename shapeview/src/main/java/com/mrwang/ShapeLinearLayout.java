package com.mrwang;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import com.inject.ShapeBuilder;

/**
 * @author chengwangyong
 * @date 2018/9/23
 */
public class ShapeLinearLayout extends LinearLayout {

    @ShapeBuilder
    public ShapeLinearLayout(Context context) {
        this(context, null);
    }

    @ShapeBuilder
    public ShapeLinearLayout(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    @ShapeBuilder
    public ShapeLinearLayout(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

}
