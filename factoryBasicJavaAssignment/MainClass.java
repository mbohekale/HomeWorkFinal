import java.io.File;
import java.io.FileReader;
import java.io.LineNumberReader;
import java.util.Date;
import java.text.SimpleDateFormat;
public class MainClass{
	public static void main(String[] args) throws Exception{
		try{
		
		 SimpleDateFormat myFormat = new SimpleDateFormat("yyyy/MM/dd");
		 Date raffled;
		raffled = myFormat.parse("2018/11/15");
		System.out.println(myFormat.format(raffled));
		}catch(Exception e){
			System.out.println(e);
		}	
		
		try{
			int lineNumber=0;
			System.out.println("Hello OompaLoompaSong");
			OompaLoompaSong ols = new OompaLoompaSong(lineNumber);
			File file = new File("OompaLoompaSong.txt");
			if(file.exists()){
				FileReader fr = new FileReader(file);
				LineNumberReader lr = new LineNumberReader(fr);
				int lineNumberCount = 0;
				while(lr.readLine()!=null){
					lineNumberCount++;
				}
				System.out.println("numbers of lines: "+ lineNumberCount);
			}
			ols.sing();
			
		}catch(Exception e){
			System.out.println(e);
		}
		
		
		try{
			System.out.println("Hello GoldenTicket");
			
		
		SimpleDateFormat myFormat = new SimpleDateFormat("yyyy/MM/dd");
		//SimpleDateFormat myFormat = new SimpleDateFormat("yyyyMMdd");
		//SimpleDateFormat myFormat = new SimpleDateFormat("dd/MM/yy");
		Date raffled;
		
		raffled = myFormat.parse("2015/05/05");
			GoldenTicket gt = new GoldenTicket("1234",raffled);
			gt.setRaffled(raffled);
			System.out.println("Raffled date is: " + myFormat.format(raffled));
		}catch(Exception e){
			System.out.println(e);
		}
		
		try{
			int option =0;
			Controller cr = new Controller();
			Scanner sc = new Scanner(System.in);
			do{
				System.out.println("Select from list: "
				+"\n 1- Add \n 2- Remove: \n 3- Sorted List"
				+"0- exit" );
			option = scanner.nextInt();
			switch(option){
				case 1:
					c.addStudent();
					break;
					
				case 2:
					
					break;
				case 3:
					
					break;				
				case 0:				
					break;
				default:
					System.out.println("wrong option");
			}
			}while(option!=0);
	
		}catch(Exception e){
			System.out.println(e);
		}
		
	
	
	}

}