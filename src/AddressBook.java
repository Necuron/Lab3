import java.util.List;

public class AddressBook {

	public List<BuddyInfo> l;
	
	public void addBuddy(BuddyInfo contact)
	{
		l.add(contact);
	}
	
	public void removeBuddy(BuddyInfo contact)
	{
		l.remove(contact);
	}
	
	public static void main(String[] args)
	{
		System.out.println("Address Book");
	}
}
