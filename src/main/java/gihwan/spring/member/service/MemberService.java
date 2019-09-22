package gihwan.spring.member.service;

import gihwan.spring.board.vo.UpdateInfo;
import gihwan.spring.member.vo.MemberVO;

public interface MemberService {
	// 회원관리 서비스를 제공
	void regist(MemberVO member);
	boolean update(String memberId, UpdateInfo info);
}
