package BTVN17_9;


import java.util.ArrayList;
import java.util.Collections;

public class PhoneBook extends Phone {
	ArrayList<String[]> PhoneList = new ArrayList<>();
	@Override
	void insertPhone(String name, String phone) {
		for (String[] i : PhoneList) {
			if (i[0].equals(name)) {
				if(i[1].contains(phone)) {
					System.out.println("Phone number already exists");
					return;
				}
				else {
					i[1] = i[1] + " : " + phone;
					System.out.println("Added: " + name + " - " + phone);
					return;
				}
			}
		}
		PhoneList.add(new String[] {name, phone});
		System.out.println("Added: " + name + " - " + phone);
	}

	@Override
	void removePhone(String name) {
		if(PhoneList.isEmpty()) {
			System.out.println("Phone List is empty");
		}
		else {
			for (String[] i : PhoneList) {
				if (i[0].equals(name)) {
					PhoneList.remove(i);
					System.out.println("Removed: " + name);
					return;
				}
			}
			System.out.println("Name not found");
		}
		
	}

	@Override
	void updatePhone(String name, String newphone) {
		for (String[] i : PhoneList) {
			if (i[0].equals(name)) {
				i[1] = newphone;
				System.out.println("Updated: " + name + " - " + newphone);
				return;
			}
		}
	}

	@Override
	void searchPhone(String name) {
		for (String[] i : PhoneList) {
			if (i[0].equals(name)) {
				System.out.println("Name: " + i[0] + ", Phone: " + i[1]);
				return;
			}
		}
		System.out.println("Name not found");
	}

	@Override
	void sort() {
		Collections.sort(PhoneList, (a, b) -> a[0].compareTo(b[0]));
		
	}
	public void printPhoneList() {
        System.out.println("Phone List:");
        for (String[] i : PhoneList) {
            System.out.println("Name: " + i[0] + ", Phone: " + i[1]);
        }
    }
	
}