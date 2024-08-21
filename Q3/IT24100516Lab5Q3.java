import java.util.Scanner;

public class IT24100516Lab5Q3 
{
        public static void main(String[] args) 
	{

        final double ROOM_CHARGE_PER_DAY = 48000.00;
        final double NO_DISCOUNT = 0;
        final double DISCOUNT_RATE_10_PERCENT = 0.1;
        final double DISCOUNT_RATE_20_PERCENT = 0.2;

   	double total,totalCharge;
	 int noOfdays;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the start date (1-31): ");
        int startDate = input.nextInt();

        System.out.print("Enter the end date (1-31): ");
        int endDate = input.nextInt();

        
        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31 || startDate >= endDate )
	{
            System.out.println("Error: does not meet the validation requirements of the inputs.");
            return;
        }
       
        noOfdays = endDate - startDate;

        totalCharge=noOfdays*ROOM_CHARGE_PER_DAY;
	
	if ( noOfdays < 3 )
	{  total=totalCharge; }
	
	else if ( noOfdays <= 4 )
	{  total=totalCharge-(totalCharge * DISCOUNT_RATE_10_PERCENT); }
	
	else 
	{       total=totalCharge-(totalCharge * DISCOUNT_RATE_20_PERCENT); }




        System.out.println("Number of days reserved: " + noOfdays);
	System.out.println("Total amount to be paid: " + total);
	
	}
}

