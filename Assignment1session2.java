import java.util.*;
public class Assignment1session2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
		checkEligibility();
		}

		static void checkEligibility(){

		int age;
		Scanner sc=new Scanner(System.in);
		System.out.print("Welcome to Indian Voting Eligibility System.\n What is your age?\n");
		age=sc.nextInt();
		if(age>=18)
		System.out.println("You are eligible to vote. make a wise choice");
		else
		System.out.println("You are not eligible to vote.");


		}

		
		
		
		
		
		
		

	}


