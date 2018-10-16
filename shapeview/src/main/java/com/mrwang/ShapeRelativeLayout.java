package com.mrwang;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

import com.inject.ShapeBuilder;

/**
 * @author chengwangyong
 * @date 2018/9/23
 */
public class ShapeRelativeLayout extends RelativeLayout {
    public ShapeRelativeLayout(Context context) {
        this(context, null);
    }

    public ShapeRelativeLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    @ShapeBuilder
    public ShapeRelativeLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
