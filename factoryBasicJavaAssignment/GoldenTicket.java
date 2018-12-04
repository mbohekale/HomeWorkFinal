import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.List;
public class GoldenTicket {	
	private String code;
	private Date raffled;
	//Emptry constractor
	public GoldenTicket (){}
	//constractor with attributes
	public GoldenTicket(String code,Date raffled){
		SimpleDateFormat my_format = new SimpleDateFormat("yyyyMMdd");
		this.code = code;
		this.raffled = new Date();
	}
	public Date getRaffled(){
		return raffled;
	}
	public void setRaffled(Date raffled){
		SimpleDateFormat my_format = new SimpleDateFormat("yyyyMMdd");
		String srt = my_format.format(raffled);
	}
	
	public String getCode(){
		return code;
	}
	public void setCode(String code){
		this.code=code;
	}
	
	@Override
	public String toString(){
		return  code +"\n"+ raffled.toString() ;
	}
	public boolean isRaffled(){
		return true;
	}
}