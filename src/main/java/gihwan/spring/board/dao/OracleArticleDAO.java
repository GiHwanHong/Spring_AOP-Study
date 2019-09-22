package gihwan.spring.board.dao;

import gihwan.spring.board.vo.ArticleVO;

public class OracleArticleDAO implements ArticleDAO {
	// OracleDAO 인터페이스를 구현한 OracleArticleDAO 클래스 구현
	
	@Override
	public void insert(ArticleVO article) {
		System.out.println("핵심로직 =====> MyOracleArticleDAO.insert() 실행");
	}

	@Override
	public void updateReadCount(int id, int i) {
		System.out.println("핵심로직 =====> MyOracleArticleDAO.updateReadCount() 실행");
	}

}
