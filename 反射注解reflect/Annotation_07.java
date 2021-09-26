package reflect_;

import java.lang.reflect.Field;

                           //反射注解（使用Annotation功能）！

/*
 * 元注解：
 *       （1）@Decumented：指示某一类型的注释通过javadoc和类似的默认工具进行文档化。
 *       （2）@Inherited：指示注释类型被自动继承。
 *       （3）@Retention：指示注释类型的注释要保留多久。
 *       （4）@Target：指示注释类型所适用的程序元素种类。
 *       
 *       
 * 枚举类ElementType中的枚举常量：
 *       （1）ANNOTATION_TYPE：表示用于Annotation类型。
 *       （2）TYPE：表示用于类、接口和枚举，以及Annotation类型。
 *       （3）CONSTRUCTOR：表示用于构造方法。
 *       （4）FIELD：表示用于成员变量和枚举常量。
 *       （5）METHOD：表示用于方法。
 *       （6）PARAMETER：表示用于参数。
 *       （7）LOCAL_VARIABLE：表示用于局部变量。
 *       （8）PACKAGE：表示用于包。
 *       
 *       
 * 枚举类RetentionPolicy中的枚举常量：
 *       （1）SOURCE：表示不编译Annotation到类文件中，有效范围最小。
 *       （2）CLASS：表示编译Annotation到类文件中，但是在运行时不加载Annotation到JVM中。
 *       （3）RUNTIME：表示在运行时加载Annotation到JVM中，有效范围最大。
 */

public class Annotation_07 {

	public static void main(String[] args) {
		Class c = CellPhone_Annotation_07.class;
		Field fs[] = c.getDeclaredFields();
		
		for(Field f : fs) {
			if(f.isAnnotationPresent(Phone_Annotation_07.class)) {
				//System.out.println(f.getName()+"被注解过！");
				Phone_Annotation_07 p = f.getAnnotation(Phone_Annotation_07.class);
				System.out.print(f.getName()+"属性的注解内容为：");
				System.out.print("备注 = "+p.remarks());    //返回注解中的备注内容
				System.out.println("，属性是否有效 = "+p.enable());   //返回属性是否有效
			}
		}

	}

}
