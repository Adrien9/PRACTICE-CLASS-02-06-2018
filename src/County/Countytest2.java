package County;
import java.util.Scanner;
public class Countytest2 {


public static void main(String[] args) {
	
	Scanner scanner=new Scanner(System.in);
	
	System.out.println("What is the name of the country?");
	scanner.nextLine();
	System.out.println("When was the country founded?");
	scanner.nextInt();
	System.out.println("What is the population of the country?");
	scanner.nextInt();
	System.out.println("What is the land volume of the country?");
	scanner.nextDouble();

	County County=new County(scanner.nextLine(),scanner.nextInt(), scanner.nextInt(), scanner.nextDouble() );

	System.out.println(County.name);
	System.out.println(County.year);
	System.out.println(County.population);
	System.out.println(County.volume);


}

}
