package Enum_;

                                        //ö�������еĹ��췽����

public class EnumIndexTest {
	
	enum Constant3{        //������������ö��������
		Constants_a("����ö������a"),      //�����������ö���ͳ�Ա
		Constants_b("����ö������b"),
		Constants_c("����ö������c"),
		Constants_d(3);
		
		private String description;
		private int i =4;
		
		private Constant3(){       //���췽��
			
		}
		
        private Constant3(String description) {     //�������ΪString�͵Ĺ��췽��
        	
        	this.description = description;
			
		}

		private Constant3(int i) {        //�������Ϊint���͵Ĺ��췽��
			
			this.i = this.i +i;
			
		}
		
		public int geti() {       //��ȡi��ֵ
			return i;
		}

		public String getDescription() {    //��ȡdescription��ֵ
			
			return description;
		}

		
	}

	public static void main(String[] args) {
		
		for(int i = 0;i <Constant3.values().length;i++) {
			System.out.println(Constant3.values()[i]+"����getDescription()����Ϊ��"
					+Constant3.values()[i].getDescription());
		}
		System.out.println(Constant3.valueOf("Constants_d")+"����geti()����Ϊ��"
				+Constant3.valueOf("Constants_d").geti());
		
		

	}

}
