public class Main
{
	public static void main(String[] args) {
	    String time="07:05:45PM";
	    String hour=time.substring(0,2);
	    int hr=Integer.parseInt(hour);
	    if(time.charAt(8)=='P') {
	        hr=hr+12;
	        time=time.replace(hour,Integer.toString(hr));
	    }
		System.out.println(time);
	}
}
