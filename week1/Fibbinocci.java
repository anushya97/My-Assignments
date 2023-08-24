package Assignments.week1;

public class Fibbinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int firstNum=0;
int sum=0;
int secnum=1;

System.out.println(firstNum);
System.out.println(secnum);
for(int i=1;i<=11;i++)
{
	sum=firstNum+secnum;
	firstNum=secnum;
secnum = sum;
System.out.println(sum);
}

	}

}
