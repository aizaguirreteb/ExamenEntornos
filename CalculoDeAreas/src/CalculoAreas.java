import java.util.Scanner;

public class CalculoAreas {
	
	public static void menu() {
		System.out.println("\tCALCULO DE AREAS");
		System.out.println();
		System.out.println("=====================================");
		System.out.println("  1. Calcular area de un triangulo");
		System.out.println("  2. Calcular area de un trapecio");
		System.out.println("  3. Calcular area de un rectangulo");
		System.out.println("  4. Salir");
	}
	
	public static double calcularAreaTriangulo(double base, double altura) {
		return (base * altura)/2.0;
	}
	
	public static double calcularAreaRectangulo(double base, double altura) {
		return base * altura;
	}
	
	public static double calcularAreaTrapecio(double base1, double base2, double altura) {
		return ((base1 + base2) / 2.0) * altura;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int opcion = -1;
		
		double baseTri = -1;
		double alturaTri = -1;
		
		do {
			menu();
			opcion = sc.nextInt();
			switch(opcion){
				case 1:
					do {
						System.out.println("Introduce los valores: ");
						System.out.println("\tBase:");
						baseTri = sc.nextDouble();
						System.out.println("\tAltura:");
						alturaTri = sc.nextDouble();
					}while(baseTri <= 0 || alturaTri <= 0);
					System.out.printf("El triangulo de base %.2f y altura %.2f tiene area %.2f%n",baseTri,alturaTri,calcularAreaTriangulo(baseTri, alturaTri));
					break;				
			}
		}while(opcion != 4);
		
		
	}

}
