package reflect_;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//�����ֶΡ��������Ͳ���������ע�⣩
@Target({ElementType.FIELD,ElementType.METHOD,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)   //������ʱ����Annotation��JVM��

public @interface Field_Method_Parameter_Annotation {
	
	String describe();      //����һ��û��Ĭ��ֵ��String�ͳ�Ա
	Class type() default void.class;   //����һ������Ĭ��ֵ��Class�ͳ�Ա

}
