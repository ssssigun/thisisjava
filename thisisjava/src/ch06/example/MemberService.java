package ch06.example;

public class MemberService {
	String id = "hong";
	String password= "12345";
	
	public boolean login(String id, String password) {
		return this.id.equals(id) && this.password.equals(password);
		
	}
	
	public void logout(String id) {
		if(this.id.equals(id)) {
			System.out.println(id+ "님이 로그아웃 되었습니다.");
		}
	}
	
}
