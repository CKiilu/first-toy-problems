/*Using Java, declare an integer named month whose value represents a month.
 *  Your code should display the name of the month, 
 *  based on the value of month, using the switch statement.
*/

package firsttoyp;
import java.util.*;

public class Month {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Type out the month below, using numbers 1-12");
		switch (sc.nextInt()) {
		case 0:
			break;
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("February");
			break;
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("June");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("August");
			break;
		case 9:
			System.out.println("September");
			break;
		case 10:
			System.out.println("October");
			break;
		case 11:
			System.out.println("November");
			break;
		case 12:
			System.out.println("December");
			break;
		default:
			System.out.println("Not a  month");
			break;
		}
	}

}
