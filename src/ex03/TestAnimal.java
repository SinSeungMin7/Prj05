package ex03;
// 부모 클래스 공부 하기 위한

class Dog {
	String name;
	void    eat() {
		System.out.println(name + "(이)가 먹는다");
	}
	void   bark() {
		System.out.println(name + "(이)가 멍멍");
	}
}

class Cat {
	String name;
	void eat() {
		System.out.println(name + "(이)가 먹는다");
	}
	void meow() {
		System.out.println(name + "(이)가 야옹");
	}
}

public class TestAnimal {

	public static void main(String[] args) {
		Dog chu  = new Dog();
		// new Dog() 생성자 호출 -> 문제는 생성자가 없다 : 자바가 기본 생성자를 생성해준다
		chu.name = "츄";
		chu.eat();
		chu.bark();
		System.out.println();
		
		Cat navi  = new Cat();
		navi.name = "나비";
		navi.eat();
		navi.meow();

	}

}
