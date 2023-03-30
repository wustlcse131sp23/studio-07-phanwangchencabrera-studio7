package studio7;

public class die {
	
	private int n;
	
	public die(int sides) {
		n = sides;
	}
	
	public int thrown() {
		return (int)((Math.random() * n) + 1);
	}
	
	public static void main(String[] args) {
		die d1 = new die(10);
		
		System.out.println(d1.thrown());
	}

}
