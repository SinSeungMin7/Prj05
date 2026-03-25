package ex04;

// 부모 클래스
class Pet {
	String name;
	void eat() {
		System.out.println(name + "(이)가 먹는다");
	}
}

class Dog extends Pet{ // Dog = Pet + Dog 
	   // extends : 상속의 선언(방법)
// class (자식) 클래스명 extends (부모)클래스명{ }
	void   bark() {
		System.out.println(name + "(이)가 멍멍");
	}
}

class Cat extends Pet{	
	void meow() {
		System.out.println(name + "(이)가 야옹");
	}
}


public class TestAnimalInherit {
	
	// 상속 : Inherit -> Java 에서는 extends 로 처리한다
	// 다중상속 불가능(상속은 한개만 가능하다) -> Java, C#만
	public static void main(String[] args) {
		
		Pet pet  = new Pet();
		pet.name = "뻐끔이";
		pet.eat();
		System.out.println();
		
		Dog dog  = new Dog();
		dog.name = "츄";
		dog.eat();
		dog.bark();
		System.out.println();
		
		Cat navi  = new Cat();
		navi.name = "나비";
		navi.eat();
		navi.meow();

	}

}
