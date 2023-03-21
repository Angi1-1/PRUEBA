/**
 * 
 */
package If;
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
		//Sentencia if 
		// Ejercicio 1 
		boolean b;
		if (1 < 5)
		{
			System.out.println ("");
		}
		//Cuando un año es bisiesto 
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce el año");
		int x = sc.nextInt();
		if ((x % 4== 0)&& (x % 100 != 0)||(x % 400 ==0) )
		{
				System.out.println("año binario " +x);
		}
		else 
		{
			System.out.println ("Error");
		}
		
		String tipo, marca;		
		double grosor, diametro;
		
		Rueda rueda1 = new Rueda ();
		System.out.println("Tipo ");
		tipo = sc.nextLine();
		System.out.println ("marca ");
		marca = sc.nextLine ();
		System.out.println("Grosor");
		grosor = sc.nextDouble();
		System.out.println("Diametro");
		diametro = sc.nextDouble();
		
		rueda1.setDiametro(diametro);
		rueda1.setGrosor(grosor);
		rueda1.setMarca(marca);
		rueda1.setTipo(tipo);
		rueda1.comprobarDimensiones();
		
		
		
	
	}
	}

