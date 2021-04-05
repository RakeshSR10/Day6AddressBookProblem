// Welcome to Addree Book Computation Program
import java.util.Scanner;
public class AddressBook
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First name = ");
		String first_name=sc.next();
		System.out.println("Enter Last name = ");
		String last_name=sc.next();
		System.out.println("Enter City name = ");
		String city=sc.next();
		System.out.println("Enter State name = ");
		String state=sc.next();
		System.out.println("Enter Phone number = ");
		String ph_number=sc.next();
		System.out.println("Enter Zip code = ");
		int zip=sc.nextInt();
		System.out.println("Enter Email = ");
		String email=sc.next();
		System.out.println("----------------------");
		System.out.println("FirstName = "+first_name);
		System.out.println("LastName = "+last_name);
		System.out.println("City = "+city);
		System.out.println("State = "+state);
		System.out.println("Phone Number = "+ph_number);
		System.out.println("Zip = "+zip);
		System.out.println("Email = "+email);
	}
}
