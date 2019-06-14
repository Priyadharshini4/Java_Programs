public class Main
{   static int MaxValue(String str) {
        char[] ch=str.toCharArray();
        String num="";
        int n=0,max=0,flag=0;
        for(int i=0;i<ch.length;i++) {
            if(Character.isDigit(ch[i])) {
    
                num=num+Character.toString(ch[i]);
                flag=1;
            }
            else if(flag!=0){
                if(!num.contains("9")) {
                   n=Integer.parseInt(num);
                    if(max<n)
                        max=n; }
                         
               num="";
              flag=0;
            } }
          if(!num.isEmpty() && !num.contains("9")) {
                   n=Integer.parseInt(num);
                    if(max<n)
                        max=n; }
        if(max==0)
        return -1;
        else
        return max;

}    public static void main(String[] args) {
        String str="This is alpha 50509 and 17";
        System.out.println(MaxValue(str));
    }
}