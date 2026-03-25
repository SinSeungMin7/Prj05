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
	void bark() {
		System.out.println(name + "(이)가 멍멍");
	}
}

class Cat extends Pet{	
	void meow() {
		System.out.println(name + "(이)가 야옹");
	}

	public void grr() {
		// TODO Auto-generated method stub
		
	}
}

class Tiger extends Pet {
	void grr() {
		System.out.println(name + "(이)가 어흥");
	}
}


public class TestAnimalInherit {
	
	// 상속 : Inherit -> Java 에서는 extends 로 처리한다
	// 다중상속 불가능(상속은 한개만 가능하다) -> Java, C#만
	public static void main(String[] args) {
		
		
		
		Dog dog   = new Dog();
		 work(dog, "츄");
		 dog.name  = "츄";
		 dog.eat();
		 dog.bark();
		System.out.println("===================");
		
		Cat navi  = new Cat();
		 work(navi, "나비");
		 navi.name = "나비";
		 navi.eat();
		 navi.meow();
		System.out.println("===================");
		
		Tiger tiger = new Tiger();
		work(tiger, "큰냥이");
		
		/*
		Pet pet   = new Pet();
		pet.name  = "뻐끔이";
		pet.eat();
		System.out.println();
		//pet.bark(); //error
		//pet.meow(); //error
		*/
		
		// 가능
//		pet       = dog;
//		pet.eat();
//		pet.bark(); // 불가능
		
		// 불가능, 자식 = 부모 -> casting 을 하면 사용 가능하다
//	    dog       = pet;
//	    dog.eat();
//	    dog       = (Dog) pet;
//	    dog.eat();
		
//		System.out.println("===================");
//		Cat navi  = new Cat();
//		navi.name = "나비";
//		navi.eat();
//		navi.meow();
		
//		System.out.println("===================");
//		pet       = navi;
//		pet.eat();

	}

	// 한개의 work()함수로 업무처리
	private static void work(Pet pet, String name) {
		pet.name = name;
		System.out.println("Work:");
		pet.eat();
		
		if ( pet instanceof Dog )
		((Dog) pet).bark();
		if ( pet instanceof Cat )
		((Cat) pet).meow();
		if ( pet instanceof Tiger )
		((Tiger) pet).grr();
		
	}
	
/*
	private static void work(Cat navi, String name) {
		navi.name = name;
		System.out.print("work: ");
		navi.eat();
		navi.meow();
	}

	private static void work(Dog dog, String name) {
		dog.name = name;
		System.out.print("work: ");
		dog.eat();
		dog.bark();
	}
*/
}
