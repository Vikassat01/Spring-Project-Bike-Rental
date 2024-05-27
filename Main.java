package springSatvik;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SuppressWarnings("unused")
class key {
public void run(Engine key) {
	key.start();
}
//public void run(Car key) {
//	key.start();
//}
}

public class Main{
	public static void main(String[] args) {
//		new key().run(new Bike());
//		new key().run(new Car());
		ApplicationContext ac = new support.ClassPathXmlApplicationContext("beans.xml");
		
		Engine key= (Engine)(( Car) ac).getBean("engine");
				new key().run(key);
			
	}
} 