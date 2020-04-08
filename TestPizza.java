
public class TestPizza {
	public static void main(String args[]) {
		
		
		Pizza p=new Pizza("Large",1,1,2);
		if(p.calcCost() == 0) {
			System.out.println("You entered a wrong size");
			
		}
		
		else {
			System.out.println(p.getDescription());
			
		}
	}
}
