import java.util.*;
import java.io.*;
class  found
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the numbers:");
		int flag=0;
		int [] arr = new int[5];
    for(int i=0;i<5;i++)
		{
 			arr[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("Enter no. to be search: ");
		int search=Integer.parseInt(br.readLine());
		int fst=arr[0];
		int lst=arr[4];
		int mid=(fst+lst)/2;

		if(search==mid)
		{
			flag=1;
			System.out.println("Number found...");
		}
		else if(search<mid)
		{
			lst=(mid+1);
		}
		else
		{
			fst=(mid-1);
		}
		if(flag==0)
		{
			System.out.println("Number not found...");
		}
 }  
}
