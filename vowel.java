import java.util.*;
import java.io.*;
class  vowel
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("how many fibonacci");
 		int n=Integer.parseInt(br.readLine());
		int  f0=0,f1=1;
 		System.out.println(f0);
 		System.out.println(f1);
		int f=f0+f1;
		System.out.println(f);
		int counter=3;
		

		while(counter<n)
		{
			f0=f1;
			f1=f;
			f=f0+f1;
			System.out.println(f);
			counter++;
		
		}
	}
}
