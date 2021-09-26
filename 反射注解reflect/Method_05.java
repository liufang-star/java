package reflect_;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

                                //���÷����ȡ��ĳ�Ա������Method���󣩣�

/*
 * ��ȡ��Ա������
 *         ��1����ȡ���й��г�Ա������class.getMethod()
 *         
 *         ��2����ȡָ���Ĺ��г�Ա������class.getMethod(String name,Class<?>...parameterTypes)
 *                                                                       String name��������
 *                                                                       Class<?>...parameterTypes����������
 *                                                                       
 *        ��3����ȡ���г�Ա������class.getDeclaredMethods()
 *        
 *        ��4����ȡָ���ĳ�Ա������class.getDeclaredMethod(String name,Class<?>...parameterTypes)
 *        
 *        
 * Method��ĳ��÷�����
 *       ��1��getName()����ø÷���������
 *       ��2��getParameterTypes()����������˳����Class�������ʽ��ø÷����ĸ�������������
 *       ��3��getReturnType()����Class�������ʽ��ø÷����ķ���ֵ������
 *       ��4��getExceptionTypes()����Class�������ʽ��ø÷��������׳����쳣����
 *       ��5��invoke(Object obj,Object...args)��
 *                            ����ָ������argsִ��ָ������obj�еĸ÷���������ֵΪObject��
 *       ��6��isVarArgs()���鿴�ù��췽���Ƿ�������пɱ������Ĳ�����
 *       ��7��getModifiers()����ÿ��Խ������÷������������η���������
 */

public class Method_05 {

	public static void main(String[] args) {
		
		try {
			
			Class c = Class.forName("java.lang.String");
			Method ms[] = c.getDeclaredMethods();
			
			for(Method m :ms) {
				System.out.print(Modifier.toString(m.getModifiers())+"   ");     //��ȡ���η�
				System.out.print(m.getReturnType().getSimpleName()+"   ");     //����ֵ����
				System.out.print(m.getName()+"(");   //��������
				
				Class paras[] = m .getParameterTypes();
				for(int i = 0;i < paras.length;i++) {
					System.out.print(paras[i].getSimpleName()+"  args  ");
					if(i <paras.length -1) {
						System.out.print(",");
					}
				}
				System.out.print(")");
				Class excs[] = m.getExceptionTypes();
				if(excs.length > 0) {
					System.out.print(" throws ");
				}
				for(int i = 0; i < excs.length;i++) {
					System.out.print(excs[i].getSimpleName());
					if(i < excs.length - 1) {
						System.out.print(",");
					}
				}
				System.out.println("{     }");
				}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		

	}

}
