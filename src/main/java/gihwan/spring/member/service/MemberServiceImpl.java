package gihwan.spring.member.service;

import gihwan.spring.board.vo.UpdateInfo;
import gihwan.spring.member.vo.MemberVO;

public class MemberServiceImpl implements MemberService {

	// 원래는 MemberDAO를 주입한다.
	@Override
	public void regist(MemberVO member) {
		System.out.println("핵심로직 =====> MemberServiceImpl.regist() 메서드 실행");
		// MemberDAO 해당기능을 처리해줄 메서드를 호출한다.
	}

	@Override
	public boolean update(String memberId, UpdateInfo info) {
		System.out.println("핵심로직 =====> MemberServiceImpl.update() 메서드 실행");
		return true;
	}

}
