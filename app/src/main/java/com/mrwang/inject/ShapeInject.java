package com.mrwang.inject;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import com.mrwang.ShapeViewProxy;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author chengwangyong
 * @date 2018/10/16
 */
@Aspect
public class ShapeInject{

    @Pointcut("execution(@com.mrwang.inject.ShapeBuild * *(..))")
    public void DebugToolMethod() {
    }

    @Before("DebugToolMethod()")
    public void onDebugToolMethodBefore(JoinPoint joinPoint) throws Throwable {
        System.out.println(" DebugToolMethod  inject: ");
        Context context = null;
        AttributeSet attrs = null;
        View view = null;
        int defStyle = 0;
        for (Object arg : joinPoint.getArgs()) {
            if (arg instanceof Context) {
                context = (Context) arg;
            } else if (arg instanceof AttributeSet) {
                attrs = (AttributeSet) arg;
            } else if (arg instanceof Integer) {
                defStyle = (Integer) arg;
            }
        }
        Object aThis = joinPoint.getThis();
        if (aThis instanceof View) {
            view = (View) aThis;
        }
        if (context == null || view == null) {
            return;
        }
        ShapeViewProxy.proxyShapeAttributes(view, context, attrs, defStyle);
    }
}