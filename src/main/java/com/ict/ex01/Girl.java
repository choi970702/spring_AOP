package com.ict.ex01;

public class Girl implements Person
{
	// 소녀
	// 컴퓨터를 부팅한다.(공통관심)
	// 컴퓨터로 쇼핑을 한다.(핵심관심)
	// 컴퓨터로 드라마보기를 한다.(핵심관심)
	// 컴퓨터를 종료한다.(공통관심)
	@Override
	public void doSmoting() 
	{
		System.out.println("컴퓨터로 쇼핑을 한다.");
		System.out.println("========================");
		System.out.println("컴퓨터로 드라마보기를 한다.");
		
	}
}
