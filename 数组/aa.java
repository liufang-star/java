package ����.txt;

public class aa {
	
	                                    //����һά����

	public static void main(String[] args) {
		 //��1����ʼ��һά��������ַ�����
		int a[] = new int[3];
		a[0] = 1;
		a[1]  = 2;
		a[2] = 3;
		
		int b[] = new int[] {1,2,3,4,5,6};
		
		int c[]= {4,5,6,7,8,9};
		System.out.println("��һ�ִ���һά����ķ�����"+a);
		System.out.println("�ڶ��ִ���һά����ķ�����"+b);
		System.out.println("�����ִ���һά����ķ�����"+c);
		System.out.println();
		
		
		//ʹ��һά���鴴�����ڣ�
		int day[] = new int[] {31,28,31,30,31,30,31,31,30,31,30,31};
		for(int i =0;i <day.length;i++) {
			System.out.println("��"+(i+1)+"����"+day[i]+"��");
		}

	}

}
