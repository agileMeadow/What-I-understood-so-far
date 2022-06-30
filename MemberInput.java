package p2022_06_29;

import java.util.Scanner;

public class Github0629 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Your Name: ");
		Scanner sc = new Scanner(System.in);
		String name1 = sc.nextLine();

		System.out.println("Your Age: ");
		int age1 = sc.nextInt();
		sc.nextLine();

		System.out.println("Your Email: ");
		String email1 = sc.nextLine();

		System.out.println("Your Address: ");
		String address1 = sc.nextLine();
		
		MemberInfo2 m = new MemberInfo2(name1, age1, email1, address1);
		//To call MemberInfo and save the info there.
		//m is the reference variable
		m.print();
		
		sc.close();
	}
		
}

class MemberInfo2 {
	private String name;
	private int age;
	private String email;
	private String address;
	
	// Class
	public MemberInfo2(String name, int age, String email, String address) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.address = address;
		// Constructor
	}
	
	public void print() {
		System.out.println("Your Name is "+name+", age is "+age+", email is "+email+", address is "+address);
	}
	}
