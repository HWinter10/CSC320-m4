package application;
import java.util.Scanner;
public class loopingConstruct {
	
	public static void main(String[] args) {
		float total = 0, average, minimum, maximum;
        float arr[] = new float[5];
        int i = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Input a value followed by enter: ");
        
        while(i < 5) {
        	arr[i] = in.nextFloat();
            total += arr[i];
            i++;
        }
        
        average = total/5;
        minimum = Math.min(arr[0], Math.min(arr[1], Math.min(arr[2], Math.min(arr[3], arr[4]))));
        maximum = Math.max(arr[0], Math.max(arr[1], Math.max(arr[2], Math.max(arr[3], arr[4]))));
            
        System.out.println("\n" + "Value total: "+ total);
        System.out.println("Value average: "+ average);
        System.out.println("20% interest of total: "+ (total * 0.2) + "%");
        System.out.println("Minimum value: "+ minimum);
        System.out.println("Maximum value: "+ maximum);
  }
}
