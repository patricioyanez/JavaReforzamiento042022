
public class Arreglos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] nombres = {"Ana", "Luis", "Diego", "Alex", "Nicolás"};
		String apellidos[] = new String[5];
		int [] numeros = new int[5];		
		int valor[] = new int[5];

		valor[0] = 10;
		valor[1] = 20;
		valor[2] = 30;
		valor[3] = 40;
		valor[4] = 50;
//		valor[5] = 60; // envia un error. No existe indice 5
		
		
		System.out.println("El 1er nombre es: " + nombres[0]);
		System.out.println("El 2do nombre es: " + nombres[1]);
		System.out.println("El 3er nombre es: " + nombres[2]);
		System.out.println("El 4to nombre es: " + nombres[3]);
		System.out.println("El 5to nombre es: " + nombres[4]);

		
		for(int i = 0; i < valor.length; i++)
			System.out.println("valor: " + valor[i]);
		
		// Ejercicio: 
		// Crear un arreglo de 50 elementos numericos y almacenar los
		// primeros 50 numeros pares, partiendo del cero
	
		
		
	}

}
