package com.amrit.dummies.test;


public class Febonacci {
	
	public boolean isPresent(int num)
	{
		int a=0;
		int b=1;
		boolean present = false;
		
		for(int i=0; ;i++)
		{
			int temp = a+b;
			a=b;
			b=temp;
			
			if(num == 0)
			{
				present = true;
				break;
			}
			
			if(temp > num)
				break;
			else
			{
				if(temp == num)
				{
					present = true;
					break;
				}
			}
		}
		
		return present;
	}
	
//	public static void main(String args[])
//	{
//		System.out.print("Please enter the number : ");
//		Scanner in = new Scanner(System.in);
//		int num = in.nextInt();
//		
//		if(isPresent(num))
//			System.out.println("Present");
//		else
//			System.out.println("Not Present");
//	}

}
