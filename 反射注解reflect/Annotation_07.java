package reflect_;

import java.lang.reflect.Field;

                           //����ע�⣨ʹ��Annotation���ܣ���

/*
 * Ԫע�⣺
 *       ��1��@Decumented��ָʾĳһ���͵�ע��ͨ��javadoc�����Ƶ�Ĭ�Ϲ��߽����ĵ�����
 *       ��2��@Inherited��ָʾע�����ͱ��Զ��̳С�
 *       ��3��@Retention��ָʾע�����͵�ע��Ҫ������á�
 *       ��4��@Target��ָʾע�����������õĳ���Ԫ�����ࡣ
 *       
 *       
 * ö����ElementType�е�ö�ٳ�����
 *       ��1��ANNOTATION_TYPE����ʾ����Annotation���͡�
 *       ��2��TYPE����ʾ�����ࡢ�ӿں�ö�٣��Լ�Annotation���͡�
 *       ��3��CONSTRUCTOR����ʾ���ڹ��췽����
 *       ��4��FIELD����ʾ���ڳ�Ա������ö�ٳ�����
 *       ��5��METHOD����ʾ���ڷ�����
 *       ��6��PARAMETER����ʾ���ڲ�����
 *       ��7��LOCAL_VARIABLE����ʾ���ھֲ�������
 *       ��8��PACKAGE����ʾ���ڰ���
 *       
 *       
 * ö����RetentionPolicy�е�ö�ٳ�����
 *       ��1��SOURCE����ʾ������Annotation�����ļ��У���Ч��Χ��С��
 *       ��2��CLASS����ʾ����Annotation�����ļ��У�����������ʱ������Annotation��JVM�С�
 *       ��3��RUNTIME����ʾ������ʱ����Annotation��JVM�У���Ч��Χ���
 */

public class Annotation_07 {

	public static void main(String[] args) {
		Class c = CellPhone_Annotation_07.class;
		Field fs[] = c.getDeclaredFields();
		
		for(Field f : fs) {
			if(f.isAnnotationPresent(Phone_Annotation_07.class)) {
				//System.out.println(f.getName()+"��ע�����");
				Phone_Annotation_07 p = f.getAnnotation(Phone_Annotation_07.class);
				System.out.print(f.getName()+"���Ե�ע������Ϊ��");
				System.out.print("��ע = "+p.remarks());    //����ע���еı�ע����
				System.out.println("�������Ƿ���Ч = "+p.enable());   //���������Ƿ���Ч
			}
		}

	}

}
