package ����.txt;

public class gg {
	
	                                   //���������㷨

	public static void main(String[] args) {
		
		//��1��ð�����򣡣��ص㣡������
		
		int a[] = {64,1,75,56,7};
		System.out.println("ԭ����Ϊ��");
		for(int ii : a) {
			System.out.print(ii+"   ");
		}
		
		
		
		for(int i = 1;i < a.length;i++) {
			for(int j = 0;j<a.length-i;j++) {
				if(a[j]>a[j+1]) {
					int tmp = a[j];
					a[j] = a[j+1];
					a[j+1] = tmp;
				}
			}
		}
		System.out.println();
		System.out.println("ð������Ľ��Ϊ�����򣩣�");
		for(int kk : a) {
			System.out.print(kk+"  <  ");
		}
		
		
		
		for(int i = 1;i < a.length;i++) {
			for(int j = 0;j<a.length-i;j++) {
				if(a[j]<a[j+1]) {
					int tmp = a[j];
					a[j] = a[j+1];
					a[j+1] = tmp;
				}
			}
		}
		System.out.println();
		System.out.println("ð������Ľ��Ϊ�����򣩣�");
		for(int kk : a) {
			System.out.print(kk+"  >  ");
		}
		System.out.println();
		System.out.println();
		
		
		
		
		
		
		
		
		
		int[] array = {64,4,24,1,3,15};  //����һ�����飬�������Ԫ��������ģ�
		System.out.println("ԭ����Ϊ��");
		for(int yy : array) {
			System.out.print(yy+"  ");
		}
		System.out.println();
		gg sorter = new gg();   //����ð��������Ķ���
		sorter.sort(array);    //�������򷽷�����������

	}

			public void sort(int[] array) {
				for(int i = 1;i < array.length;i++) {
					//�Ƚ���������Ԫ�أ��ϴ��������ð�ݣ�
				for(int j = 0; j < array.length - 1;j++) {
					if(array[j] > array[j+1]) {
					    int tmp = array[j];   //�ѵ�һ��Ԫ��ֵ���浽��ʱ�����У�
							 array[j] = array[j+1];  //�ѵڶ���Ԫ��ֵ���浽��һ��Ԫ�ص�Ԫ�У�
							array[j+1] =tmp;   //����ʱ������Ҳ���ǵ�һ��Ԫ��ԭֵ�����浽�ڶ���Ԫ���У�
								}
							}
						}
				showArray(array);  //���ð������������Ԫ�أ�
						}
	
			public void showArray(int[] array) {
				System.out.println("ʹ����һ��ð�����򷽷���������Ϊ��");
				for(int oo : array) {     //�������飡
						System.out.print("  >  "+oo);   //���ÿ������Ԫ��ֵ��
					}
						System.out.println();
			}
														
}

