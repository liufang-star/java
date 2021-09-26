package reflect_;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

public class Fields_04 {

	public static void main(String[] args) {
		
		Example_04 e4 = new Example_04();      //实例化对象
		Class<? extends Example_04> c = e4.getClass();    //指定新对象（继承）！
		
		Field fs[] = c.getDeclaredFields();
		
		for(Field f : fs) {
			
			System.out.print(Modifier.toString(f.getModifiers())+"    ");       //获取修饰符！
			System.out.print(f.getType().getSimpleName()+"   ");     //获得成员变量的类型
			System.out.println(f.getName());       //获取属性名字
			
			
		}
		
		try {
			
			Constructor cs  = c.getConstructor();      //创建获取构造方法的对象
			Example_04 e = (Example_04) cs.newInstance();
			System.out.println();
			Field f1 = c.getDeclaredField("name");
			System.out.println("修改前的值为："+f1.get(e));     //获取属性值
			
			f1.set(e, "liufang");     //修改成员属性，注意前后顺序
			System.out.println("修改后的值为："+f1.get(e));
			
			/*
			 * 注意：
			 *       如果是private修饰的成员变量，需要获得使用权限
			 */
			
			System.out.println();
			Field f2 = c.getDeclaredField("price");
			f2.setAccessible(true);    //获得使用权限
			System.out.println("获得private的成员属性值："+f2.get(e));
			
			
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchFieldException e1) {
			e1.printStackTrace();
		}
			
			

	}

}
