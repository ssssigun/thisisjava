package ch08.example;

public class MysqlDao implements DataAccessObject {

	@Override
	public void select() {
		System.out.println("My sql DB를 검색");
	}

	@Override
	public void insert() {
		System.out.println("My sql DB를 삽입");

	}

	@Override
	public void update() {
		System.out.println("My sql DB를 수정");

	}

	@Override
	public void delete() {
		System.out.println("My sql DB를 삭제");

	}

}
