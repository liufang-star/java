package reflect_;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Annotation_Main {
	public static void main(String[] args) {
		
		Record recordC = new Record();
		Class<? extends Record> c = recordC.getClass();
		
		//获得所有构造方法
		Constructor[] declaredConstructors = c.getDeclaredConstructors();
		
		for(int i = 0;i < declaredConstructors.length;i++) {
			Constructor constructor = declaredConstructors[i];  //遍历构造方法
			
			if(constructor.isAnnotationPresent(Constructor_Annotation.class)){
			//获得指定类型的注释
			Constructor_Annotation ca = 
					(Constructor_Annotation) constructor.getAnnotation(Constructor_Annotation.class);
		System.out.println(ca.value());   //获得注释信息
		}
		
			//获得参数的注释
		Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
		for(int j = 0;j < parameterAnnotations.length;j++) {
			
			//获得指定参数注释的长度
			int length = parameterAnnotations[j].length;
			
			if(length == 0)       //如果长度为0，则表示没有为该参数添加注释
				System.out.println("       未添加Annotation的参数");
			else {
				for(int k =0;k < length;k++) {
					//获得参数的注释
					Field_Method_Parameter_Annotation pa = 
							        (Field_Method_Parameter_Annotation)
							        parameterAnnotations[j][k];
					System.out.print("      "+pa.describe());    //获得参数描述
					System.out.println("      "+pa.type());    //获得参数类型
				}
			}
			
			System.out.println();
				
		}
		}
		Field[] declaredFields = c.getDeclaredFields();   //获得所有字段
		for(int i = 0;i < declaredFields.length;i++) {
			Field field = declaredFields[i];    //遍历字段
			
			//查看是否具有指定类型的注释
			if(field.isAnnotationPresent(Field_Method_Parameter_Annotation.class)) {
				//获得指定类型的注释
				Field_Method_Parameter_Annotation fa = 
						field.getAnnotation(Field_Method_Parameter_Annotation.class);
				System.out.println("      "+fa.describe());     //获得字段的描述
				System.out.println("      "+fa.type());     //获得字段的类型
			}
		}
		
		Method[] methods = c.getDeclaredMethods();    //获得所有方法
		for(int i = 0;i < methods.length;i++) {
			Method method = methods[i];    //遍历方法
			
			//查看是否指定类型的注释
			if(method.isAnnotationPresent(Field_Method_Parameter_Annotation.class)) {
				
				//获得指定类型的注释
				Field_Method_Parameter_Annotation ma = 
						method.getAnnotation(Field_Method_Parameter_Annotation.class);
				System.out.println(ma.describe());     //获得方法的描述
				System.out.println(ma.type());    //获得方法的返回值类型
			}
			
			//获得参数的注释
			Annotation[][] parameterAnnotations = method.getParameterAnnotations();
			
			for(int j = 0;j < parameterAnnotations.length;j++) {
				int length = parameterAnnotations[j].length;   //获得指定参数注释的长度
				if(length == 0)
					System.out.println("      未添加Annotation的参数");
				else {
					for(int k =  0;k < length;k++) {
						//获得指定类型的注释
						Field_Method_Parameter_Annotation pa = 
								(Field_Method_Parameter_Annotation) parameterAnnotations[j][k];
						System.out.println("      "+pa.describe());    //获得参数的描述
						System.out.println("      "+pa.type());    //获得参数的类型
					}
				}
				System.out.println();
			}
		}
		

}
}