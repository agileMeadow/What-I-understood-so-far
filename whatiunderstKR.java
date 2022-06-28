package p2022_06_28;

class MyDate05 { // 같은 패키지 안에 동일한 이름이 있으면 안됨.
	// 클래스의 구성요소 : 필드, 생성자, 메소드
	private int year; // 필드. 기본값을 설정하지 않으면 0으로 초기화됨.
	private int month;
	private int day;

	// 기본 생성자는 객체를 생성할 때 컴파일러가 자동으로 만들어 주지만,
	// 예외적으로 매개변수를 가진 생성자가 있을 경우에는 더 이상 기본 생성자를 만들어 주지 않는다.

	public MyDate05() { // 기본 생성자. 있어도 되고 없어도 됨. 기본 값: 0
	}

	public MyDate05(int new_year, int new_month, int new_day) {
		year = new_year; // 이게 있으면 내가 입력한 값을 넣을 수 있음.
		month = new_month;
		day = new_day; // 매개 변수를 가진 생성자 (매개 변수를 가진 생성자가 있을 때는 컴파일러가 자동적으로 생성해주지 않음)
	}

	// 매개변수를 가진 생성자 만들기 :
	// 마우스 오른쪽 클릭 -> source -> Generate Constructor Using Field -> Omit call to
	// default constructor super() 체크

	// public MyDate04(int year,int month,int day){
	// this.year=year;
	// this.month=month;
	// this.day=day;
	// } 이렇게 this를 사용하면 같은이름으로 사용 가능.

	public void print() { // 메소드
		System.out.println(year + "/" + month + "/" + day);
	}
}

public class ConstructorTest05 {
	public static void main(String[] args) {
		// 자바 가상머신이 가장 먼저 main method 호출하기 때문에 main method 가 가장 먼저 실행됨.
		MyDate05 d = new MyDate05();
		// 기본 생성자 호출
		System.out.println(d.year);
		System.out.println(d.month);
		System.out.println(d.day); // 하나씩 출력할 경우
		d.print();

		MyDate05 d2 = new MyDate05(2017, 7, 19);
		// 매개변수가 있는 생성자 호출
		d2.print();

		MyDate05 d3 = new MyDate05(2022, 7, 22);
		d3.print(); // 객체를 생성할 때마다 초기화 될 값을 서로 다르게 생성 가능.
	}
}
