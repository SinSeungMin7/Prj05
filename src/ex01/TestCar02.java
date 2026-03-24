package ex01;

class Car {
	// Field
	String name ;
	String color;
	int    year ;
	
	// Constructor : 생성자 - new 할때 실행되는 초기명령들
	public Car() {
		System.out.println("생성자 실행");
	}
	
	// Method
	void info() {
		System.out.println("차이름: " + name);
		System.out.println("차색깔: " + color);
		System.out.println("차연식: " + year);
		System.out.println();
	}
}

public class TestCar02 {

	public static void main(String[] args) {
		Car car1   =  new Car();
		car1.name  = "아빠차";
		car1.color = "Black";
		car1.year  = 2023;
		car1.info();
		
		Car car2   =  new Car();
		car2.name  = "엄마차";
		car2.color = "Red";
		car2.year  = 2025;
		car2.info();
		
		Car car3   =  new Car();
		car3.name  = "내차";
		car3.color = "Pink";
		car3.year  = 2026;
		car3.info();


	}

}
