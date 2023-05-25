
public class BurgerFactory {

	 public static Burger makeBurger(String newBurgerType){

		 Burger newBurger = null;

		 if (newBurgerType.equals("Кралски")){
			 return new KingBurger();

		 } else
			 if (newBurgerType.equals("Класически")){
				 return new ClassicBurger();
				 
		 } else
			 if (newBurgerType.equals("Вегетариански")){
				 return new VeggieBurger();
				 
			 } else return null;

}
}