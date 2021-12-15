package com.hellobike.dagger2.annation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * @Author Su Hengshuo
 * @Data 12/15/21
 */
@Target({ElementType.CONSTRUCTOR, ElementType.FIELD})
public @interface Inject {}
