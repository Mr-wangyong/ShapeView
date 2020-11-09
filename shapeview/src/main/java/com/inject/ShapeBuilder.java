package com.inject;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 在 lib中使用
 *
 * 知乎正解 https://zhuanlan.zhihu.com/p/40008022
 * 核心要点 需要在两端都配置ajc 
 * @author chengwangyong
 * @date 2018/10/15
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.CONSTRUCTOR,ElementType.METHOD})
public @interface ShapeBuilder {
}
