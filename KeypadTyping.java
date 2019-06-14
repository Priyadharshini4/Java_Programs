/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    String str="vacquiz";
	    String str2="";
	    char[] ch=str.toCharArray();
	    for(int i=0;i<str.length();i++) {
	        if("abc".contains(Character.toString(ch[i])))
	                   str2+=2;
	        if("def".contains(Character.toString(ch[i])))
	                   str2+=3;
	        if("ghi".contains(Character.toString(ch[i])))
	                   str2+=4;
	         if("jkl".contains(Character.toString(ch[i])))
	                   str2+=5;
	        if("mno".contains(Character.toString(ch[i])))
	                   str2+=6;
	        if("pqrs".contains(Character.toString(ch[i])))
	                   str2+=7;    
	        if("tuv".contains(Character.toString(ch[i])))
	                   str2+=8;    
	        if("wxyz".contains(Character.toString(ch[i])))
	                   str2+=9;               
	    }
		System.out.println(str2);
	}
}
