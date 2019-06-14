
import java.util.*;
public class ValidParenthesis
{   static boolean ValidParenthesis(String str) {
        int open=0,close=0,star=0,count=0;
        char[] ch=str.toCharArray();
        if(ch[0]==')' || ch[ch.length-1]=='(') 
            count=1;
        if(count!=1) {
        for(int i=0;i<ch.length;i++) {
            if(ch[i]=='(')
                open++;
            else if(ch[i]==')')
                close++; 
            else if(ch[i]=='*')
                star++;
        } }
         if(count!=1) {
             if(open==close)
                return true;
            else if(open+star==close)
                return true;
            else if(open==close+star)
                return true;
            else
                return false;
         }
         else
            return false;
        }
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    String str=in.next();
	    in.close();
		System.out.println(ValidParenthesis(str));
	}
}
