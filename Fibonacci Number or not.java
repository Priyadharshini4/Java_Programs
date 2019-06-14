import java.util.*;
import java.lang.Math;
public class Main {
    
    static boolean isPerfectSquare(int x){
        int square=(int)Math.sqrt(x);
        if(square*square==x)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        in.close();
        if(isPerfectSquare(5*n*n+4) || isPerfectSquare(5*n*n-4))
               System.out.println("Yes");
                    
        else
                 System.out.println("No");
        }
}