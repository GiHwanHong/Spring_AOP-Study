package gihwan.spring.board.service;

import gihwan.spring.board.dao.ArticleDAO;
import gihwan.spring.board.vo.ArticleVO;

public class WriteArticleServiceImpl implements WriteArticleService {
	// Write 기능 수행
	private ArticleDAO articleDao;

	public WriteArticleServiceImpl() {
	}

	public WriteArticleServiceImpl(ArticleDAO articleDao) {
		this.articleDao = articleDao;
	}

	@Override
	public void write(ArticleVO article) {
		System.out.println("핵심로직 =====> WriteArticleServiceImpl.write() 메서드 실행");
		articleDao.insert(article);
	}
}