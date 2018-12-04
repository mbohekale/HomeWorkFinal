
import java.util.Date;
import java.text.SimpleDateFormat;
public class Main{
	public static void main(String[] args){
		try{
		DateItinerary d = new DateItinerary();
		System.out.println(d);
		}catch(Exception e){
			System.out.println(e);
		}
		
		try{
		DateItinerary d = new DateItinerary("20181112","1971");
		System.out.println(d);
		}catch(Exception e){
			System.out.println(e);
		}
		
		try{
			SimpleDateFormat myFormat = new SimpleDateFormat("yyyy/MM/dd");
		//SimpleDateFormat myFormat = new SimpleDateFormat("ddMMyyyy")
		//SimpleDateFormat myFormat = new SimpleDateFormat("dd/MM/yyyy")
		Date d1;
		Date goal;
		goal = myFormat.parse("1990/12/30");
		d1 = myFormat.parse("1990/12/30");
		
		DateItinerary di = new DateItinerary(d1,goal);
		System.out.println(di);
		}catch(Exception e){
			System.out.println(e);
		}
	}
}