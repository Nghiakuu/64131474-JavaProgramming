package BT6;

public class Apps {

	public static void main(String[] args) {
		Cat c1 = new Cat("Tam the","Duc");
		Dog d1 = new Dog("PitBull","Cai");
		System.out.println(c1.toString());
		System.out.println(d1.toString());
		IAnimals c = new Cat("Muop","Cai");
		IAnimals d= new Dog("Husky","Duc");
		System.out.println(c.toString());
		System.out.println(d.toString());
		
	}

}
