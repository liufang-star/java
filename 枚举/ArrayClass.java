package Enum_;

                             //���巺����ʱ�����������ͣ�

/*
 * ע�⣺
 *        ����ʹ�÷��������������ʵ����
 *        ���ַ������Ǵ���ģ�
 *                                  public class ArrayClass<T>{
 *                                  private T[] array = new T[10];
 *                                  ...
 *                                  }
 */

public class ArrayClass<T> {    //����һ�������࣡
	
	public T[] getArray() {       //��ó�Ա����
		return array;
	}

	public void setArray(T[] array) {        //����setXXX()����Ϊ��Ա���鸳ֵ
		this.array = array;
	}

	private T[] array;       //���巺������

	public static void main(String[] args) {
		
		ArrayClass<String> a = new ArrayClass<String>();
		String[] array = {"��Ա1","��Ա2","��Ա3","��Ա4","��Ա5"};
		
		a.setArray(array);     //����setArray()������
		
		for(int i = 0;i < a.getArray().length;i++) {
			System.out.println(a.getArray()[i]);    //����getArray()�������������е�ֵ
		}
		

	}

}
