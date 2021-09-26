package reflect_;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;


                        //���÷��������Ĺ��췽��������  Constructor(�������)

/*
 * ��ȡ���췽����
 *        ��1����ȡ���й��еĹ��췽����class.getConstructors()
 *        
 *        ��2����ȡָ���Ĺ��й��췽����class.getConstructor(Class<?>...parameterTypes)
 *        
 *        ��3����ȡ���й��췽����class.getDeclaredConstructors()
 *                                                    ��������public������˽��private����
 *                                                    
 *        ��4����ȡָ���Ĺ��췽����class.getDeclaredConstructor(Class<?>...parameterTypes)
 *                                                     ��������public������˽��private����
 *                                                     
 *             
 * Constructor��ĳ��÷�������Modifier.toString(con.getModifiers())+"   "��
 *        ��1��getModifiers()����ÿ��Խ������ù��췽�����������η�������
 *        ��2��getExceptionTypes()����Class�������ʽ��øù��췽�������׳����쳣���ͣ�
 *        ��3��getParameterTypes()����������˳����Class�������ʽ��øù��췽���ĸ������������͡�
 *        ��4��newInstance(Object...initargs)��ͨ���ù��췽������ָ����������һ������Ķ���
 *        ��5��setAccessible(boolean flag)����ȡȨ�ޣ�ͨ���ù��췽������Ϊtrue��������������
 *        ��6��getName()����ȡ��������
 *        ��7��isVarArgs()���鿴�ù��췽���Ƿ�������пɱ������Ĳ�������������򷵻�true�����򷵻�false��
 *        
 *     
 * Modifier���еĳ��ý�����������Modifier.toString(con.getModifiers())+"   "��
 *        ��1��isPublic(int mod)���鿴�Ƿ�public���η����Σ�������򷵻�true�����򷵻�false��
 *        ��2��isProtected(int mod)���鿴�Ƿ�protected���η����Σ�������򷵻�true�����򷵻�false��
 *        ��3��isPrivate(int mod)���鿴�Ƿ�private���η����Σ�������򷵻�true�����򷵻�false��
 *        ��4��isStatic(int mod)���鿴�Ƿ�Static���η����Σ�������򷵻�true�����򷵻�false��
 *        ��5��isFinal(int mod)���鿴�Ƿ�final���η����Σ�������򷵻�true�����򷵻�false��
 *        ��6��toString(int mod)�����ַ�������ʽ�����������η���
 */

public class Constructor_01 {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		Example_01 example = new  Example_01();
		Class<? extends Example_01> c = example.getClass();
		
		Constructor cons[] = c.getDeclaredConstructors();     //����Constructor���飡
		
		for(Constructor con : cons) {      //����
			System.out.print(Modifier.toString(con.getModifiers())+"   ");   //��ȡ���η�
			System.out.print(con.getName()+"(");   //��ȡ������
			Class paras[] = con.getParameterTypes();     //��ȡ�����Ĳ�������
			
			for(int i = 0;i <paras.length;i++) {
				System.out.print(paras[i].getSimpleName()+"  args ");   //getSimpleName��ȡ�򻯰棡
				
				if(i <paras.length - 1) {     //�ж�
					System.out.print(",");
				}
			}
			System.out.println(") {      }");	
		}
		
		System.out.println();
	    System.out.println("�޲������췽����");
		Constructor cs1 = c.getDeclaredConstructor();    //�޲������췽����
		Object obj = cs1.newInstance();
		System.out.println(obj.toString());     //�����������д�ķ������������������д��Ч����
		
		System.out.println();
		System.out.println("��һ�������Ĺ��췽����");
		Constructor cs2 = c.getDeclaredConstructor(int.class);    //�в������췽����
		//Example_01 e = (Example_01) cs2.newInstance(123);
	     obj = cs2.newInstance(123);
		System.out.println(obj.toString());     //�����������д�ķ������������������д��Ч����
		
		System.out.println();
		System.out.println("�����������Ĺ��췽����");
		Constructor cs3 = c.getDeclaredConstructor(int.class,String.class,double.class);    //�в������췽����
		cs3.setAccessible(true);     //��ȡ����Ȩ�ޣ�
		obj = cs3.newInstance(-1,"����",-1.1);
		System.out.println(obj.toString());     //�����������д�ķ������������������д��Ч����
		
		
		
	}

}
 