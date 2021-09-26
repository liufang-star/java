package reflect_;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

                                //利用反射获取类的成员方法（Method对象）！

/*
 * 获取成员方法：
 *         （1）获取所有公有成员方法：class.getMethod()
 *         
 *         （2）获取指定的公有成员方法：class.getMethod(String name,Class<?>...parameterTypes)
 *                                                                       String name：方法名
 *                                                                       Class<?>...parameterTypes：方法参数
 *                                                                       
 *        （3）获取所有成员方法：class.getDeclaredMethods()
 *        
 *        （4）获取指定的成员方法：class.getDeclaredMethod(String name,Class<?>...parameterTypes)
 *        
 *        
 * Method类的常用方法：
 *       （1）getName()：获得该方法的名称
 *       （2）getParameterTypes()：按照声明顺序以Class数组的形式获得该方法的各个参数的类型
 *       （3）getReturnType()：以Class对象的形式获得该方法的返回值的类型
 *       （4）getExceptionTypes()：以Class数组的形式获得该方法可能抛出的异常类型
 *       （5）invoke(Object obj,Object...args)：
 *                            利用指定参数args执行指定对象obj中的该方法，返回值为Object型
 *       （6）isVarArgs()：查看该构造方法是否允许带有可变数量的参数。
 *       （7）getModifiers()：获得可以解析出该方法所采用修饰符的整数。
 */

public class Method_05 {

	public static void main(String[] args) {
		
		try {
			
			Class c = Class.forName("java.lang.String");
			Method ms[] = c.getDeclaredMethods();
			
			for(Method m :ms) {
				System.out.print(Modifier.toString(m.getModifiers())+"   ");     //获取修饰符
				System.out.print(m.getReturnType().getSimpleName()+"   ");     //返回值类型
				System.out.print(m.getName()+"(");   //方法名字
				
				Class paras[] = m .getParameterTypes();
				for(int i = 0;i < paras.length;i++) {
					System.out.print(paras[i].getSimpleName()+"  args  ");
					if(i <paras.length -1) {
						System.out.print(",");
					}
				}
				System.out.print(")");
				Class excs[] = m.getExceptionTypes();
				if(excs.length > 0) {
					System.out.print(" throws ");
				}
				for(int i = 0; i < excs.length;i++) {
					System.out.print(excs[i].getSimpleName());
					if(i < excs.length - 1) {
						System.out.print(",");
					}
				}
				System.out.println("{     }");
				}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		

	}

}
