import java.util.*;
public class Main {
public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x=3;
        int l=100;
        int u=250;
        in.close();
        int count=0;
        for(int i=l+1;i<u;i++) {
            int n=i;
            while(n>0) {
                if(n%10==x) 
                    count++;
                n=n/10;
            }
        }
        System.out.println(count);
}
}