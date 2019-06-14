import java.util.*;
public class Main {
static void PrintPattern(int m,int n,boolean flag) {
    System.out.print(m + " ");
    if(flag==false&&n==m)
        return;
    if(flag) {
        if(m-5>0) 
            PrintPattern(m-5,n,true);
        else
            PrintPattern(m-5,n,false);
    }
    else
        PrintPattern(m+5,n,false);
    }
public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    in.close();
    PrintPattern(n,n,true);
}
}
