package ����.txt;

public class bb {
	
	                              //��ά����Ĵ�����ʹ��

	public static void main(String[] args) {
		//1����ʼ����ά��������ַ�����
		int a[][] = {{4,5,6},{7,8,9}};
		
		int b[][] = new int[][] {{1,2,3},{4,5,6}};
		
		int c[][] = new int[2][3];
		c[0] = new int[]{1,2,3};
		c[1] = new int[] {2,3,4};
		
		System.out.println("��һ�֣�"+a);
		System.out.println("�ڶ��֣�"+b);
		System.out.println("�����֣�"+c);
		System.out.println();
		
		
		
		
		//2����1��ʹ�ö�ά���鴴�����������ʫ��
		char d[][] = new char[4][];
		d[0] = new char[]{'��','��','��','��','��'};   //ע�⣺�ڴ�����ά����ʱ������ʹ��new����
		d[1] = new char[] {'��','��','��','��','��'};
		d[2] = new char[] {'ҹ','��','��','��','��'};
		d[3] = new char[] {'��','��','֪','��','��'};
		
		System.out.println("\t----------���-----------");
		for(int i =0;i < d.length;i++) {
			for(int j = 0;j < d[i].length;j++) {
				System.out.print("\t"+d[i][j]);
			}
			if(i % 2 == 0) {
				System.out.println("��");
			}
			else {
				System.out.println("��");
			}
		}
		System.out.println();
		
		
		//2����2������
		System.out.println("\t----------����----------");
		for(int j = 0;j < 5;j++) {
			for(int i = 3;i >= 0.;i--) {
				System.out.print("\t"+d[i][j]);
			}
			System.out.println();
		}
		System.out.println("\t��\t��\t��\t��");
		
	}

}
