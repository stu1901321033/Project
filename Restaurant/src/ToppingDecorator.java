
abstract class ToppingDecorator implements Sauce {
	
	 protected Sauce tempBurger;
	 
	 public ToppingDecorator(Sauce newBurger){
		 tempBurger = newBurger;
	 }
	  public String getDescription() {
		  return tempBurger.getDescription();
	  }
	  public double getCost() {
		  return tempBurger.getCost();
	  }


}
