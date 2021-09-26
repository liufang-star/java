package reflect_;

import java.lang.reflect.Method;

public class Method_06 {

	public static void main(String[] args) {
		
		Example_06 e6 = new Example_06();
		Class exampleC = e6.getClass();
		
		//������з���
		Method[] declaredMethods = exampleC.getDeclaredMethods();
		for(int i = 0;i < declaredMethods.length;i++) {
			Method method = declaredMethods[i];      //��������
			System.out.println("����Ϊ��"+method.getName());    //��ȡ��������
			System.out.println("�Ƿ�������пɱ������Ĳ�����"+method.isVarArgs());
			System.out.println("��ڲ�����������Ϊ��");
			
			Class[] parameterTypes = method.getParameterTypes();    //��ȡ���в�������
			for(int j = 0;j < parameterTypes.length;j++) {
				System.out.println("  "+parameterTypes[j]);
			}
			System.out.println("����ֵ����Ϊ��"+method.getReturnType());    //��÷�������ֵ����
			System.out.println("�����׳����쳣�����У�");
			
			Class[] exceptionTypes = method.getExceptionTypes();  //��÷��������׳��������쳣����
			for(int k = 0;k <exceptionTypes.length;k++) {
				System.out.println("  "+exceptionTypes[k]);
			}
			boolean isTurn = true;
			while(isTurn) {
				//����÷����ķ���Ȩ��Ϊprivate�����׳��쳣������������ʡ�
				try {
					
					isTurn = false;
					
					if("staticMethod".equals(method.getName()))
						method.invoke(e6);       //ִ��û����ڲ����ķ���
					
					else if("publicMethod".equals(method.getName()))
						System.out.println("����ֵΪ��"+method.invoke(e6, 168));    //ִ�з���
					
					else if("protectedMethod".equals(method.getName()))
						System.out.println("����ֵΪ��"+method.invoke(e6, "7",5));
					
					else if("privateMethod".equals(method.getName())){
						Object[] parameters = new Object[] {new String[] {
								"M","W","Q"}};
						System.out.println("����ֵΪ��"+method.invoke(e6, parameters));
						}
						
				}catch(Exception e) {
					System.out.println("��ִ�з���ʱ�׳��쳣��"+"����ִ��setAccessible()������");
					method.setAccessible(true);       //����Ϊ�������
					isTurn = true;  
				}
			}
			System.out.println();
		}

	}

}
