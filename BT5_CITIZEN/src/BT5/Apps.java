package BT5;

public class Apps {

	public static void main(String[] args) {
		CITIZEN c1 = new CITIZEN();
		c1.setId("200");
		c1.setName("Pham Gia Quynh");
		c1.setYearOfBirth(2000);
		c1.setGender("Nam");
		c1.setNation("Viet Nam");
		System.out.println(c1.toString());
		CITIZEN c2 = new CITIZEN("100","Nguyen Van A",2002,"Nam","Han Quoc");
		System.out.println(c2.toString());
	}
	

}
