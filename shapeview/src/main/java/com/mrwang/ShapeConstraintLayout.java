package com.mrwang;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;

/**
 * @author chengwangyong
 * @date 2018/9/23
 */
public class ShapeConstraintLayout extends ConstraintLayout {

    public ShapeConstraintLayout(Context context) {
        this(context,null);
    }

    public ShapeConstraintLayout(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public ShapeConstraintLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        ShapeViewProxy.proxyShapeAttributes(this, context, attrs, defStyleAttr);
    }
}
