package xyz;

public class Test 
{
	public static void main(String[] args) 
	{
		
		father s = new son(); //upcasting
		s.m1();
		s.m2();
		
		
		son s1 = (son)s; //down casting
		s1.m3();
		s1.m1(); // overrided method
		s1.m2();
		s1.m6();
		
		
	}
}

