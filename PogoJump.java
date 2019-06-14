/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{   static boolean PogoJumpToEnd(int[] arr,int n) {
    int flag=0;
    for(int i=0;i<n-1;) {
        if(arr[i]!=0) {
            i+=arr[i];
        }
        else  {
            flag=1;
            break;
        }
    }
    if(flag!=1)
        return true;
    else
        return false;
}
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    int n=in.nextInt();
	    int[] arr=new int[n];
	    for(int i=0;i<n;i++)
	        arr[i]=in.nextInt();
		System.out.println(PogoJumpToEnd(arr,n));
	}
}
