package Annotation;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;

/**
 * @author shkstart
 * @create 2019 上午 11:56
 */
@SuppressWarnings("j")
@Inherited
@Repeatable(MyAnnotations.class)
@Retention(RetentionPolicy.RUNTIME)//RUNTIME能被反射读出来
@Target({TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE,TYPE_PARAMETER,TYPE_USE})  //注解能修饰的结构
public @interface MyAnnotation {

    String value() default "hello";//default "hello" 指定的默认值
}
