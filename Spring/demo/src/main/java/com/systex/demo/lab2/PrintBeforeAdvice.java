package com.systex.demo.lab2;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PrintBeforeAdvice {

//	@Before("execution(* com.systex.demo.model.Product.*(..))")
//	@Before("com.systex.demo.lab2.CommondPointcut.abc()")
//	public void before(JoinPoint joinPoint) {
//		System.out.println("this is a print before advice massage" + 
//				joinPoint.getSignature().getDeclaringTypeName() + ", " +
//				joinPoint.getSignature().getName());
//	}
//	
	
//	@Around("target(com.systex.demo.model.Product)")
//	@Around("with(com.systex.demo.model.Product)")
	@Around("com.systex.demo.lab2.CommondPointcut.abc()")
	public Object before(ProceedingJoinPoint joinPoint) {
		long start = System.nanoTime();
		Object obj = null;
		System.out.println("this is a print before advice massage" + 
				joinPoint.getSignature().getDeclaringTypeName() + ", " +
				joinPoint.getSignature().getName());
		try {
			obj = joinPoint.proceed();
		}
		catch (Throwable e) {
			e.printStackTrace();
		}
		long end = System.nanoTime();
		System.out.println("Total Process Time = " + (end-start) + " ns.");
		return obj;
		
	}
}
