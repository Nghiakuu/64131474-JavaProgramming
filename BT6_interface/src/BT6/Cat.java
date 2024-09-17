package BT6;

public class Cat implements IAnimals {
	private String category;
	private String gender;
	
	public Cat(String category, String gender) {
		super();
		this.category = category;
		this.gender = gender;
	}

	@Override
	public void Sound() {
		// TODO Auto-generated method stub
		System.out.println("Meow meow");
	}

	@Override
	public String toString() {
		return "Cat [category=" + category + ", gender=" + gender + "]";
	}
	

}
