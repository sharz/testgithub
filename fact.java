import java.util.*;
import java.io.*;
class  fact
{
	public static void main(String args[])
	{ 
		int n=5;
                int count=1,f=1;
		while(count<n)
		{
			f=f*n;
			n--;
		}
		System.out.println("Factorial is: "+f);
	}
}
