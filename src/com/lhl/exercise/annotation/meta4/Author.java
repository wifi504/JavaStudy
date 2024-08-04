package com.lhl.exercise.annotation.meta4;

import java.lang.annotation.Repeatable;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/2_11:23
 */

@Repeatable(Authors.class)
public @interface Author {

    /**
     * 作者名字
     *
     * @return 作者名字
     */
    String name();
}
