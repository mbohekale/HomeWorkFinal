import java.util.Scanner;
import model.Factory;
import model.Kid;
import model.OompaLoompa;
public class Controller{
	Scanner scan = new Scanner(System.in);
	Factory factory;
	public Controller(){
		factory = new Factory();
	}
	public void addKid(){
		System.out.println("Inform the kid's name");
		String name = scanner.next();
		
		System.out.println("Inform the kid's birthday");
		String name = scanner.next();
		
		System.out.println("Inform the kid's placeOfbirth");
		String name = scanner.next();
		
		System.out.println("Inform the kid's code");
		String name = scanner.next();
		
		Kid k = new Kid(name,birthday,placeOfbirth,code);
		factory.addKid(k);
		
		
		
		
	}

}