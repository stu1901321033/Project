
public abstract class Burger {
	
	private String name;
	 public String getName() { return name; }
	 public void setName(String newName) { name = newName; }

	 public void displayBurger(){
		 System.out.println( "Вие избрахте " + getName() );
	 }
	 
	 public void OrderBurger(){
		 System.out.println( "Поръчката ви е " + getName() );
	 }
}
