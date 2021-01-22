package ����.txt;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

public class bb {

	public static void main(String[] args) {
		try {
			bb_01 example = new bb_01();
			Class<? extends bb_01> c = example.getClass();
			Constructor[] cons = c.getDeclaredConstructors();//��ȡ���й��췽��
			for(Constructor con : cons) {
				System.out.print(Modifier.toString(con.getModifiers())+" ");  //���η�
				System.out.print(con.getName()+"(");   //������
				Class paras[] = con.getParameterTypes();  //�����Ĳ���
				for(int i = 0;i< paras.length;i++) {
					System.out.print(paras[i].getSimpleName()+" args ");
					if(i < paras.length - 1) {
						System.out.print(",");
					}
				}
				System.out.println("){   }");
				
			}
			Constructor cs1 = c.getDeclaredConstructor();  //�޲����Ĺ��췽����
			bb_01 e = (bb_01)cs1.newInstance();
			System.out.println(e.toString());
			
			Constructor cs2 = c.getDeclaredConstructor(int.class);  //�в����Ĺ��췽����
		    bb_01 e2 = (bb_01)cs2.newInstance(123);
			System.out.println(e2.toString());
			
			Constructor cs3 = c.getDeclaredConstructor(int.class,String.class,double.class);  //�޲����Ĺ��췽����
			cs3.setAccessible(true);//��ȡ����Ȩ��
		    bb_01 e3 = (bb_01)cs3.newInstance(-1,"����",-1.1);
			System.out.println(e3.toString());
		} catch (Exception e) {
			
			e.printStackTrace();
			System.out.println("�����쳣������");
		}

	}

}
