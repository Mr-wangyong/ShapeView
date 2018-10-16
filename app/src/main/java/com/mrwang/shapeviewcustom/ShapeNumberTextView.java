package com.mrwang.shapeviewcustom;

import android.content.Context;
import android.util.AttributeSet;

import com.mrwang.inject.ShapeBuild;

/**
 * @author chengwangyong
 * @date 2018/9/23
 */
public class ShapeNumberTextView extends NumberTextView {

    public ShapeNumberTextView(Context context) {
        this(context,null);
    }

    public ShapeNumberTextView(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }


    public ShapeNumberTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context,attrs,defStyleAttr);
    }

    @ShapeBuild
    public void init(Context context, AttributeSet attrs, int defStyleAttr) {

    }

}
