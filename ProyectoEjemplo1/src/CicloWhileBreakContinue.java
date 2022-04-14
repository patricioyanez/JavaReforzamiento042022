import java.util.Scanner;

public class CicloWhileBreakContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leerTeclado = new Scanner(System.in);
		
		int numero = -1;
		
		while(numero != 0)
		{
			System.out.println("Ingrese un número");
			numero = leerTeclado.nextInt();
			
			if(numero == 100)
			{
				break;
			}
		}
		
		int numero2 = 0;
		while(numero2++ < 10)
		{
			if((numero2 % 2) != 0)
				continue;
			System.out.println("valor:" + numero2);
		}
		

	}

}
