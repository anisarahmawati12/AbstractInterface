import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public Main() {
		ArrayList<Pizza> pizza = new ArrayList<>();
		String input;
		MozzaPizza mozzapizza = new MozzaPizza() {};
		ChedarPizza chedarpizza = new ChedarPizza();
		do{
			Scanner scan = new Scanner(System.in);
			input = scan.nextLine();
		}while(!input.equals("MozzaPizza") && !input.equals("ChedarPizza"));
		if(input.equals("ChedarPizza")){
			pizza.addAll(chedarpizza);
		} else{
			pizza.add(mozzapizza);
		}
	}

	public static void main(String[] args) {
		new Main();

	}

}
