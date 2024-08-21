import java.util.Scanner;

public class IT24100516Lab5Q3 
{
    
    public static void main(String[] args) {
        int startdate, enddate, noOfdates;
        double discount, total;
        
        final double ROOM_CHARGE_PER_DAY = 48000.00;
        final double DISCOUNT_RATE_10_PERCENT = 0.1;
        final double DISCOUNT_RATE_20_PERCENT = 0.2;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the start date (1-31): ");
        startdate = input.nextInt();

        System.out.println("Enter the end date (1-31): ");
        enddate = input.nextInt();

        // Validate input dates
        if (startdate < 1 || startdate > 31 || enddate < 1 || enddate > 31 || startdate > enddate) {
            System.out.println("Error. Dates do not meet the requirements.");
            return;
        }

        // Calculate the number of days reserved
        noOfdates = enddate - startdate;

        // Calculate total amount and apply discount
        double totalCharge = noOfdates * ROOM_CHARGE_PER_DAY;

        if (noOfdates < 3) {
            total = totalCharge;
        } else if (noOfdates <= 4) {
            discount = totalCharge * DISCOUNT_RATE_10_PERCENT;
            total = totalCharge - discount;
        } else {
            discount = totalCharge * DISCOUNT_RATE_20_PERCENT;
            total = totalCharge - discount;
        }

        System.out.println("The number of days reserved: " + noOfdates);
        System.out.println("The total amount to be paid: " + total);
    }
}
