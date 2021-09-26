package reflect_;

import java.lang.reflect.Constructor;

public class Constructor_02 {

	public static void main(String[] args) {
		
		Example_02 example = new Example_02("10", "20","30");
		Class<? extends Example_02> c = example.getClass();
		
		//��ȡ���й��췽����
		Constructor [] declaredConstructors = c.getDeclaredConstructors();
		
		for(int i = 0; i < declaredConstructors.length;i++) {     //�������췽��
			
			Constructor<?> constructor = declaredConstructors[i];
			System.out.println("�鿴�Ƿ�������пɱ������Ĳ�����"+constructor.isVarArgs());
			System.out.println("�ù��췽������ڲ�����������Ϊ��");
			Class[] parameterTypes = constructor.getParameterTypes();    //��ȡ���в�������
			for(int j = 0;j < parameterTypes.length;j++) {    
				System.out.println(" "+parameterTypes[j]);
			}
			System.out.println("�ù��췽�������׳����쳣����Ϊ��");
			
			//��ȡ���п����׳����쳣��Ϣ����
			Class[] exceptionTypes = constructor.getExceptionTypes();
			for(int j = 0;j < exceptionTypes.length;j++) {
				System.out.println(" "+exceptionTypes[j]);
			}
			
			Example_02 example2 = null;
			while(example2 == null) {
				try {       //����ó�Ա�����ķ���Ȩ��Ϊprivate�����׳��쳣�������������
					if(i == 2)       //ͨ��ִ��Ĭ��û�в����Ĺ��췽����������
						example2 = (Example_02)constructor.newInstance();
					else if(i == 1) {
						                //ͨ��ִ�о������������Ĺ��췽����������
						example2 = (Example_02)constructor.newInstance("7",5);
					}
					else {
						Object[] parameter = new Object[] {new String[] {"100","200","300"}};
						example2 = (Example_02)constructor.newInstance(parameter);
					}
				}catch(Exception e){
					System.out.println("�ڴ�������ʱ�׳��쳣������ִ��setAccessible()����");
					constructor.setAccessible(true);
				}
			}
		if(example2 != null) {
			example2.print();
			System.out.println();
		}
		}

	}

}
