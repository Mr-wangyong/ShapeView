package com.mrwang;

import android.content.Context;
import android.util.AttributeSet;
import com.inject.ShapeBuilder;

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

    @ShapeBuilder
    public void init(Context context, AttributeSet attrs, int defStyleAttr) {

    }

}
