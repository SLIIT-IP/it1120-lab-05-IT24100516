import java.util.Scanner;

public class IT24100516Lab5Q2
{
    public static void main(String[] args)
    {
    	Scanner input = new Scanner(System.in);

	System.out.println(" Enter the no of new members: ");
	int newmembers=input.nextInt();

	if (newmembers<0)
	{
	System.out.println(" Invalid input. Input should be greater than 0.");
	return;
	}

	switch (newmembers)
	{
	
	case 0:
	System.out.println(" You are not entitled to a Prize.");
	break;

	case 1:
	System.out.println(" You are entitled to a Pen.");
	break;

	case 2:
	System.out.println(" You are entitled to an Umbrella.");
	break;

	case 3:
	System.out.println(" You are entitled to a Bag.");
	break;

	case 4:
	System.out.println(" You are entitled to a Travelling Chair. ");
	break;

	default:
	System.out.println(" You are entitled to a Headphone.");
	
	}

    }
}
