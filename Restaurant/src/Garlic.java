public class Garlic extends ToppingDecorator {
	
	public Garlic(Sauce newBurger) {
		super(newBurger);
		System.out.println("Добавяне на сос: ");
	 }
	
	 public String getDescription(){
		 return tempBurger.getDescription() + " с чеснов сос ";
	   }

	 public double getCost(){
		   System.out.println("Цена на чеснов сос: " + "$"+.50);
		   return tempBurger.getCost() + .50;
	 }



}
