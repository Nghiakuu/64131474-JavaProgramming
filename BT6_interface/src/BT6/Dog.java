package BT6;

public class Dog implements IAnimals {
	private String category;
	private String gender;
	
	public Dog(String category, String gender) {
		super();
		this.category = category;
		this.gender = gender;
	}

	@Override
	public void Sound() {
		// TODO Auto-generated method stub
		System.out.println("Gau gau");
	}

	@Override
	public String toString() {
		return "Dog [category=" + category + ", gender=" + gender + "]";
	}	
	
}
