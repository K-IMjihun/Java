
public class Archer {

	String name;
	String pow;
	
	public Archer(String name, String pow) {
		this.name = name;
		this.pow = pow;
		
	}
	
	public boolean equals(Object obj) {
		Archer temp = (Archer) obj;
		if(name == temp.name && pow == temp.pow) {
			return true;
		}
		else
		{
			return false;
		}
	}
	
}
