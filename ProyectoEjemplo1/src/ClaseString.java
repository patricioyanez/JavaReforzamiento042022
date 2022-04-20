
public class ClaseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre = "maria";
		System.out.println(nombre);
		System.out.println(nombre.toUpperCase()); // mayuscula
		System.out.println(nombre.toLowerCase()); //  minuscula
		System.out.println("cantidad de caracteres: " + nombre.length());
		
		// ignacia diaz /maria ignacia diaz / maria
		
		System.out.println(nombre.indexOf(" "));
		System.out.println(nombre.lastIndexOf(" "));
		System.out.println(nombre);
		String rut1 = "20500400-K";
		String rut2 = "205015001";
		System.out.println(rut2.indexOf("-"));
		
		// extraer caracteres de un string
		System.out.println(rut1.substring(rut1.length()-1));
		System.out.println(rut2.substring(rut2.length()-1));
		System.out.println(rut1 + " " + rut2);
		
		String rutAuxiliar = rut1.replace("-", "");
		System.out.println(rutAuxiliar);
		
		if(rut1.startsWith("1050"))
		{
			System.out.println("Rut1 comienza con el patrón 2050");
		}
		else
		{
			System.out.println("Rut1 no comienza con el patrón indicado");			
		}
		if(rut1.endsWith("-K"))
		{
			System.out.println("*** Rut1 comienza con el patrón indicado");
		}
		else
		{
			System.out.println("*** Rut1 no comienza con el patrón indicado");			
		}
		
		String palabra = "     eliminar los espacios      ";
		System.out.println("-" + palabra + "-");
		System.out.println("-" + palabra.trim() + "-");
		
		if(palabra.contains("los"))
			System.out.println("los fue encontrado");
		else
			System.out.println("los No fue encontrado");
		
		System.out.println(rut1.contains("-")); // like
	}

}
