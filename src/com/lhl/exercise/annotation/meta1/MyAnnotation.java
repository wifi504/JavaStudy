package com.lhl.exercise.annotation.meta1;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/2_10:59
 */

//@Retention(RetentionPolicy.SOURCE) // MyAnnotation 注解保留在源码
//@Retention(RetentionPolicy.CLASS) // MyAnnotation 注解保留在字节码（默认行为，不能被反射）
@Retention(RetentionPolicy.RUNTIME) // MyAnnotation 注解保留在运行时，可以被反射
public @interface MyAnnotation {

}
