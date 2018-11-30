public class Main{
	public static void main(String[] agrs){
		try{
			Driver pedro = new Driver("Pedro","Smith","ff-1234");
			pedro.getGrossWage();
			pedro.setSalary(200.0);
			pedro.setNightHours(14);
			pedro.setFines(70.0);
			pedro.getDiscounts();
			pedro.calculateNetWage();
			System.out.println(pedro);
			System.out.println("Pedro grosswage is:"+pedro.getGrossWage());
			System.out.println("Pedro Wage is:"+pedro.calculateNetWage());
			System.out.println("Pedro Discount is:"+pedro.getDiscounts());
			
		}catch(Exception e){}
		
		System.out.println();
		
		try{
			Driver bino = new Driver("Bino","Adam","ff-13574");
			bino.getGrossWage();
			bino.setSalary(200.0);
			bino.setNightHours(17);
			bino.setFines(80.0);
			bino.getDiscounts();
			bino.calculateNetWage();
		
			System.out.println(bino);
			System.out.println("Bino grosswage is:"+bino.getGrossWage());
			System.out.println("Bino Wage is:"+bino.calculateNetWage());
		}catch(Exception e){}
		
		
	}
}