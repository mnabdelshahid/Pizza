
public class PizzaOrder extends Pizza {
	
	Pizza pizza1;
	Pizza pizza2;
	Pizza pizza3;
	int NumPizzas;
	
	PizzaOrder(){
		
	}
	
	PizzaOrder(Pizza p1,Pizza p2,Pizza p3,int np){
		this.pizza1=p1;
		this.pizza2=p2;
		this.pizza3=p3;
		this.NumPizzas=np;
	}
	
	PizzaOrder(PizzaOrder po){
		//this(po.pizza1,po.pizza2,po.pizza3,po.NumPizzas);
		if(po.pizza1!=null)
		this.pizza1=new Pizza(po.getPizza1().getPizzaSize(),po.getPizza1().getNumberOfCheeseToppings(),po.getPizza1().getNumberOfPepperoniToppings(),po.getPizza1().getNumberOfHamToppings());
		if(po.pizza2!=null)
		this.pizza2=new Pizza(po.getPizza2().getPizzaSize(),po.getPizza2().getNumberOfCheeseToppings(),po.getPizza2().getNumberOfPepperoniToppings(),po.getPizza2().getNumberOfHamToppings());
		if(po.pizza3!=null)
		this.pizza3=new Pizza(po.getPizza3().getPizzaSize(),po.getPizza3().getNumberOfCheeseToppings(),po.getPizza3().getNumberOfPepperoniToppings(),po.getPizza3().getNumberOfHamToppings());
		this.NumPizzas=po.NumPizzas;
	}
	
	public Pizza getPizza1() {
		return pizza1;
	}

	public void setPizza1(Pizza pizza1) {
		this.pizza1 = pizza1;
	}

	public Pizza getPizza2() {
		return pizza2;
	}

	public void setPizza2(Pizza pizza2) {
		this.pizza2 = pizza2;
	}

	public Pizza getPizza3() {
		return pizza3;
	}

	public void setPizza3(Pizza pizza3) {
		this.pizza3 = pizza3;
	}

	public int getNumPizzas() {
		return NumPizzas;
	}

	public void setNumPizzas(int numPizzas) {
		NumPizzas = numPizzas;
	}

	
	
	public double calcTotal() {
			double temp=0;
			int i;
			for(i=0;i<3;i++) {
				if(i==0 && this.pizza1!=null)
					temp=temp+this.pizza1.calcCost();
				
				else if(i==1 && this.pizza2!=null)
					temp=temp+this.pizza2.calcCost();
				
				else if(i==2 && this.pizza3!=null)
					temp=temp+this.pizza3.calcCost();
				
				
			}
		
//			return (this.pizza1.calcCost() + this.pizza2.calcCost() + this.pizza );
//		
			return temp;
		
	}
	
}
