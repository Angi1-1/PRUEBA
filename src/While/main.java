/**
 * 
 */
package While;
import java.util.*;
/**
 * @author Lenovo
 *
 */
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce la palabra");
		String str = sc.next();
	        int x = str.length();
	        int a = 0, b =1;
	        while (a < x) {
	            System.out.println(str.substring(a, b));
	            a++;
	            b++;}
		/* int x =  100;
	        
	        while (x > 49){
	            System.out.println("" +x);
	            x--;
	        }*/
		//Opcion de Scanner
		/*Scanner sc = new Scanner (System.in);
		System.out.println("Introduce los numeros");
		int x = sc.nextInt();
		System.out.println("Hasta que numero");
		int m = sc.nextInt();
		m-= 1;
	        
	        while (x > m){
	            System.out.println("" +x);
	            x--;
	        }*/

		char i = '*';
		int d = 0;
		while (d<5) {
			System.out.println("*****");
			d++;
		}
		
	}

}
