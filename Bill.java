import java.util.*;

public class Bill{

	public double splitBill(){

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter the total bill amount: ");
		double total = scanner.nextDouble();
		System.out.println("Please enter the total amount of people: ");
		int people = scanner.nextInt();
		System.out.println("Please enter the percentage of the bill that you want to tip: ");
		double tipPercent = scanner.nextDouble();

		double totalWithTip = (((double)(tipPercent/100))*(total))+total;
		double splitAmount = totalWithTip/people;
		return splitAmount;
	}

	public static void main(String[] args){

		Bill bill = new Bill();
		System.out.printf("Every pays $%.2f ",bill.splitBill());
	}
}
