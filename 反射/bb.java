package 反射.txt;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

public class bb {

	public static void main(String[] args) {
		try {
			bb_01 example = new bb_01();
			Class<? extends bb_01> c = example.getClass();
			Constructor[] cons = c.getDeclaredConstructors();//获取所有构造方法
			for(Constructor con : cons) {
				System.out.print(Modifier.toString(con.getModifiers())+" ");  //修饰符
				System.out.print(con.getName()+"(");   //方法名
				Class paras[] = con.getParameterTypes();  //方法的参数
				for(int i = 0;i< paras.length;i++) {
					System.out.print(paras[i].getSimpleName()+" args ");
					if(i < paras.length - 1) {
						System.out.print(",");
					}
				}
				System.out.println("){   }");
				
			}
			Constructor cs1 = c.getDeclaredConstructor();  //无参数的构造方法。
			bb_01 e = (bb_01)cs1.newInstance();
			System.out.println(e.toString());
			
			Constructor cs2 = c.getDeclaredConstructor(int.class);  //有参数的构造方法。
		    bb_01 e2 = (bb_01)cs2.newInstance(123);
			System.out.println(e2.toString());
			
			Constructor cs3 = c.getDeclaredConstructor(int.class,String.class,double.class);  //无参数的构造方法。
			cs3.setAccessible(true);//获取操作权限
		    bb_01 e3 = (bb_01)cs3.newInstance(-1,"反射",-1.1);
			System.out.println(e3.toString());
		} catch (Exception e) {
			
			e.printStackTrace();
			System.out.println("发生异常！！！");
		}

	}

}
