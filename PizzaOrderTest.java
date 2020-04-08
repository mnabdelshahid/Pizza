
public class PizzaOrderTest {
	public static void main(String atgs[]) {
		Pizza p1=new Pizza("Large",1,0,1);
		Pizza p2=new Pizza("Medium",2,2,0);
		Pizza p3=new Pizza("Small",1,1,1);
		PizzaOrder order1=new PizzaOrder();
		order1.setNumPizzas(3);
		order1.setPizza1(p1);
		order1.setPizza2(p2);
		order1.setPizza3(p3);
		double total=order1.calcTotal();
		System.out.println(total);
		PizzaOrder order2=new PizzaOrder(order1);
		order2.getPizza1().setNumberOfCheeseToppings(3);
		total=order2.calcTotal();
		System.out.println(total);
		double origTotal=order1.calcTotal();
		System.out.println(origTotal);
		
		
	}
}
