package gihwan.spring.common;

import org.aspectj.lang.JoinPoint;

import gihwan.spring.board.vo.UpdateInfo;

public class UpdateMemberInfoTraceAdvice {
	public void traceReturn(JoinPoint joinPoint, boolean result, String memberId, UpdateInfo info) {
		System.out.println("[TraceAdvice] 정보 수정: 결과=" + result + ",대상회원=" + memberId + ",수정정보=" + info);
	}
}