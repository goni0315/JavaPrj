package rtti;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) //
@Target(ElementType.METHOD) //메소드에만 국한 되게끔
public @interface Print {
	boolean enable() default true;
}
