package exam;

import java.util.ArrayList;
import java.util.List;

public class UserTable {
	List<User> userList =new ArrayList<User>();
	int no =1; // 자동증가할 번호
	
	// 생성자(필드 초기화)
	UserTable() {
	}
	
	/*
	 * 번호, 아이디, 비밀번호, 이름 입력받아
	 * User객체에 담아 리턴
	 */
	public User getUser(int no, String id, String pwd, String name) {
		User user = new User();
		user.setNo(no);
		user.setId(id);
		user.setPwd(pwd);
		user.setName(name);
		return user;
	}
	
	/*
	 * 아이디, 비밀번호, 이름 입력받아
	 * 현재 list에서 아이디가 존재하는지 여부 체크
	 * getUser 메서드를 호출 객체 리턴받아 변수에 저장
	 * 존재하면 false 리턴
	 * 존재하지 않으면 리스트에 추가하고 true 리턴
	 *
	 * 수정 : findUser 메서드 활용
	 * 수정 : no를 1씩 증가되서 저장되도록
	 */
	public boolean insert(String id, String pwd, String name) {
		User user = getUser(no, id, pwd, name);
		boolean result = false;
		
		if (findUser(id) == null) {
			userList.add(user);
			no++;
			result =true;
		}
		else {
			System.out.println("중복되는 아이디입니다!");
		}
		
		return result;
	}
	
	/*
	 * 아이디를 입력받아 리스트에 해당 아이디의 객체 리턴
	 * 존재하지 않으면 null 리턴
	 */
	public User findUser(String id) {
		User user =null;

		for(int i=0; i<userList.size();i++) {
			if(id.equals(userList.get(i).getId())) {
				user = userList.get(i);
			}
		}
		return user;
	}
	
	/*
	 *  id로 이름,비밀번호 변경
	 */
	public boolean update(String id, String name, String pwd) {
		boolean result = false;
		for(int i=0; i<userList.size();i++) {
			if(id.equals(userList.get(i).getId())) {		
				User user = getUser(userList.get(i).getNo(), id, pwd, name);
				userList.set(i, user);
				System.out.println("정상적으로 수정되었습니다!");
				result =true;
			}
		}
		if(result ==false ) {
			System.out.println("아이디가 존재하지 않습니다!");
		}
		return result;
	}
}
