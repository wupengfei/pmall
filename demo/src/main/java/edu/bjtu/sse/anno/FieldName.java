package edu.bjtu.sse.anno;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ClassName:FieldName
 * Description:
 * Package:edu.bjtu.sse.anno
 *
 * @Date: 2020/5/6 22:21
 * @Author: wupengfei@bjtu.edu.cn
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface FieldName {
    String value() default "";
    int length();
}
