package County;
import java.util.Scanner;
public class Countytest {


public static void main(String[] args) {
	
	Scanner scanner=new Scanner(System.in);
	
	System.out.println("What is the county's name?");
	String name=scanner.nextLine();
	
	System.out.println("When was the county founded ?");
	int year=scanner.nextInt();
	
	System.out.println("What is the county's population?");
	int population=scanner.nextInt();
	
	System.out.println("What is the county's land volume?");
	double volume=scanner.nextDouble();
	
	System.out.println(name);
	System.out.println(year);
	System.out.println(population);
	System.out.println(volume);
	

	
	
	}

}
