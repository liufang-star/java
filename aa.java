package 反射.txt;

import java.lang.reflect.Constructor;

public class aa {

						//利用反射获取类的构造方法！！！  Constructor(构造对象！)
                  
	public static void main(String[] args) {
		aa_01 example = new aa_01("10","20","30");
		Class<? extends aa_01>exampleC = example.getClass();
		Constructor[] declConstructors = exampleC.getDeclaredConstructors();//获取所有构造方法
		
		 
		/*class.getConstructors()表示获取所有公有构造方法。
		 * 
		class.getConstructors(Class<?>...parameterTypes)表示获取指定的公有构造方法。
		Class<?>...parameterTypes表示构造参数！
		
		class.getDeclaredConstructors()表示获取所有构造方法，包括公有public和私有private！
		
		class.getDeclaredConstructors(Class<?>...parameterTypes)表示指定的构造方法。可以包括public和private中的。*/
		
		for(int i = 0;i < declConstructors.length;i++) {  //遍历构造方法
			Constructor<?>constructor = declConstructors[i];
			System.out.println("查看是否允许带有可变数量的参数："+constructor.isVarArgs());
			System.out.println("该构造方法的入口参数类型依次为：");
			Class[] parameterTypes = constructor.getParameterTypes();//获取所有参数类型
			for(int j = 0;j < parameterTypes.length;j++) {
				System.out.println(""+ parameterTypes[j]);
			} 
			System.out.println("该构造方法可能抛出的异常类型：");
			Class[] exceptionTypes = constructor.getExceptionTypes();
			for(int j = 0;j < exceptionTypes.length;j++) {
				System.out.println(""+exceptionTypes[j]);
			}
			aa_01 example2 = null;
			while(example2 == null) {
				try {     //如果该成员变量的访问权限为private，则抛出异常，即不允许访问
					if(i == 2) //通过执行默认没有参数的构造方法创建对象
						example2 = (aa_01)constructor.newInstance();
					else if(i == 1) 
						//通过执行具有两个参数的构造方法创建对象
						example2 = (aa_01)constructor.newInstance("7",5);
					else {  //通过执行具有可变数量参数的构造方法创建对象
						Object[] parameters = new Object[] {new String[] {"100","200","300"}};
						example2 = (aa_01)constructor.newInstance(parameters);
					}
					}catch(Exception e) {
						System.out.println("在创建对象时抛出异常，下面执行setAccessible()方法");
						constructor.setAccessible(true); //设置为允许访问
					}
				}
				if(example2 != null) {
					example2.print();
					System.out.println();
				}
			}
		
		
		
	}
}

