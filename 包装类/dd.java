package ��װ��;

                                    //�ַ�����character����װ�ࣩ��ʹ�÷�����

public class dd {
	
	/*character������ֹ��췽����
	 *                 ��1��Character(char value);
	 *                 
	 *                 ��2��Character mychar = new Character('s');
	 */

	public static void main(String[] args) {
		Character c = new Character('a');
		System.out.println("�ַ���"+c);
		System.out.println();
		System.out.println("�Ǵ�д��ĸ��ʹ��isUpperCase��������"+Character.isUpperCase(c));
		System.out.println("��Сд��ĸ��ʹ��isLowerCase��������"+Character.isLowerCase(c));
		System.out.println();
		
		System.out.println("ת���ɴ�д�Ľ��Ϊ��ʹ��toUpperCase��������"+Character.toUpperCase(c));
		System.out.println("ת����Сд�Ľ��Ϊ��ʹ��toLowerCase��������"+Character.toLowerCase(c));
		System.out.println();
		
		System.out.println("����ַ�����ĸ��ʹ��isLetter��������"+Character.isLetter(c));
		System.out.println("����ַ���������ʹ��isDigit��������"+Character.isDigit(c));

	}

}
