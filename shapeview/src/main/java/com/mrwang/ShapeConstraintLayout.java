package com.mrwang;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;

import com.inject.ShapeBuilder;

/**
 * @author chengwangyong
 * @date 2018/9/23
 */
public class ShapeConstraintLayout extends ConstraintLayout {

    public ShapeConstraintLayout(Context context) {
        super(context);
    }

    public ShapeConstraintLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @ShapeBuilder
    public ShapeConstraintLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


}
