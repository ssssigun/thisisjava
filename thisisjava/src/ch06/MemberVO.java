package ch06;

public class MemberVO {
	//VO Value Object
	//DTO Data Transfer Object
	//DAO Data Access Object
	
	//alt+shift+s -> r -> alt +a -> r
	//getter, setter 자동 작성
	private int memberid;
	private String id;
	private String name;
	private String pwd;
	public int getMemberid() {
		return memberid;
	}
	public void setMemberid(int memberid) {
		this.memberid = memberid;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	
	
}
