import java.util.*;
import java.io.*;
import java.lang.*;
public class Main
{
    public static void EgyptionFraction(int nr, int dr)
    {
        if(nr==0 1|| dr==0)
        {
            return;
        }
        if(dr%nr==0)
        {
            System.out.println("1/"+dr/nr);
        }
        if(nr%dr==0)
        {
            System.out.println(nr/dr);
            return;
        }
        if(nr>dr)
        {
            System.out.println(nr/dr+" ");
            EgyptionFraction(nr%dr,dr);
        }
        int a = dr/nr+1;
        System.out.println("1/"+n+"+");
        EgyptionFraction(nr*a-dr,dr*a);


    }
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int nr = scan.nextInt();
	    int dr = scan.nextInt();
	   EgyptionFraction(nr,dr); 
		
	}
}
