package ex06;

// 오리
class Duck {
	void swim() {
		System.out.println("헤엄을 칩니다");
	}
}

// 너구리 - 코드없는 함수로 구현
// 모든 항목이 abstract 인 abstract 가 붙은 class 는 interface 문법으로 변경가능하다
// extends 클래스 implements 인터페이스1, 2 ... 
/*
abstract class Racoon { 
	abstract void dig(); 
	
}
*/
interface Racoon { 
	 void dig(); 	
}

// 오리너구리 = 오리 + 너구리
// class DuckRacoon extends Duck, Racoon {} // 다중 상속 불가능하다 : 에러 extends 뒤에는 한개만 올수있다
	class DuckRacoon extends Duck implements Racoon {

		@Override
		public void dig() {
			System.out.println("땅을판다");
		}
		
	}



public class TestDuckRacoon {

	public static void main(String[] args) {
		DuckRacoon dr = new DuckRacoon();
		dr.swim();
		dr.dig();
	}

}
