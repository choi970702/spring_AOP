package com.ict.ex04;

import org.springframework.stereotype.Component;

@Component("girl")
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
		try 
		{
			System.out.println("컴퓨터로 쇼핑을 한다.");
			System.out.println("========================");
			// int resutl = 15/0;
			System.out.println("컴퓨터로 드라마보기를 한다.");
			
		} catch (Exception e) 
		{
			// return
		}
		
	}
	
	@Override
	public void play() 
	{
		System.out.println("도서관으로 나갑니다.");
		
	}
}
