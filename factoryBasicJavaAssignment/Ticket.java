public class Ticket{
	private int number;
	private String type;
	public Ticket(int number,String type){
		this.number=number;
		this.type=type;
	}
	public int getNumber(){
		return number;
	}
	public String getType(){
		return type;
	}
	public void setNumber(int number){
		this.number=number;
	}
	public void setType(String type)
	{
		this.type=type;
	}
	@Override
	public String toString(){
		return""+number+type;
	}
	

}