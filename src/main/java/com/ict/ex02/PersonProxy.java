package com.ict.ex02;

public class PersonProxy
{
	private Person person;
	private Before before;
	private After after;
	
	
	public Person getPerson() 
	{
		return person;
	}


	public void setPerson(Person person) 
	{
		this.person = person;
	}

	public Before getBefore() 
	{
		return before;
	}

	public void doPlay() 
	{
		try 
		{
			before.pre(); // 공통기능
			// 스레드 처리를 하기 위해서 강제로 만듦
			// int result = 15/0;
			person.doSmoting(); // 핵심 관심
			after.next(); // 공통관심
		} catch (Exception e) 
		{
			System.out.println("부모님이 오셨다.");
		}finally
		{
			System.out.println("공부를 한다.");
		}
		
	}
	
	
	// getter/ setter
	public void setBefore(Before before) 
	{
		this.before = before;
	}


	public After getAfter() 
	{
		return after;
	}


	public void setAfter(After after) 
	{
		this.after = after;
	}


}
