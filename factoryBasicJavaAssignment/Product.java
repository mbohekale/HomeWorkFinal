public class Product{
		String describe;
		long barcode;
		String serialnumber;
		ArrayList<GoldenTicket> prizeticket;
	public Product(String decribe,long barcode,String serialnumber){
		this.decribe=decribe;
		this.barcode=barcode;
		this.serialnumber=serialnumber;
		prizeticket= new ArrayList<>();
	}
}