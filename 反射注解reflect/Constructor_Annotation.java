package reflect_;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.CONSTRUCTOR)    //���ڹ��췽��
@Retention(RetentionPolicy.RUNTIME)     //������ʱ����Annotation��JVM��

public @interface Constructor_Annotation {
	
	String value() default "Ĭ�Ϲ��췽��";    //����һ������Ĭ��ֵ��String�ͳ�Ա
	
	

}
