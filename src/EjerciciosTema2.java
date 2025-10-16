
public class EjerciciosTema2 {
	
	//ejercicio 2
	public static void ex232(int n) { 
		if (n <= 0) return; // falso porque n=6 es mayor q 0
		System.out.println(n); // se imprime 6
		ex232(n-2); // llama a ex232(4) porq 6-2= 4
		ex232(n-3); //llama a ex232(3)
		System.out.println(n); //imprime 6
		} 

	//La sálida estándar de ejecutar ex232(6) es: 6 4 2 2 1 1 4 3 1 1 3 6
	
	
	public static String ex233(int n) { 
		if (n <= 0) return ""; 
		return ex233(n-3) + n + ex233(n-2) + n; } 
	//qué valor devuelve ex233(6)
	//  ex233(3) + "6" + ex233(4) + "6"
	
}