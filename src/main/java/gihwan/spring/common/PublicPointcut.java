package gihwan.spring.common;

import org.aspectj.lang.annotation.Pointcut;

public class PublicPointcut {
	@Pointcut("execution(public * gihwan.spring..*(..))")
	public void publicMethod() {
	}
}
