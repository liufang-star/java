package reflect_;

import java.lang.reflect.Field;

                                   //利用反射访问类的成员变量。（Field对象）-！

/*
 * 获取成员变量：
 *       （1）获取所有公有的成员变量：class.getFields()
 *       
 *       （2）获取指定的公有成员变量：class.getFileds(String name)
 *                                                                                 String name：变量名称
 *                                                                                 
 *       （3）获取所有成员变量：class.getDeclaredFields()
 *       
 *       （4）获取指定的成员变量：class.getDeclaredFields(String name)
 *                                                                                String name：变量名称
 *                                                                                
 *                                                                               
 * Field类的常用方法：
 *           （1）getName()：获得该成员变量的名称
 *           （2）getType()：获得表示该成员变量类型的Class对象
 *           （3）get(Object obj)：获得指定对象obj中成员变量的值，返回值为Object型
 *           （4）set(Object obj,Object value)：将指定对象obj中成员变量的值设置为value
 *           （5）getInt(Object obj)：获得指定对象obj中类型为int的成员变量的值
 *           （6）getInt(Object obj,int i)：将指定对象obj中类型为int的成员变量的值设置为i
 *           （7）getBoolean(Object obj)：获得指定对象obj中类型为boolean的成员变量的值
 *           （8）getBoolean(Object obj,boolean z)：将指定对象zobj中类型为boolean的成员变量的值设置为z
 *           （9）setAccessible(boolean flag)：此方法可以设置是否忽略权限限制直接访问private等私有权限的成员变量
 *           （10）getModifiers()：获得可以解析出该成员变量所采用修饰符的整数。
 */

public class Fields_03 {

	public static void main(String[] args) {
		
		Example_03 example3 = new Example_03();
		Class exampleC = example3.getClass();
		
		//获取所有成员变量
		Field[] declaredFields = exampleC.getDeclaredFields();
		for(int i = 0;i < declaredFields.length;i++) {     //遍历成员变量
			
			Field field = declaredFields[i];
			System.out.println("名称为："+field.getName());    //获取成员变量名称
			
			Class fieldType = field.getType();     //获得成员变量类型
			System.out.println("类型为："+fieldType);
			boolean isTurn = true;
			while(isTurn) {
				//如果该成员变量的访问权限为private，则抛出异常，即不允许访问。
				try {
					isTurn = false;
					
					//获得成员变量值
					System.out.println("修改前的值为："+field.get(example3));
					if(fieldType.equals(int.class)) {     //判断成员变量的类型是否为int型
						
						System.out.println("利用方法setint()修改成员变量的值");
						field.setInt(example3, 168);     //为int型成员变量赋值
						
					}
					else if(fieldType.equals(float.class)) {    //判断成员变量的类型是否为float型
						
						System.out.println("利用方法setFloat()修改成员变量的值");
						field.setFloat(example3, 99.9F);    //为float型成员变量赋值
						
					}
					
					else if(fieldType.equals(boolean.class)) {      //判断成员变量的类型是否为boolean型
						
						System.out.println("利用方法setboolean()修改成员变量的值");
						field.setBoolean(example3, true);    //为boolean型成员变量赋值
						
					}
					else {
						System.out.println("利用方法set()修改成员变量的值");
						field.set(example3, "LIUFANG");     //可以为各种类型的成员变量赋值
					}
					
					//获得成员变量值
					System.out.println("修改后的值为："+field.get(example3));
				}catch(Exception e) {
					System.out.println("在设置成员变量时抛出异常，"
							+"下面执行setAccessible()方法！");
					field.setAccessible(true);     //设置允许访问
					isTurn = true;
				}
			}
			System.out.println();
			
			
		}
		
		

	}

}
