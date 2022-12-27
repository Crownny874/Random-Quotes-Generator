import  java.util.*;
public class PrintsQuotes {
	PrintsQuotes(List<String> quotes) {
	Random r = new Random();
			String quote = quotes.get(r.nextInt(quotes.size()));
			System.out.println("Quotes:\n"+quote);
	}
}