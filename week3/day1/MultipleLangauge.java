package Assignments.week3.day1;

public abstract class MultipleLangauge implements TestTool,Language{

	public void python() 
	{
		System.out.println("Python derived from abstract class");
	}
	public void ruby() 
	{
		System.out.println("Ruby derived from abstract class");
	}
}
