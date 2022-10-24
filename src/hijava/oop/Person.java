package hijava.oop;

public class Person {
	public String name;
	protected String PN;
	private String RRN;
	
	public Person(String name) {
		this.name = name;
	}
	
	
	public void setRRN(String RRN) {
		this.RRN = RRN;
	}
	
	public String getRRN() {
		return RRN;
	}
	

	public static void main(String[] args) {
	Person Kim = new Person("Kim");
	System.out.println("Nmae = " + Kim.name);

	Kim.PN = "010-1234-5678";
	System.out.println("PN = " + Kim.PN);
	
	Kim.setRRN("123456-1234567");
	System.out.println("RRN = " + Kim.getRRN());
	}
	
	

}
