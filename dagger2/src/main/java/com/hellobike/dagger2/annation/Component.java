package com.hellobike.dagger2.annation;


import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @Author Su Hengshuo
 * @Data 12/15/21
 */
@Target(TYPE)
@Retention(RUNTIME)
public @interface Component {

    Class<?>[] modules() default {};
}
