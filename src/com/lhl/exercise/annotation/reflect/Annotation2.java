package com.lhl.exercise.annotation.reflect;

import java.lang.annotation.*;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/2_11:44
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface Annotation2 {
    String email();
    double price();
}
