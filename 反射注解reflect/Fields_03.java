package reflect_;

import java.lang.reflect.Field;

                                   //���÷��������ĳ�Ա��������Field����-��

/*
 * ��ȡ��Ա������
 *       ��1����ȡ���й��еĳ�Ա������class.getFields()
 *       
 *       ��2����ȡָ���Ĺ��г�Ա������class.getFileds(String name)
 *                                                                                 String name����������
 *                                                                                 
 *       ��3����ȡ���г�Ա������class.getDeclaredFields()
 *       
 *       ��4����ȡָ���ĳ�Ա������class.getDeclaredFields(String name)
 *                                                                                String name����������
 *                                                                                
 *                                                                               
 * Field��ĳ��÷�����
 *           ��1��getName()����øó�Ա����������
 *           ��2��getType()����ñ�ʾ�ó�Ա�������͵�Class����
 *           ��3��get(Object obj)�����ָ������obj�г�Ա������ֵ������ֵΪObject��
 *           ��4��set(Object obj,Object value)����ָ������obj�г�Ա������ֵ����Ϊvalue
 *           ��5��getInt(Object obj)�����ָ������obj������Ϊint�ĳ�Ա������ֵ
 *           ��6��getInt(Object obj,int i)����ָ������obj������Ϊint�ĳ�Ա������ֵ����Ϊi
 *           ��7��getBoolean(Object obj)�����ָ������obj������Ϊboolean�ĳ�Ա������ֵ
 *           ��8��getBoolean(Object obj,boolean z)����ָ������zobj������Ϊboolean�ĳ�Ա������ֵ����Ϊz
 *           ��9��setAccessible(boolean flag)���˷������������Ƿ����Ȩ������ֱ�ӷ���private��˽��Ȩ�޵ĳ�Ա����
 *           ��10��getModifiers()����ÿ��Խ������ó�Ա�������������η���������
 */

public class Fields_03 {

	public static void main(String[] args) {
		
		Example_03 example3 = new Example_03();
		Class exampleC = example3.getClass();
		
		//��ȡ���г�Ա����
		Field[] declaredFields = exampleC.getDeclaredFields();
		for(int i = 0;i < declaredFields.length;i++) {     //������Ա����
			
			Field field = declaredFields[i];
			System.out.println("����Ϊ��"+field.getName());    //��ȡ��Ա��������
			
			Class fieldType = field.getType();     //��ó�Ա��������
			System.out.println("����Ϊ��"+fieldType);
			boolean isTurn = true;
			while(isTurn) {
				//����ó�Ա�����ķ���Ȩ��Ϊprivate�����׳��쳣������������ʡ�
				try {
					isTurn = false;
					
					//��ó�Ա����ֵ
					System.out.println("�޸�ǰ��ֵΪ��"+field.get(example3));
					if(fieldType.equals(int.class)) {     //�жϳ�Ա�����������Ƿ�Ϊint��
						
						System.out.println("���÷���setint()�޸ĳ�Ա������ֵ");
						field.setInt(example3, 168);     //Ϊint�ͳ�Ա������ֵ
						
					}
					else if(fieldType.equals(float.class)) {    //�жϳ�Ա�����������Ƿ�Ϊfloat��
						
						System.out.println("���÷���setFloat()�޸ĳ�Ա������ֵ");
						field.setFloat(example3, 99.9F);    //Ϊfloat�ͳ�Ա������ֵ
						
					}
					
					else if(fieldType.equals(boolean.class)) {      //�жϳ�Ա�����������Ƿ�Ϊboolean��
						
						System.out.println("���÷���setboolean()�޸ĳ�Ա������ֵ");
						field.setBoolean(example3, true);    //Ϊboolean�ͳ�Ա������ֵ
						
					}
					else {
						System.out.println("���÷���set()�޸ĳ�Ա������ֵ");
						field.set(example3, "LIUFANG");     //����Ϊ�������͵ĳ�Ա������ֵ
					}
					
					//��ó�Ա����ֵ
					System.out.println("�޸ĺ��ֵΪ��"+field.get(example3));
				}catch(Exception e) {
					System.out.println("�����ó�Ա����ʱ�׳��쳣��"
							+"����ִ��setAccessible()������");
					field.setAccessible(true);     //�����������
					isTurn = true;
				}
			}
			System.out.println();
			
			
		}
		
		

	}

}
