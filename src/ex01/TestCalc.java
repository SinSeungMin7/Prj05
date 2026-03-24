package ex01;

public class TestCalc {

	public static void main(String[] args) {
		int n1 = 7;
		int n2 = 2;
		int result;
		result = add(7, 2);
		System.out.println( result );
		
		result = add(n1, n2, 5);
		System.out.println( result );
	}

	// 객체지향 프로그램의 overloading 이라고 한다
	// 함수의 signature 가 다르면 여러개 만들 수 있다
	private static int add(int v1, int v2, int v3) {
		return v1 + v2 + v3;
	}

	private static int add(int v1, int v2) {
		
		return v1 + v2;
	}

}
