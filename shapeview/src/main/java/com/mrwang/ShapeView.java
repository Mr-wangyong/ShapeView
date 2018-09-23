package com.mrwang;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;


/**
 * User: chengwangyong(chengwangyong@blinnnk.com)
 * Date: 2017/8/19
 * Time: 下午5:07
 */
public class ShapeView extends AppCompatImageView {

    public ShapeView(Context context) {
        this(context, null);
    }

    public ShapeView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ShapeView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        ShapeViewProxy.proxyShapeAttributes(this, context, attrs, defStyleAttr);
    }
}
