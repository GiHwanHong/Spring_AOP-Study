package gihwan.spring.board.dao;

import gihwan.spring.board.vo.ArticleVO;

public interface ArticleDAO {
	
	/* 데이터베이스 연동의 모든 작업이 존재해야한다. 
	 * update(ArticleVO article)
	 * delete(int id, string password)
	 * ArticleVO getArticle(int id)
	 * int getArticleCount() 
	 * List<ArticleVO> getArticleList(int start, int end)
	 */
	
	void insert(ArticleVO article);
	void updateReadCount(int id, int i); 
}
