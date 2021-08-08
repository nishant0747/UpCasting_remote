package xyz;

public class primitive_casting 
{
	
	public static void main(String[] args) 
	{
		
		int a = 287;
		
		long b = a;       // widening with implicit way
		System.out.println(b);
		
		long c =(long)a;   //widening with explicit way
		System.out.println(c);
		
		float g = 300.234f;
		
		System.out.println(g);
		
		int f = (int)g;     //explicit casting
		
		System.out.println(f);
		
		
	}

}
