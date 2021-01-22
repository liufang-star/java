package ºØ∫œ¿‡.txt;

public class Set_hashCode {
	int id;
	String name;
	public Set_hashCode(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Set_hashCode [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Set_hashCode other = (Set_hashCode) obj;
		if (id != other.id)
			return false;
		return true;
	}
	

}
