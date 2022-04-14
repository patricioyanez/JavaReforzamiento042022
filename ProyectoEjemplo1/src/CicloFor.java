
public class CicloFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for(int indice = 0; indice< 10; indice++ )
		{
			System.out.println("valor:" + indice);			
		}
		
		// arreglo
		String [] nombres = {"juan", "ana", "diego", "Manuel", "Marcela"};
		for(int indice = 0; indice < nombres.length; indice++ )
		{
			System.out.println("El nombre es: " + nombres[indice]);		
		}
		int ind = 0;
		for(; ind< nombres.length;)
		{
			System.out.println("El nombre es: " + nombres[ind++]);	
		}
		
		System.out.println("el valor de indice es:" + ind);	
		
		
		
	}

}
