import java.util.Scanner;

public class Ciclos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//contador
		int con = 0;
		
		con = con + 1;
		con++;
		con += 1;
		
		// acumulador
		int acumulador = 0;
		int valor = 100;
		acumulador = acumulador + valor;
		
		int opcion = 0;
		Scanner leerTeclado = new Scanner(System.in);
		while(opcion != 0)
		{
			System.out.println("Ingrese un valor:");
			opcion = leerTeclado.nextInt();
		}
		
		opcion = -1;
		while(opcion != 0)
		{
			System.out.println("**** Menú principal ****");
			System.out.println("1.- Sumar");
			System.out.println("2.- Restar");
			System.out.println("3.- Multiplicar");
			System.out.println("4.- Dividir");
			System.out.println("5.- obtener sumatoria");
			System.out.println("0.- Salir");
			System.out.println("Seleccione una de las opciones:");
			opcion = leerTeclado.nextInt();
			
			if(opcion == 1)
			{
				System.out.println("Ud seleccionó sumar");
				
				System.out.println("Presione C para para continuar");
				leerTeclado.next();
			}
		}

		System.out.println("Aplicación cerrada.");
	}

}
