import java.text.SimpleDateFormat;  
import java.util.Date;  

public class Singleton {

    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void welcome(String token) {
    	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
    	Date date = new Date(); 
    	token=formatter.format(date);
        System.out.println(token);
        System.out.println("Welcome to our restaurant! " );
        System.out.println("What would you like to order: ");
    }

}
