import java.util.*;
public class Main {
public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    in.close();
    for(int i=n-1;i>0;i--) {
        if(n%i==0) {
            if(i!=1) {
                System.out.println(i);
                break;
                }
            else
                System.out.println(n);
        } }
    }
}