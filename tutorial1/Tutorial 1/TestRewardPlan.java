import java.util.Scanner;

public class TestRewardPlan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		System.out.println("++++++ Customer Redeem Plan +++++\n");
		System.out.print(" Customer ID >> ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.print(" Name >> ");
		String name = sc.nextLine();
		
		Customer customer = new Customer(id,name);
		HappyCard card = customer.getCard(); 
		
		
		System.out.print("\n**OPERATIONS : \n1. Buy Product 2. Redeem 3.Display Details 0. Exit >> ");
				int ops = sc.nextInt();
				while (ops != 0) {
					
				if (ops == 1) {
				System.out.print("\nTotal Ringgit to buy (whole number only) >> ");
				int amount = sc.nextInt();
				customer.buy(amount);
				System.out.println("\n** Your points have been added.");
				System.out.println("Current points: " + card.getPoint());
				}
				
				else if (ops == 2) {
				System.out.print("\nTotal Ringgit to redeem (whole number only) >> ");
				int amount = sc.nextInt();
				if (customer.redeem(amount)==true) {
				System.out.println("\n** You have successfully redeemed your points.");
				System.out.println("Current points: " + card.getPoint());
				}
				else {
				System.out.println("\n## Transaction failed ##");
				System.out.println("Sorry, your points are not enough for redemption.");
				}
				}
				
				else if (ops == 3) {
				System.out.println("\nCustomer ID: " + customer.getId());
				System.out.println("Name: " + customer.getName());
				System.out.println("Current points: " + card.getPoint());
				System.out.println("Card type: " + card.getType());
				}
				
				else if (ops > 3)
				System.out.println("Invalid input");
				System.out.print("\n**OPERATIONS : \n1. Buy Product 2. Redeem 3.Display Details 0. Exit >> ");
				ops = sc.nextInt();
				
				}
				
				sc.close();
				
	}

}
