import java.util.Scanner;

public class Ejemplo3IfElseIfEl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leerTeclado = new Scanner(System.in);
		
		System.out.println("Ingrese su edad:");
		int edad = leerTeclado.nextInt();
		
		//niño, adolescente, adulto, adulto mayor
		if(edad < 0)
		{
			System.out.println("Edad no es válida.");
		}
		else if(edad <= 12)
		{
			if(edad <= 2)
				System.out.println("Ud es un bebé");
			else
				System.out.println("Ud. es un niño");
		}
		else if (edad < 18)
		{
			System.out.println("Ud es un adolescente.");
		}
		else if (edad < 65)
		{
			System.out.println("Ud es un adulto.");
		}
		else 
		{
			System.out.println("Ud es un adulto mayor.");
		}
		
	}

}
