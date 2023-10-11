import java.util.Scanner;

public class Assignment1_3 {

	public static void main(String[] args) 
	{
		int choice;
		int price1 = 0;
		int price2 = 0;
		int price3 = 0;
		int price4 = 0;
		int price5 = 0;
		int price6 = 0;
		int price7 = 0;
		int price8 = 0;
		int price9 = 0;
		
		int dosa_count=0;
		int idli_count=0;
		int Vadapav_count=0;
		int Samosa_count=0;
		int Kachori_count=0;
		int Patis_count=0;
		int Meduvada_count=0;
		int Upma_count=0;
		int Misal_count=0;
		
		Scanner sc = new Scanner(System.in);
		do 
		{
		System.out.println("  Item           price(RS)");
		System.out.println("Exit");
		System.out.println("1. Dosa           Rs.50");
		System.out.println("2. Idli           Rs.30");
		System.out.println("3. Vadapav        Rs.10");
		System.out.println("4. Samosa         Rs.18");
		System.out.println("5. Kachori        Rs.20");
		System.out.println("6. Patis          Rs.15");
		System.out.println("7. Meduvada       Rs.30");
		System.out.println("8. Upma           Rs.15");
		System.out.println("9. Misal          Rs.25");
		System.out.println("10.Generate bill");
		System.out.println("Enter your choice : ");
		choice = sc.nextInt();
		
		switch (choice) 
		{
		case 0: 
			System.out.println("Thank you for ordering food");
			break;
			
		case 1:
			System.out.print("Enter quantity : ");
			dosa_count = sc.nextInt();
     		price1 = 50*dosa_count;	
			System.out.println("Thank you for ordering food");
			break;
				
		case 2:
			System.out.print("Enter quantity : ");
			idli_count = sc.nextInt();
 			price2 = 30*idli_count;	
			System.out.println("Thank you for ordering food");
			break;
			
		case 3:
			System.out.print("Enter quantity : ");
			Vadapav_count = sc.nextInt();
 			price3 = 10*Vadapav_count;	
			System.out.println("Thank you for ordering food");
			break;
			
		case 4:
			System.out.print("Enter quantity : ");
			Samosa_count = sc.nextInt();
 			price4 = 18*Samosa_count;	
			System.out.println("Thank you for ordering food");
			break;
		
		case 5:
			System.out.print("Enter quantity : ");
			Kachori_count = sc.nextInt();
 			price5 = 20*Kachori_count;	
			System.out.println("Thank you for ordering food");
			break;
			
		case 6:
			System.out.print("Enter quantity : ");
			Patis_count = sc.nextInt();
 			price6 = 15*Patis_count;	
			System.out.println("Thank you for ordering food");
			break;
			
		case 7:
			System.out.print("Enter quantity : ");
			Meduvada_count = sc.nextInt();
 			price7 = 30*Meduvada_count;	
			System.out.println("Thank you for ordering food");
			break;
			
		case 8:
			System.out.print("Enter quantity : ");
			Upma_count = sc.nextInt();
 			price8 = 15*Upma_count;	
			System.out.println("Thank you for ordering food");
			break;
			
		case 9:
			System.out.print("Enter quantity : ");
			Misal_count = sc.nextInt();
 			price9 = 25*Misal_count;	
			System.out.println("Thank you for ordering food");
			break;
				
		
		case 10:
				int total = price1+price2+price3+price4+price5+price6+price7+price8+price9;
				System.out.println("Total bill : "+total);
				System.out.println("Thank you for ordering food");
			
		}
		}while(choice!=0);
	}

}
