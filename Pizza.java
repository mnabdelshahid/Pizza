
public class Pizza {
	private String pizzaSize;
	private int numberOfCheeseToppings;
	private int numberOfPepperoniToppings;
	private int numberOfHamToppings;
	
	Pizza(){
		
	}
	
	Pizza(String p,int n1,int n2,int n3){
		this.pizzaSize=p;
		this.numberOfCheeseToppings=n1;
		this.numberOfPepperoniToppings=n2;
		this.numberOfHamToppings=n3;
	}

	public String getPizzaSize() {
		return pizzaSize;
	}

	public void setPizzaSize(String pizzaSize) {
		this.pizzaSize = pizzaSize;
	}

	public int getNumberOfCheeseToppings() {
		return numberOfCheeseToppings;
	}

	public void setNumberOfCheeseToppings(int numberOfCheeseToppings) {
		this.numberOfCheeseToppings = numberOfCheeseToppings;
	}

	public int getNumberOfPepperoniToppings() {
		return numberOfPepperoniToppings;
	}

	public void setNumberOfPepperoniToppings(int numberOfPepperoniToppings) {
		this.numberOfPepperoniToppings = numberOfPepperoniToppings;
	}

	public int getNumberOfHamToppings() {
		return numberOfHamToppings;
	}

	public void setNumberOfHamToppings(int numberOfHamToppings) {
		this.numberOfHamToppings = numberOfHamToppings;
	}
	
	public double calcCost() {
		if(this.pizzaSize.toLowerCase().equals("small")) {
			 return 10 + (2*(this.numberOfCheeseToppings+this.numberOfHamToppings+this.numberOfPepperoniToppings));
		}
		
		else if(this.pizzaSize.toLowerCase().equals("medium")) {
			 return 12 + (2*(this.numberOfCheeseToppings+this.numberOfHamToppings+this.numberOfPepperoniToppings));
		}
		
		else if(this.pizzaSize.toLowerCase().equals("large")) {
			 return 14 + (2*(this.numberOfCheeseToppings+this.numberOfHamToppings+this.numberOfPepperoniToppings));
		}
		
		else return 0;
	}
	
	public String getDescription() {
		return "Pizza size is : " + this.pizzaSize + ", Number of cheese toppings is : " + this.numberOfCheeseToppings + ", Number of Pepperoni toppings is : " + this.numberOfPepperoniToppings + ", Number of ham toppings is : " + this.numberOfHamToppings + ", Total cost of pizza is : $" + this.calcCost();
	}
}


	

