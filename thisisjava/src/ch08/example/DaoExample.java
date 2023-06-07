package ch08.example;

public class DaoExample {

	public static void main(String[] args) {
		DataAccessObject dao = new OracleDao();
		dbwork(dao);
		dbwork(new MysqlDao());

	}

	public static void dbwork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();

	}
}
