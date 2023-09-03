package Assignments.week3.day1;

import week3.day1.Samsung;

public class Automation extends MultipleLangauge {


	@Override
	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("Selenium");
	}

	@Override
	public void Java() {
		// TODO Auto-generated method stub
		System.out.println("Java");
	}
	public static void main (String[] args) {
		// TODO Auto-generated method stub
        Automation a = new Automation();
       a.python();
       a.Java();
       a.ruby();
       a.Selenium();
		
	}
}
