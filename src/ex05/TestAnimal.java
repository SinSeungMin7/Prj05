package ex05;

abstract class Pet { // 한개이상의 abstract 메소드가 있다면 abstract class 로 만들어야 한다

	String name;
	void eat() {
		System.out.println(name + "(이)가 먹는다");  // 함수 body 해당
	}
	abstract void sound();
	// void sound(); // 함수의 {} 가 없으면 에러가 나옴 abstract 필수
}

class Dog extends Pet {
	// 코딩이 없는 함수를 상속 받으면 반드시 자식이 코딩을 구현해야한다 - 재정의(override)
	// Add unimplemented method
	@Override // 재정의
	void sound() { //위에 코딩없는 sound 를 재정의한다
		System.out.println(name + "(이)가 멍멍");
	}
	
}

class Cat extends Pet {

	@Override
	void sound() {
		System.out.println(name + "(이)가 야옹");
	}
	
}


public class TestAnimal {

	public static void main(String[] args) {
		
//		Pet pet = new Pet(); // 오류 abstract 가 있으면 new 불가능
		
		Dog dog1  = new Dog();
		work(dog1, "츄");
//		dog1.name = "츄";
//		dog1.eat();
//		dog1.sound();
//		System.out.println();
		
		Cat cat1  = new Cat();
		work(cat1, "나비");
//		cat1.name = "나비";
//		cat1.eat();
//		cat1.sound();
	}
	
	// 방법2
	// work 1개로 통일
	// 부모 클래스는 자식 클래스에서 정의한 메소드나 필드를 사용하지 못한다 
	// Pet pet = new Pet(); Dog dog1 = pet; // 문법적인 오류
	// (자식 = 자신 + 부모 / 부모 = 자신)
	// 자식 클래스는 부모 클래스로부터 메소드와 필드를 물려받아 사용할수 있다
	// Pet pet = new Pet(); Dog dog1 = pet; // 오류 
	private static void work(Pet pet, String name) { // dog cat 통일버전 부모 클래스인 Pet 을 이용하여 적용한다
		pet.name = name;
		pet.eat();
		pet.sound();
		System.out.println();
	}
//---------------------------------------------------------
/*
	// 방법 1 : 함수의 오버로드 기능 활용
	private static void work(Dog dog1, String name) {
		dog1.name = "name";
		dog1.eat();
		dog1.sound();
		System.out.println();
	}

	private static void work(Cat cat1, String name) {
		cat1.name = "name";
		cat1.eat();
		cat1.sound();
	}
*/
}
