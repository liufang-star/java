package 集合类.txt;

public class Set_Comparable implements Comparable{
	
	int id;
	int age;
	String name;

	public Set_Comparable(int id, int age, String name) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Set_Comparable [id=" + id + ", age=" + age + ", name=" + name + "]";
	}


	@Override
	public int compareTo(Object o) {
		
		Set_Comparable p;
		if(o instanceof Set_Comparable) {
			p = (Set_Comparable)o;
		}else {
			return -1;     //-1代表传入的参数比我本身要小。
		}
		int diff = this.id - p.id;
		if(diff != 0) {
			diff = diff /Math.abs(diff);     //差值除以本身绝对值，可以得到-1或1
		}
		
		return 0;
	}

}
