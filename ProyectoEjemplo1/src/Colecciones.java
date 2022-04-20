import java.util.ArrayList;
import java.util.Collections;

public class Colecciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> nombres = new ArrayList<String>();
		
		ArrayList<String> apellidos;
		apellidos = new ArrayList<String>();

		// agregar nombre
		nombres.add("Juan");
		nombres.add("Ana");
		nombres.add("Pedro");
		nombres.add("Antonia");
		// mostrar todo el contenido de la colección
		System.out.println(nombres);
		// mostrar el valor del indice señalado
		System.out.println(nombres.get(0));
		
		// permite modificar el valor del indice señalado
		System.out.println(nombres.get(1));
		nombres.set(1, "Anita");
		System.out.println(nombres.get(1));
		
		// ver la cantidad de elementos de un arreglo
		System.out.println("La cantidad de elemento son:" + nombres.size());
		
		// Eliminar elementos
		System.out.println(nombres);
		nombres.remove(1);
		System.out.println(nombres);
		nombres.clear();
		System.out.println(nombres);
		
		
		// agregar nuevos elementos a la colección
		nombres.add("Juan");
		nombres.add("Ana");
		nombres.add("Pedro");
		nombres.add("Antonia");
		
		for(int i = 0; i < nombres.size(); i++)
			System.out.println(nombres.get(i));
		
		// ordenar los datos
		Collections.sort(nombres);
		for(String nombre: nombres) // for each
			System.out.println("****** El nombre es:" + nombre);
		
		
		for(String nombre: nombres)
		{
			if(nombre.length() >= 4)
				System.out.println("El nombre es:" + nombre);
		}
		System.out.println("=======  fin del programa");
		
	}

}
