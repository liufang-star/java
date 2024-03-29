package reflect_;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)     //此注解只可以用在成员属性上
@Retention(RetentionPolicy.RUNTIME)    //此注解可以被反射

public @interface Phone_Annotation_07 {

//@Target(ElementType.FIELD)
//@Retention(RetentionPolicy.RUNTIME)
	
	String remarks() default "";     //备注
	
	boolean enable() default true;     //属性是否启用

}
