import  java.util.*;
import java.util.ArrayList;
public class Main {
	  static int i = 0;
	  static String details = "";
 public static void main(String[] args) {
	 
		 List<String> quotes = new ArrayList<>();
			
		 quotes.add("“We cannot solve problems with the kind of thinking we employed when we came up with them.” — Albert Einstein");
			quotes.add("“Learn as if you will live forever, live like you will die tomorrow.” — Mahatma Gandhi");
			quotes.add("“Stay away from those people who try to disparage your ambitions. Small minds will always do that, but great minds will give you a feeling that you can become great too.” — Mark Twain");
			quotes.add("“When you give joy to other people, you get more joy in return. You should give a good thought to happiness that you can give out.”— Eleanor Roosevelt");
			quotes.add("“When you change your thoughts, remember to also change your world.”—Norman Vincent Peale");
			quotes.add("“It is only when we take chances, when our lives improve. The initial and the most difficult risk that we need to take is to become honest. —Walter Anderson");
			quotes.add("“Nature has given us all the pieces required to achieve exceptional wellness and health, but has left it to us to put these pieces together.”—Diane McLaren");
			quotes.add("“Success is not final; failure is not fatal: It is the courage to continue that counts.” — Winston S. Churchill");
			quotes.add("“It is better to fail in originality than to succeed in imitation.” — Herman Melville");
			quotes.add("“The road to success and the road to failure are almost exactly the same.” — Colin R. Davis");
			quotes.add("“Success usually comes to those who are too busy looking for it.” — Henry David Thoreau");
			quotes.add("“People who fail never try. You have to get it wrong to get it right.” — Steve Harvey");
			quotes.add("“Develop success from failures. Discouragement and failure are two of the surest stepping stones to success.” —Dale Carnegie");
			quotes.add("“Nothing in the world can take the place of Persistence. Talent will not; nothing is more common than unsuccessful men with talent. Genius will not; unrewarded genius is almost a proverb. Education will not; the world is full of educated derelicts. The slogan 'Press On' has solved and always will solve the problems of the human race.” Calvin Coolidge");
			quotes.add("“There are three ways to ultimate success: The first way is to be kind. The second way is to be kind. The third way is to be kind.” —Mister Rogers");
			quotes.add("“Don't Let Your Failure Define Who You Are.” ― Henry Crownny");
			quotes.add("“Success is peace of mind, which is a direct result of self-satisfaction in knowing you made the effort to become the best of which you are capable.” —John Wooden");
			quotes.add("“I never dreamed about success. I worked for it.” —Estée Lauder");
			quotes.add("“Success is getting what you want, happiness is wanting what you get.” ―W. P. Kinsella");
			quotes.add("“The pessimist sees difficulty in every opportunity. The optimist sees opportunity in every difficulty.” — Winston Churchill");
			quotes.add("“Don’t let yesterday take up too much of today.” — Will Rogers");
			quotes.add("“You learn more from failure than from success. Don’t let it stop you. Failure builds character.” — Unknown");
			quotes.add("“If you are working on something that you really care about, you don’t have to be pushed. The vision pulls you.” — Steve Jobs");
			quotes.add("“Experience is a hard teacher because she gives the test first, the lesson afterwards.” ―Vernon Sanders Law");
			quotes.add("“To know how much there is to know is the beginning of learning to live.” —Dorothy West");
			quotes.add("“Goal setting is the secret to a compelling future.” — Tony Robbins");
      
		    
	  
	  	Scanner sc = new Scanner(System.in);
			System.out.println("Welcome To Henry Random Quotes Generator");
			System.out.println("Enter Your Name:");
			String scr = sc.next();
			System.out.println("Welcome "+scr);
			for(i= 1; i <=  4; i++) {
				System.out.println("Enter: \n1. To Add Quotes \n2. To Remove Quotes \n3. To Display Quotes Randomly \n4. To Print All Quotes");	
				int num = sc.nextInt();
			
				if(num == 1) {
					System.out.println("Enter Quotes To Add Quotes To List:");
					String rear = sc.next();
					if(!rear.equals(null)) {
						quotes.add(rear);
						System.out.println("Quote Successfully Added To Quotes List");
					}
				}
				else if(num == 2) {
				  remove(sc,quotes);
			   }
				else if(num == 3) {
				new PrintsQuotes(quotes);
			} else if(num == 4) {
				new PrintAll(quotes);
				}
		if(i == 4) {
				}
		    }
			System.out.println("Thanks For Viewing Our Random Quotes Generator!");
			 sc.close();
			}		
public static void remove(Scanner sc, List<String> quotes) {
					System.out.println("Enter Quote To Remove From Quotes To List:");
					String read = sc.next();
					if(found(read,quotes)) {
					quotes.remove(read);
					System.out.println("Quote Successfully Removed From Quotes List");         
			  }
		       else {
		 System.out.println("Quotes: "+read+ " not found in quotes list");
		   }
			}   
public static boolean found(String det,List<String> quotes) {
   for(int i = 0; i < quotes.size(); i++) {
	if(det.equals(quotes.get(i))) {
			return true;
		
	   	}
			else {
			 }
			}
			return false;
			}
	}
