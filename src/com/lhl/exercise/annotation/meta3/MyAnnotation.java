package com.lhl.exercise.annotation.meta3;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/2_11:20
 */

@Retention(RetentionPolicy.RUNTIME)
@Inherited // 表示注解可以被继承
public @interface MyAnnotation {

}
