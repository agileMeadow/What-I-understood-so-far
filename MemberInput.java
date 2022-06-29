package p2022_06_29;

import java.util.Scanner;

public class MemberInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Your Name: ");
		Scanner sc1 = new Scanner(System.in);
		String name1 = sc1.nextLine();

		System.out.println("Your Age: ");
		Scanner sc2 = new Scanner(System.in);
		int age1 = sc2.nextInt();

		System.out.println("Your Email: ");
		Scanner sc3 = new Scanner(System.in);
		String email1 = sc3.nextLine();

		System.out.println("Your Address: ");
		Scanner sc4 = new Scanner(System.in);
		String address1 = sc4.nextLine();
		
		MemberInfo m = new MemberInfo(name1, age1, email1, address1);
		//To call MemberInfo and save the info there.
		//m is the reference variable
		m.print();
	}
		
}

class MemberInfo {
	private String name;
	private int age;
	private String email;
	private String address;

	// Class
	public MemberInfo(String name, int age, String email, String address) {
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
