package ch08.example;

public class OracleDao implements DataAccessObject {

	@Override
	public void select() {
		System.out.println("oracle DB를 검색");
	}

	@Override
	public void insert() {
		System.out.println("oracle DB를 삽입");

	}

	@Override
	public void update() {
		System.out.println("oracle DB를 수정");

	}

	@Override
	public void delete() {
		System.out.println("oracle DB를 삭제");

	}

}
