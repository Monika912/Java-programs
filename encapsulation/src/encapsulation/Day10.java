package encapsulation;

class House {
	private int hnumber;
	private String hname;
	private String haddress;
	private int hbedrooms;
	
	public House(int hnumber, String hname, String haddress, int hbedrooms) {
		
		this("Charlie");
		this.hnumber  = hnumber;
		this.hname = hname;
		this.haddress = haddress;
		this.hbedrooms = hbedrooms;
	}
	
	public House(int hnumber, String hname, int hbedrooms) {
		this.hnumber = hnumber;
		this.hname = hname;
		this.hbedrooms = hbedrooms;
	}
	
	House(String haddress) {
		
		this(99,"Chinthana",2);
		this.haddress = haddress;
	}
	
	public int getHnumber() {
		return hnumber;
	}
	
	public String getHname() {
		return hname;
	}
	
	public String getHaddress() {
		return haddress;
	}
	
	public int getHbedrooms() {
		return hbedrooms;
	}
	
}

public class Day10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		House h1 = new House(111,"Monika","Banglore",3);
		System.out.println(h1.getHnumber());
		System.out.println(h1.getHname());
		System.out.println(h1.getHaddress());
		System.out.println(h1.getHbedrooms());
	}
}
