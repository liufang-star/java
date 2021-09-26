package reflect_;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Annotation_Main {
	public static void main(String[] args) {
		
		Record recordC = new Record();
		Class<? extends Record> c = recordC.getClass();
		
		//������й��췽��
		Constructor[] declaredConstructors = c.getDeclaredConstructors();
		
		for(int i = 0;i < declaredConstructors.length;i++) {
			Constructor constructor = declaredConstructors[i];  //�������췽��
			
			if(constructor.isAnnotationPresent(Constructor_Annotation.class)){
			//���ָ�����͵�ע��
			Constructor_Annotation ca = 
					(Constructor_Annotation) constructor.getAnnotation(Constructor_Annotation.class);
		System.out.println(ca.value());   //���ע����Ϣ
		}
		
			//��ò�����ע��
		Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
		for(int j = 0;j < parameterAnnotations.length;j++) {
			
			//���ָ������ע�͵ĳ���
			int length = parameterAnnotations[j].length;
			
			if(length == 0)       //�������Ϊ0�����ʾû��Ϊ�ò������ע��
				System.out.println("       δ���Annotation�Ĳ���");
			else {
				for(int k =0;k < length;k++) {
					//��ò�����ע��
					Field_Method_Parameter_Annotation pa = 
							        (Field_Method_Parameter_Annotation)
							        parameterAnnotations[j][k];
					System.out.print("      "+pa.describe());    //��ò�������
					System.out.println("      "+pa.type());    //��ò�������
				}
			}
			
			System.out.println();
				
		}
		}
		Field[] declaredFields = c.getDeclaredFields();   //��������ֶ�
		for(int i = 0;i < declaredFields.length;i++) {
			Field field = declaredFields[i];    //�����ֶ�
			
			//�鿴�Ƿ����ָ�����͵�ע��
			if(field.isAnnotationPresent(Field_Method_Parameter_Annotation.class)) {
				//���ָ�����͵�ע��
				Field_Method_Parameter_Annotation fa = 
						field.getAnnotation(Field_Method_Parameter_Annotation.class);
				System.out.println("      "+fa.describe());     //����ֶε�����
				System.out.println("      "+fa.type());     //����ֶε�����
			}
		}
		
		Method[] methods = c.getDeclaredMethods();    //������з���
		for(int i = 0;i < methods.length;i++) {
			Method method = methods[i];    //��������
			
			//�鿴�Ƿ�ָ�����͵�ע��
			if(method.isAnnotationPresent(Field_Method_Parameter_Annotation.class)) {
				
				//���ָ�����͵�ע��
				Field_Method_Parameter_Annotation ma = 
						method.getAnnotation(Field_Method_Parameter_Annotation.class);
				System.out.println(ma.describe());     //��÷���������
				System.out.println(ma.type());    //��÷����ķ���ֵ����
			}
			
			//��ò�����ע��
			Annotation[][] parameterAnnotations = method.getParameterAnnotations();
			
			for(int j = 0;j < parameterAnnotations.length;j++) {
				int length = parameterAnnotations[j].length;   //���ָ������ע�͵ĳ���
				if(length == 0)
					System.out.println("      δ���Annotation�Ĳ���");
				else {
					for(int k =  0;k < length;k++) {
						//���ָ�����͵�ע��
						Field_Method_Parameter_Annotation pa = 
								(Field_Method_Parameter_Annotation) parameterAnnotations[j][k];
						System.out.println("      "+pa.describe());    //��ò���������
						System.out.println("      "+pa.type());    //��ò���������
					}
				}
				System.out.println();
			}
		}
		

}
}