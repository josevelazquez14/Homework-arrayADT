import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {
	
	
	static ArrayList<Object> array = new ArrayList<>(0);
	
	public static void main(String[] args) {
		System.out.println("1 for add, 2 for remove, 3 for size");
		System.out.println("Enter request and value separated with a space:");
		while(true) {
			System.out.println("");
			// create a scanner so we can read the input
			Scanner scanner = new Scanner(System.in);

			//get request type
			int commad = scanner.nextInt();

			//get request value
			Object value = scanner.nextLine();

			//handle request
			requestHandler(commad, value);
		}
	}

	
private static void requestHandler(int request, Object value) {
		
//		if(request == 3) { //prints list size 
//			int s = array.size();
//			System.out.print("Size->\""+s+"\"");
//		}
//		
		//will accept entries into arrayList as long as they are not null values
		if(!value.equals("") && value != null) {
			if(request == 1) {
				array.add(value);
				System.out.print(array);
			}
			
			if(request == 2) {
				array.removeAll(Collections.singleton(value));
				System.out.print(array);
			}

		}
		
	}
}
