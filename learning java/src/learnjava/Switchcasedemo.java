package learnjava;

public class Switchcasedemo {

	public static void main(String[] args) {
		/*switch(expression)
		 * case1:
		 *   statements
		 * case2:
		 *   statements
		 * default:
		 *   default statements
		 * 
		 * 
		 * 
		 */
		int day=2;
		switch(day)
		{
		case 1:
			System.out.println("the day is monday");
			break;
		case 2:
			System.out.println("the day is tuesday");
			break;
		case 3:
			System.out.println("the day is wednessday");
			break;
		case 4:
			System.out.println("the day is thusday");
			break;
		case 5:
			System.out.println("the day is friday");
			break;
		case 6:
			System.out.println("the day is saturday");
			break;
		case 7:
			System.out.println("the day is sunday");
			break;
		default:
			System.out.println("no days are now available");
		}

	}

}
