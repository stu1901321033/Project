public class Ketchup extends ToppingDecorator {
	
	public Ketchup(Sauce newBurger) {
		super(newBurger);
	 }
	
	 public String getDescription(){
		 return tempBurger.getDescription() + " с кетчуп ";
	   }

	 public double getCost(){
		   System.out.println("Цена на кетчуп: " +"$"+.50);
		   return tempBurger.getCost() + .50;
	 }



}
