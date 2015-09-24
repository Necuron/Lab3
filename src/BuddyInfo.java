
public class BuddyInfo {
	public String name;
	public String address;
	public String phoneNumber;
	
	public static void main(String[] args) {
		
		BuddyInfo b = new BuddyInfo();
		b.setName("Homer");
		System.out.println("Hello " + b.getName());
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
