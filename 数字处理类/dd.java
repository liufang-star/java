package ���ִ�����.txt;

                                 //���������ʹ��Math.random()������������

//�����ȡ�����ַ�֮�������ַ���

public class dd {
	//�����ȡ�����ַ�֮�������ַ���
	
	public static char GetRandomChar(char cha1,char cha2) {
		return (char)(cha1 + Math.random()*(cha2 - cha1 + 1));
	}

	public static void main(String[] args) {
		
		//��ȡa~z֮�������ַ���
		System.out.println("����Сд�ַ�Ϊ��"+GetRandomChar('a', 'z'));
		
		//��ȡA~Z֮�������ַ���
		System.out.println("�����д�ַ�Ϊ��"+GetRandomChar('A', 'Z'));
		
		//��ȡ0-9֮���������֣�
		System.out.println("0~9֮����������Ϊ��"+GetRandomChar('0', '9'));
		

	}

}
