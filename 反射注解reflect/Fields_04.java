package reflect_;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

public class Fields_04 {

	public static void main(String[] args) {
		
		Example_04 e4 = new Example_04();      //ʵ��������
		Class<? extends Example_04> c = e4.getClass();    //ָ���¶��󣨼̳У���
		
		Field fs[] = c.getDeclaredFields();
		
		for(Field f : fs) {
			
			System.out.print(Modifier.toString(f.getModifiers())+"    ");       //��ȡ���η���
			System.out.print(f.getType().getSimpleName()+"   ");     //��ó�Ա����������
			System.out.println(f.getName());       //��ȡ��������
			
			
		}
		
		try {
			
			Constructor cs  = c.getConstructor();      //������ȡ���췽���Ķ���
			Example_04 e = (Example_04) cs.newInstance();
			System.out.println();
			Field f1 = c.getDeclaredField("name");
			System.out.println("�޸�ǰ��ֵΪ��"+f1.get(e));     //��ȡ����ֵ
			
			f1.set(e, "liufang");     //�޸ĳ�Ա���ԣ�ע��ǰ��˳��
			System.out.println("�޸ĺ��ֵΪ��"+f1.get(e));
			
			/*
			 * ע�⣺
			 *       �����private���εĳ�Ա��������Ҫ���ʹ��Ȩ��
			 */
			
			System.out.println();
			Field f2 = c.getDeclaredField("price");
			f2.setAccessible(true);    //���ʹ��Ȩ��
			System.out.println("���private�ĳ�Ա����ֵ��"+f2.get(e));
			
			
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
