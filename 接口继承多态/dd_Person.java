package �ӿڼ̳ж�̬.txt;

public class dd_Person {
	
	String name;
	String id;
	
	public boolean equals(Object obj) {
		
		dd_Person p = (dd_Person)obj;   //ǿ��ת����
		boolean b1 = this.name.equals(p.name);
		boolean b2 = this.id.equals(p.id);
		return b1 && b2;
		
	}

	

}
