package com.mrwang;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

/**
 * @author chengwangyong
 * @date 2018/9/23
 */
public class ShapeTextView extends AppCompatTextView{
    public ShapeTextView(Context context) {
        this(context,null);
    }

    public ShapeTextView(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public ShapeTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        ShapeViewProxy.proxyShapeAttributes(this, context, attrs, defStyleAttr);
    }
}
