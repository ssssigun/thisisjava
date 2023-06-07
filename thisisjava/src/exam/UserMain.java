package exam;

import java.util.List;
import java.util.Scanner;

public class UserMain {
	public static void main(String[] args) {
		boolean run = true;
		Scanner scan = new Scanner(System.in);
		String userInput = "";
		UserTable ut = new UserTable();
		

		while (run) {
			System.out.println("1.회원등록 | 2.회원목록 | 3.회원상세 | 4.회원수정 | 5.종료");
			System.out.print("입력> ");
			userInput = scan.nextLine();
			
			if ("1".equals(userInput) ) {
				System.out.println("[회원등록]");
				System.out.print("아이디 : ");
				String id = scan.nextLine();
				System.out.print("비밀번호 : ");
				String pwd = scan.nextLine();
				System.out.print("이름 : ");
				String name = scan.nextLine();
				
				if (ut.insert(id, pwd, name)) {
					System.out.println("회원등록 성공!");
					System.out.println();
				}
				else {
					System.out.println();
				}
			}
			
			else if ("2".equals(userInput) ) {
				System.out.println("[회원목록]");
				System.out.println("번호 \t 아이디 \t 비밀번호 \t 이름");
				for (int i=0;i<ut.userList.size(); i++) {
					System.out.println(ut.userList.get(i).getNo()+ " \t "
							+ ut.userList.get(i).getId()+ " \t "
							+ ut.userList.get(i).getPwd()+ " \t "
							+ ut.userList.get(i).getName());
				}
				
				
			}
			
			else if ("3".equals(userInput) ) {
				System.out.println("[회원상세]");
				System.out.print("아이디 : ");
				String id = scan.nextLine();
				User user = ut.findUser(id);
				if(user ==null) {
					System.out.println("해당 아이디가 존재하지 않습니다.");
				}
				else {
					System.out.println("번호 : " + user.getNo());
					System.out.println("아이디 : " + user.getId());
					System.out.println("이름 : " + user.getName());
					System.out.println("바밀번호 : " + user.getPwd());
				}
				
			}
			
			else if ("4".equals(userInput) ) {
				System.out.println("[회원수정]");
				System.out.print("아이디 : ");
				String id = scan.nextLine();
				System.out.print("비밀번호 : ");
				String pwd = scan.nextLine();
				System.out.print("이름 : ");
				String name = scan.nextLine();
				ut.update(id, name, pwd);
			}
			
			else if ("5".equals(userInput) ) {
				run = false;
			}
			
			else {
				System.out.println("다시 입력해주세요!");
			}
		}
		System.out.println("프로그램을 종료합니다!");
	}
}