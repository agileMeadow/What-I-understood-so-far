package p2022_06_29;

import java.util.Scanner;

public class MemberInput1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("이름을 입력하세요");
		Scanner sc1 = new Scanner(System.in);
		String name1 = sc1.nextLine();

		System.out.println("나이를 입력하세요");
		Scanner sc2 = new Scanner(System.in);
		int age1 = sc2.nextInt();

		System.out.println("이메일을 입력하세요");
		Scanner sc3 = new Scanner(System.in);
		String email1 = sc3.nextLine();

		System.out.println("주소를 입력하세요");
		Scanner sc4 = new Scanner(System.in);
		String address1 = sc4.nextLine();
		
		MemberInfo m = new MemberInfo(name1, age1, email1, address1);
		//MemberInfo를 불러서 거기가다 저장시킴. 
		//m 은 레퍼런스 변수
		m.print();
	}
		
}

class MemberInfo {
	private String name;
	private int age;
	private String email;
	private String address;

	// 클래스
	public MemberInfo(String name, int age, String email, String address) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.address = address;
		// 생성자
	}
	
	public void print() {
		System.out.println("이름은"+name+"나이는"+age+"이메일은"+email+"주소는"+address);
	}
	}