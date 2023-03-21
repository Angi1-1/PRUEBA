/**
 * 
 */
package Switch;
import java.util.*;

import If.Rueda;
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
	
		int num;
		String tipoFluido, combustible;
		
		Motor motor1 = new Motor ();	
		
		System.out.println("Fluido ");
		tipoFluido = sc.nextLine();
		System.out.println ("Combustible ");
		combustible = sc.nextLine ();
		System.out.println("Introduce el numero de moto");
		num =sc.nextInt();
		motor1.setCombustible(combustible);
		motor1.setTipoBomba(num);
		motor1.setTipoFluido(tipoFluido);
		motor1.dimeTipoMotor();
		
	}

}
