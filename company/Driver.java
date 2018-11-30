public  class Driver extends Person implements PaymentCheck{
	private String driverLicences;
	private double salary;
	private double fines;
	private int nightHours;
	public Driver(String name, String familyName,String licenceno){
		super(name,familyName);
	}
	public double getFines(){
		return fines;
	}
	public void setFines(double fines){
		this.fines=fines;
	}
	public double getSalary(){
		return salary;
	}
	public void setSalary(double salary){
		this.salary=salary;
	}
	public int getNightHours(){
		return nightHours;
	}
	public void setNightHours(int nightHours){
		this.nightHours=nightHours;
	}
	public void setAdditionalNightHours(int hours){
		nightHours = hours;
	}
	public void setGottenFines(double fines){
		this.fines =fines;
	}
	
	public double getGrossWage(){
		return salary + (nightHours*40);
	}

	public String getDiscounts(){
		return "Fine :" + fines;
	}

	public double calculateNetWage(){
		return getGrossWage()-fines;
		
	}
	
}