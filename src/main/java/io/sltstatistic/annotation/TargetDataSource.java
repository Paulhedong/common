package io.sltstatistic.annotation;

import java.lang.annotation.*;

/**
 * Created by user on 2017/12/29.
 */
@Target({ElementType.TYPE, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface TargetDataSource {

    String value();

}
