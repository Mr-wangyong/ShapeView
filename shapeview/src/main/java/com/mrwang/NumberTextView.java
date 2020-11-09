package com.mrwang;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

/**
 * @author chengwangyong
 * @date 2018/9/23
 */
public class NumberTextView extends AppCompatTextView {
    private int number;

    public NumberTextView(Context context) {
        super(context);
    }

    public NumberTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public NumberTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void setNumber(int number) {
        if (this.number != number) {
            setText(String.valueOf(number));
        }
        this.number = number;
    }
}
