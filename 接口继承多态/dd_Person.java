package 接口继承多态.txt;

public class dd_Person {
	
	String name;
	String id;
	
	public boolean equals(Object obj) {
		
		dd_Person p = (dd_Person)obj;   //强制转换！
		boolean b1 = this.name.equals(p.name);
		boolean b2 = this.id.equals(p.id);
		return b1 && b2;
		
	}

	

}
