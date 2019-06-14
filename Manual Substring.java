import java.util.*;
public class Main{
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	String str1=in.next();
	String str2=in.next();
	in.close();
	char[] ch1=str1.toCharArray();
	char[] ch2=str2.toCharArray();
	int index=-1,flag=0;
	for(int i=0;i<ch1.length;i++) {
			if(ch1[i]==ch2[flag])  {
				flag++;
				if(flag==ch2.length)  {
				index=i-ch2.length+1;
				break;	}
			}
			else 
			   flag=0;
			
		}
	if(flag==ch2.length)
		System.out.println(index);
	else
		System.out.println(index);
		


	
}
}