package ����.txt;

public class hh {
	
	                                  //���������㷨��

	public static void main(String[] args) {
		
		//��2��ֱ��ѡ�����򣡣�ѡ�����򣡣��ص㣡������
		
		int a[] = {64,1,75,46,7};
		System.out.println("ԭ����Ϊ��");
		for(int tt : a) {
			System.out.print(tt+"  ");
		}
		
		
		
		int index;
		for(int i =1;i <a.length;i++) {
			index = 0;
			for(int j = 1;j<=a.length-i;j++) {
				if(a[index]<a[j]) {
					index = j;
				}
			}
			int tmp = a[a.length-i];
			a[a.length-i] = a[index];
			a[index] = tmp;
		}
		System.out.println();
		System.out.println("ʹ��ѡ�������Ľ��Ϊ�����򣩣�");
		for(int kk : a) {
			System.out.print(kk+"  >  ");
		}
		
		
		
		for(int i =1;i <a.length;i++) {
			index = 0;
			for(int j = 1;j<=a.length-i;j++) {
				if(a[index]>a[j]) {
					index = j;
				}
			}
			int tmp = a[a.length-i];
			a[a.length-i] = a[index];
			a[index] = tmp;
		}
		System.out.println();
		System.out.println("ʹ��ѡ�������Ľ��Ϊ�����򣩣�");
		for(int kk : a) {
			System.out.print(kk+"  >  ");
		}
		System.out.println();
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		int[] array = {63,4,24,1,3,15};    //����һ�����飬�������Ԫ��������ģ�
		System.out.println("ԭ����Ϊ��");
		for(int yy : array) {
			System.out.print(yy+"  ");
		}
		System.out.println();
		hh sorter = new hh();    //����ֱ��������Ķ���
		sorter.sort(array);   //�����������ķ�������������


	}

		public void sort(int[] array) {
				int index;
				for(int i = 1;i<array.length;i++) {
					index = 0;
					for(int k = 1;k<=array.length-i;k++) {
						if(array[k] > array[index]) {
							index = k;
						}
					}
					//������λ��array.length-i��index�����ֵ���ϵ���������
					int tmp = array[array.length-i];   //�ѵ�һ��Ԫ�ص�ֵ���浽��ʱ�����У�
					array[array.length-i] = array[index];  //�ѵڶ���Ԫ��ֵ���浽��һ��Ԫ�ص�Ԫ�У�
					array[index] = tmp;  //����ʱ����Ҳ���ǵ�һ��Ԫ��ԭֵ���浽�ڶ���Ԫ���У�
				}
				showArray(array);   //���ֱ��ѡ������������Ԫ�أ�
										
		}

		public void showArray(int[] array) {
			System.out.println("ʹ����һ��ѡ�����򷽷���������Ϊ��");
			for(int aa : array) {     //��������
				System.out.print("  >  "+aa);     //���ÿ������Ԫ��ֵ��
			}
			System.out.println();
		}

}
