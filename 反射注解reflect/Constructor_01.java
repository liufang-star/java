package reflect_;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;


                        //利用反射访问类的构造方法！！！  Constructor(构造对象！)

/*
 * 获取构造方法：
 *        （1）获取所有公有的构造方法：class.getConstructors()
 *        
 *        （2）获取指定的公有构造方法：class.getConstructor(Class<?>...parameterTypes)
 *        
 *        （3）获取所有构造方法：class.getDeclaredConstructors()
 *                                                    包括公有public方法和私有private方法
 *                                                    
 *        （4）获取指定的构造方法：class.getDeclaredConstructor(Class<?>...parameterTypes)
 *                                                     包括公有public方法和私有private方法
 *                                                     
 *             
 * Constructor类的常用方法：（Modifier.toString(con.getModifiers())+"   "）
 *        （1）getModifiers()：获得可以解析出该构造方法所采用修饰符的整数
 *        （2）getExceptionTypes()：以Class数组的形式获得该构造方法可能抛出的异常类型！
 *        （3）getParameterTypes()：按照声明顺序以Class数组的形式获得该构造方法的各个参数的类型。
 *        （4）newInstance(Object...initargs)：通过该构造方法利用指定参数创建一个该类的对象。
 *        （5）setAccessible(boolean flag)：获取权限（通过该构造方法设置为true，则允许创建）！
 *        （6）getName()：获取方法名。
 *        （7）isVarArgs()：查看该构造方法是否允许带有可变数量的参数，如果允许则返回true，否则返回false。
 *        
 *     
 * Modifier类中的常用解析方法：（Modifier.toString(con.getModifiers())+"   "）
 *        （1）isPublic(int mod)：查看是否被public修饰符修饰，如果是则返回true，否则返回false。
 *        （2）isProtected(int mod)：查看是否被protected修饰符修饰，如果是则返回true，否则返回false。
 *        （3）isPrivate(int mod)：查看是否被private修饰符修饰，如果是则返回true，否则返回false。
 *        （4）isStatic(int mod)：查看是否被Static修饰符修饰，如果是则返回true，否则返回false。
 *        （5）isFinal(int mod)：查看是否被final修饰符修饰，如果是则返回true，否则返回false。
 *        （6）toString(int mod)：以字符串的形式返回所有修饰符。
 */

public class Constructor_01 {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		Example_01 example = new  Example_01();
		Class<? extends Example_01> c = example.getClass();
		
		Constructor cons[] = c.getDeclaredConstructors();     //返回Constructor数组！
		
		for(Constructor con : cons) {      //遍历
			System.out.print(Modifier.toString(con.getModifiers())+"   ");   //获取修饰符
			System.out.print(con.getName()+"(");   //获取方法名
			Class paras[] = con.getParameterTypes();     //获取方法的参数类型
			
			for(int i = 0;i <paras.length;i++) {
				System.out.print(paras[i].getSimpleName()+"  args ");   //getSimpleName获取简化版！
				
				if(i <paras.length - 1) {     //判断
					System.out.print(",");
				}
			}
			System.out.println(") {      }");	
		}
		
		System.out.println();
	    System.out.println("无参数构造方法：");
		Constructor cs1 = c.getDeclaredConstructor();    //无参数构造方法！
		Object obj = cs1.newInstance();
		System.out.println(obj.toString());     //父类调子类重写的方法，则会运行子类重写的效果！
		
		System.out.println();
		System.out.println("有一个参数的构造方法：");
		Constructor cs2 = c.getDeclaredConstructor(int.class);    //有参数构造方法！
		//Example_01 e = (Example_01) cs2.newInstance(123);
	     obj = cs2.newInstance(123);
		System.out.println(obj.toString());     //父类调子类重写的方法，则会运行子类重写的效果！
		
		System.out.println();
		System.out.println("有三个参数的构造方法：");
		Constructor cs3 = c.getDeclaredConstructor(int.class,String.class,double.class);    //有参数构造方法！
		cs3.setAccessible(true);     //获取操作权限！
		obj = cs3.newInstance(-1,"反射",-1.1);
		System.out.println(obj.toString());     //父类调子类重写的方法，则会运行子类重写的效果！
		
		
		
	}

}
 