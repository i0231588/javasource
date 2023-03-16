package inter;

public class DaoEx {

	public static void main(String[] args) {
		OracleDao oracle = new OracleDao();
		dbWork(oracle);
		MySql mySql = new MySql();
		dbWork(mySql);
	}
	
	static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
//	static void dbWork2(OracleDao oracle) {
//		oracle.select();
//		oracle.insert();
//		oracle.update();
//		oracle.delete();
//	}
		
	}

