import java.util.ArrayList;
public class Factory{
	ArrayList<Kid> kids;
	ArrayList<OompaLoompa > OompaLoompas;
	
	public Factory(){
		kids = new ArrayList<Kid>();
		OompaLoompas = new ArrayList<OompaLoompa>();
	}
	public void addKid(Kid k){
		kids.add(k);
	}
	public void addOompaLoompa(OompaLoompa o){
		OompaLoompas.add(o);
	}
}