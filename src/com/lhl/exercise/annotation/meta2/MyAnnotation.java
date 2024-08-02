package com.lhl.exercise.annotation.meta2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/2_11:07
 */

//@Target(value = {})
//@Target({ElementType.FIELD, ElementType.METHOD})
@Target(ElementType.METHOD)
public @interface MyAnnotation {
}
