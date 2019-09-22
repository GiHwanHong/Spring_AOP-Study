package gihwan.spring.board.service;

import gihwan.spring.board.vo.ArticleNotFoundException;
import gihwan.spring.board.vo.ArticleVO;

public interface ReadArticleService {
	ArticleVO getArticleAndIncreaseReadCount(int id) throws ArticleNotFoundException;
}