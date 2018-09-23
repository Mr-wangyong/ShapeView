package com.mrwang;

import android.graphics.drawable.GradientDrawable;
import android.support.annotation.ColorRes;

/**
 * 未完待续
 * @author chengwangyong
 * @date 2017/12/19
 */
public class GradientDrawableBuilder {

    GradientDrawable drawable;


    public void setShape(GradientDrawable drawable, int shape) {
        switch (shape) {
            case GradientDrawable.RECTANGLE:
                drawable.setShape(GradientDrawable.RECTANGLE);
                break;
            case GradientDrawable.OVAL:
                drawable.setShape(GradientDrawable.OVAL);
                break;
            case GradientDrawable.LINE:
                drawable.setShape(GradientDrawable.LINE);
                break;
            case GradientDrawable.RING:
                drawable.setShape(GradientDrawable.RING);
                break;
        }
    }

    private void setGradientStartColor(@ColorRes int color){

    }
}
