public class Kids extends Person implements MyKids{
	String placeOfbirth;
	String code;
	List<Product> purchaseProduct;
	public kids(String name,Date birthday,String placeOfbirth,String code){
		super(name,birthday)
		this.placeOfbirth = placeOfbirth;
		this.code=code;
	}
	public String getPlaceOfBirth(){
		return placeOfbirth;
	}
	public void setPlaceOfbirth(String placeOfbirth){
		this.placeOfbirth=placeOfbirth;
	}
	
	@Override
	public String tostring(){
		return super.tostring()
		+"\n placeOfbirth: "+placeOfbirth;
	}
}