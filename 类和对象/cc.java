package ��Ͷ���.txt;

                                     //��̬������static�ؼ��֣���

/*��1��public class cc { } ��  public cc { } ��public cc { } ���ڹ��췽����
 * ��2��public void ������ { }  ���ڳ�Ա������
 *                            ע�⣺�ڶ����Ա����ʱ�������Ҫʹ�øú�����������ã�
 *                            ���磺public void outlet(){ 
 *                                            ......                          // ������...
 *                             }   //�����Ա������
 *                                       cc out = new cc();  //��Ҫ����ʵ������
 *                                       out.outlet();    //���ã�
 */


public class cc {
	
	static public int water = 0;     //����һ����̬����water����ʼֵΪ0��
	
	
	public void outlet(){     //����һ����Ա��������ˮ����ˮ��������
		
			/*ע�⣺�ڶ����Ա����ʱ��ֻ�е��òŻᱻ�����*/
		
		if(water >= 2) {
			water -= 2;  //���ˮ����water>2������-2��������
		}else {
			water = 0;   //����Ϊ0��������Ϊ������
		}
		
	}
	
	
	 public void inwater() {        //�����Ա��������ˮ��עˮ��������
		water += 3;
	}
	 

	public static void main(String[] args) {
		cc out = new cc();     //���� out ���󣬷������out.outlet()���ã�
		cc in = new cc();       //���� in ���󣬷������in.inwater()���ã�
		System.out.println("ˮ���е�ˮ��Ϊ��"+cc.water);
		System.out.println("��ˮ����עˮ���Σ�");
		in.inwater();   //���ã�
		in.inwater();
		System.out.println("ˮ���е�ˮ��Ϊ��"+cc.water);
		System.out.println("��ˮ���з�ˮһ�Σ�");
		out.outlet();
		System.out.println("ˮ���е�ˮ��Ϊ��"+cc.water);

	}

}
