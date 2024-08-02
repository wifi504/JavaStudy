package com.lhl.exercise.annotation.reflect;

import java.lang.annotation.*;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/2_11:38
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface Annotation1 {
    String name();
    int age();
}
