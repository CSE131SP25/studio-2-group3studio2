import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("What amount do you want to start with");
		int startAmount = sc.nextInt();
		int start=startAmount;
		System.out.println("What are your chances of winning (enter as decimal");
		double winChance = sc.nextDouble();
		System.out.println("What is your win limit");
		int winLimit = sc.nextInt();
		System.out.println("How many days do you want to play");
		int days=sc.nextInt();
		int count=0;
		
		for(int i=1; i<=days; i++) {
		while(startAmount<winLimit && startAmount>0) {
			
			double winRate=Math.random();
			if(winRate<winChance) {
				startAmount++;
				// System.out.println("Round won");
			}
			else if(winRate>=winChance) {
				startAmount--;
				// System.out.println("Round lost");
			}
			count++;
			
			// System.out.println(startAmount);
			
		}
		System.out.println("Number of Plays " + count);
		System.out.println("End of Day " + i);
		if(startAmount==0) {
			System.out.println("Ruin");
		}
		else{
			System.out.println("Success");
		}
		startAmount = start;
		count = 0;
		}
	}

}
