package gihwan.spring.board.controller;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import gihwan.spring.board.service.WriteArticleService;
import gihwan.spring.board.vo.ArticleVO;
import gihwan.spring.member.service.MemberService;
import gihwan.spring.member.vo.MemberVO;

public class MainThree {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] configLocations = new String[] { "applicationContextThree.xml" };
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(configLocations);
		WriteArticleService articleService = (WriteArticleService) context.getBean("writeArticleService");
		articleService.write(new ArticleVO());
		MemberService memberService = context.getBean("memberService", MemberService.class);
		memberService.regist(new MemberVO());
		context.close();
	}
}