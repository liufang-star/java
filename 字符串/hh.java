package �ַ���.txt;

public class hh {  //�½���
	 
	                       //�Ƚ�stringbuilder��string������Ч�ʣ�����

	public static void main(String[] args) {   //������
		
				String str = "";    //�������ַ���
				
				//������ַ���ִ�в�������ʼʱ��
				
				long starTime = System.currentTimeMillis();
				for(int i =0;i < 10000;i++) {    //����forѭ��ִ��10000�β���
					str += 1;    //ѭ��׷���ַ���
				}
				long endTime = System.currentTimeMillis();   //������ַ����������ʱ��
				long time = endTime - starTime;   //������ַ���ִ�в�����ʱ��
				System.out.println("String���ĵ�ʱ��Ϊ��"+time);   //��ִ�е�ʱ�����
				
				StringBuilder builder = new StringBuilder("");  //�����ַ���������
				starTime = System.currentTimeMillis();  //�������ִ��ǰ��ʱ��
				for(int j = 0;j < 10000;j++) {   //����forѭ��ִ�в���10000��
					builder.append(j);   //ѭ��׷���ַ���
				}
				endTime = System.currentTimeMillis();   //����������ʱ��
				time = endTime - starTime;  //׷�Ӳ���ִ�е�ʱ��
				System.out.println("stringbuilder����ʱ��Ϊ��"+time);
				
			
	}

}
