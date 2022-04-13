import java.util.Scanner;

public class Ejemplo2If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edad = 19;
		Scanner leerTeclado = new Scanner(System.in);
		System.out.println("Ingrese su edad:");
		edad = leerTeclado.nextInt();
		
		if(edad > 18)
		{
			System.out.println("Ud es mayor de edad");
		}

	//	System.out.println("app terminada");
		
		
		if(edad >= 18)
		{
			System.out.println("Ud. es mayor de edad");
		}
		else
		{
			System.out.println("Ud es menor edad");
		}
		
		System.out.println("Tiene pase de movilidad: 1.- Si 2.- No");
		int opcion = leerTeclado.nextInt();
		
		if(opcion == 1)
		{
			System.out.println("Puede entrar al concierto");
		}
		else
		{
			System.out.println("NOOOO!!! Puede entrar al concierto");
		}
		
	}

}
