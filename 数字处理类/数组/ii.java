package ����.txt;

public class ii {
	
	                                    //���������㷨��

	public static void main(String[] args) {
		
		//��3����ת���򣡣�
		
		int[] array = {87,23,45,70,46,56,12};   //����һ�����飡
		ii sorter = new ii();   //������ת������Ķ���
		sorter.sort(array);   //�����������ķ����������鷴ת��

	}

	public void sort(int[] array) {
		System.out.println("����ԭ����Ϊ��");
		showArray(array);   //�������ǰ������Ԫ�أ�
		int temp;
		int len = array.length;
		for(int i = 0;i < len/2;i++) {
			temp = array[i];
			array[i] = array[len -1-i];
			array[len-1-i] = temp;
		}
		System.out.println("���鷴ת�������Ϊ��");
		showArray(array);    //�������������Ԫ�أ�
		
	}

	public void showArray(int[] array) {
		for(int i : array) {      //�������飡
			System.out.print("\t"+i);     //���ÿ������Ԫ��ֵ��
		}
		System.out.println();
	}

}
