package model;
public class Kid{
	private String name;
	private String birthday;
	private String placeOfbirth;
	private String code;
	List<Product> purchaseProduct;
	public kid(String name,String birthday,String placeOfbirth,String code){
		this.name=name;
		this.birthday=birthday;
		this.placeOfbirth = placeOfbirth;
		this.code=code;
	}
	public String getName(){
		return name;
	}
	public String getPlaceOfBirth(){
		return placeOfbirth;
	}
	public void setPlaceOfbirth(String placeOfbirth){
		this.placeOfbirth=placeOfbirth;
	}
	
	@Override
	public String tostring(){
		return ""+"\n placeOfbirth: "+placeOfbirth
		+"\n Name:"+ name
		+"\n Birthofday:"+ birthday;
	}
}