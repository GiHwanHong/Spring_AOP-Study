package gihwan.spring.board.service;

import gihwan.spring.board.vo.ArticleVO;

public interface WriteArticleService {
	// 게시판에 글쓰기 서비스를 제공할 WriteArticleService 인터페이스 작성
	void write(ArticleVO article);
}
