package BT5;

public class CITIZEN {
    private String id;
	private String name;
    private int yearOfBirth;
    private String gender;
    private String nation;
    // Constructor
	public CITIZEN(String id, String name, int yearOfBirth, String gender, String nation) {
		super();
		this.id = id;
		this.name = name;
		this.yearOfBirth = yearOfBirth;
		this.gender = gender;
		this.nation = nation;
	}
	
	public CITIZEN() {
		super();
		// TODO Auto-generated constructor stub
	}

	// getter, setter
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYearOfBirth() {
		return yearOfBirth;
	}
	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}

	@Override
	public String toString() {
		return "CITIZEN [id=" + id + ", name=" + name + "]";
	}	
    
}
