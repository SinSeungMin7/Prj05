package ex07;

interface Duck {
	void swim();
}

interface Racoon {
	void dic();
}

class DuckRacoon implements Duck, Racoon{

	@Override
	public void dic() {
		System.out.println("땅을 판다");
		
		
	}

	@Override
	public void swim() {
		System.out.println("헤엄을 친다");
		
	}
	
}

public class TestDuckRacoon {

	public static void main(String[] args) {
		DuckRacoon dr = new DuckRacoon();
		dr.swim();
		dr.dic();
		System.out.println(dr.hashCode());
		System.out.println(dr.getClass());
		System.out.println(dr.toString());
		
		// 모든 자바의 class 는 Object class를 상속받아서 만들어졌다
		Object obj = new Object();
		System.out.println(dr.hashCode()); // heap 메모리의 위치
		System.out.println(dr.getClass()); // class java.lang.Object
		System.out.println(dr.toString()); //
	}

}
