import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Singleton Welcome = Singleton.getInstance();
        Welcome.welcome("");
        
        BurgerFactory burgerFactory = new BurgerFactory();
        Burger theBurger = null;
        
        
        Scanner userInput = new Scanner(System.in);
        System.out.println("Какъв бургер бихте искали ? (Кралски / Класически / Вегетариански)");
        while (theBurger == null)
        {
        	
        if (userInput.hasNextLine()){
        	
        	String typeOfBurger = userInput.nextLine();
        	theBurger = BurgerFactory.makeBurger(typeOfBurger);
        	if(theBurger == null) {System.out.println("Моля изберете един от следните бургери( Кралски / Класически / Вегетариански)");}
        }
        }
        if(theBurger != null){
        	 doBurger(theBurger);
        }
        boolean yes = false;
        while(yes == false) {
        System.out.println("Бихте ли искали някакъв сос към него ? ( Да / Не ) ");
        String yesno = userInput.nextLine();
        
        
        if(yesno.matches(".*Да.*")) {
        System.out.println("Какъв сос бихте искали ? ( Чеснов сос / Кетчуп ) ");
        String typeOfTopping = userInput.nextLine();
        yes= true;
               	
        if(typeOfTopping.matches(".*Кетчуп.*")) {
        Sauce basicBurgerKetchup = new Ketchup(new PlainBurger());
        System.out.println("Поръчка: " + basicBurgerKetchup.getDescription());
        System.out.println("Обща цена: " + basicBurgerKetchup.getCost());
        
        if(typeOfTopping.matches(".*Чеснов сос.*")) {
            Sauce basicBurgerGarlic = new Ketchup(new PlainBurger());
            System.out.println("Поръчка: " + basicBurgerGarlic.getDescription());
            System.out.println("Обща цена: " + "$"+basicBurgerGarlic.getCost());        	
        	}
        }
        }
        else if (yesno.matches(".*Не.*")) {
        	 OrderBurger(theBurger);
        	 System.out.print("Цена: $4.00");
        	 yes= true;
        }
    
    }
    }
    
    public static void doBurger(Burger aBurger){
    	aBurger.displayBurger();
    }
    	
    	 public static void OrderBurger(Burger aBurger){
    	    	aBurger.OrderBurger();

    }

    
}
