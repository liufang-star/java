package ���ִ�����.txt;

                           //��ѧ���㣨����Math�࣡����

public class bb {

	public static void main(String[] args) {
		
		System.out.println("Բ���ʦ���ֵΪ��"+Math.PI+"\n");

		
		//���Ǻ�����
		System.out.println("90�������ֵΪ��"+Math.sin(Math.PI/2));
		System.out.println("0�������ֵΪ��"+Math.cos(0)+"\n");
		
		
		//ָ�����㣡
		System.out.println("e��ƽ����Ϊ��"+Math.exp(2));
		System.out.println("��eΪ��2�Ķ���ֵΪ��"+Math.log(2));
		System.out.println("��10Ϊ��2�Ķ���ֵΪ��"+Math.log10(2));
		System.out.println("4��ƽ����Ϊ��"+Math.sqrt(4));
		System.out.println("125��������Ϊ��"+Math.cbrt(125));
		System.out.println("2�Ķ��η�Ϊ��"+Math.pow(2, 2));
		System.out.println("2����η�Ϊ��"+Math.pow(2, 5)+"\n");
		
		//�Ƚ����㣡
		System.out.println("46��32�Ƚϣ����ֵΪ����"+Math.max(46, 32));
		System.out.println("13��79�Ƚϣ���СֵΪ����"+Math.min(13, 79));
		System.out.println("-7�ľ���ֵΪ��"+Math.abs(-7)+"\n");
		
		
		//�������룡
		System.out.println("ʹ��floor()������Ч����"+Math.floor(2.6));
		System.out.println("ʹ��round()������Ч����"+Math.round(2.6));
		
		
		//Math.round(x) = (int)Math.floor(x+0.5f);
		System.out.println("----------------------------------------");
		System.out.println("ʹ��Math.round������������15.5��ֵΪ��"+Math.round(15.5));
		System.out.println("ʹ��Math.round������������-15.5��ֵΪ��"+Math.round(-15.5));
		System.out.println("ʹ��Math.round������������-15.51��ֵΪ��"+Math.round(-15.51));
		System.out.println("ʹ��Math.floor(-15.5 + 0.5f)ֵΪ��"+Math.floor(-15.5 + 0.5f));
		System.out.println("ʹ��Math.floor(-15.51 + 0.5f)ֵΪ��"+Math.floor(-15.51 + 0.5f));
		
		
		
		

	}

}
