/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
import java.io.*;
import java.lang.*;
public class Main
{
    public static void activitySelection(int start[],int finish[],int len)
    {
        int i,j;
        System.out.println("selected activity:");
         i=0;
        System.out.println(i+" ");
        for( j=1;j<len;j++)
        {
            if(start[j]>=finish[i])
            {
                System.out.println(j+" ");
                i=j;
            }
            
        }
    }
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	int start[] = new int[n];
	int finish[] = new int[n];
	for(int i=0;i<n;i++)
	{
	    start[i]=scan.nextInt();
	}
	for(int j=0;j<n;j++)
	{
	    finish[j]=scan.nextInt();
	}
	int len = start.length;
	activitySelection(start,finish,len);
	}
}
