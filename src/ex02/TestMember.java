package ex02;

class Member {
	// field : Data
	String name;
	String uid;
	String email;
	int    regYear;
	
	// 기본 생성자
	public Member() {}
	
	// 인자있는 생성자
	public Member(String n, String u, String e, int r) {
		name    = n;
		uid     = u;
		email   = e;
		regYear = r;
	}
	
	// Method : 기능
	void info() {
		String fmt = "이름 : %s\n아이디 : %s\n이메일 : %s\n가입연도 : %d"; 
				  
		String msg = String.format(fmt,  name, uid, email, regYear);
		
		System.out.println(msg);
	}
}

	

public class TestMember {

	public static void main(String[] args) {
		Member m1  = new Member();
		m1.name    = "사나";
		m1.uid     = "sana";
		m1.email   = "sana@email.com";
		m1.regYear = 2012;
		m1.info();
		System.out.println();
		
		Member m2  = new Member(); // new 뒤에있는 클래스이름() 호출되어 객체가 만들어지게 된다
		m2.name    = "정연";
		m2.uid     = "jungy";
		m2.email   = "jungy@email.com";
		m2.regYear = 2011;
		m2.info();
		System.out.println();
		
		Member m3  = new Member();
		m3.name    = "미나";
		m3.uid     = "mina";
		m3.email   = "mina@email.com";
		m3.regYear = 2015;
		m3.info();
		System.out.println();
		
		/*
		// member 배열에 저장
		Member [] mList  = new Member[3]; // 배열생성
		mList[0]         = new Member();  // 배열안에 저장할 Member 생성
		mList[0].name    = "사나";
		mList[0].uid     = "sana";
		mList[0].email   = "sana.email";
		mList[0].regYear = 2012;
		*/
		Member [] mList = new Member[3]; // 배열 생성
		mList[0]        = new Member("사나", "sana",  "sana@email.com",  2012);
		mList[1]        = new Member("정연", "jungy", "jungy@email.com", 2011);
		mList[2]        = new Member("미나", "mina",  "mina@email.com",  2015);
		
		// mList[0].info();
		// mList[1].info();
		// mList[2].info();
		for (int i = 0; i < mList.length; i++) {
			Member member = mList[i];
			member.info();
		}
	}

}
