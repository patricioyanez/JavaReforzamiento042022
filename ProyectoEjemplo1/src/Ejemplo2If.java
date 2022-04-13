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

		System.out.println("app terminada");
	}

}
