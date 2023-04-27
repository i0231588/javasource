package service;

import persistence.SampleDAO;
public class InsertService {

	public boolean insertArticle() {
		boolean isArticle = false;
		
		//DAO 호출
		
		SampleDAO dao = new SampleDAO();
		isArticle = dao.insert();
		
		return isArticle;
	}
}
