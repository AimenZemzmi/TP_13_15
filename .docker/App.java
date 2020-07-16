import java.util.Scanner;

public class App {

	public static void main(String[] args) {
	
		//TEST UNITAIRE (Décommenter les test unitaire et ..
		//.. commenter l'execution de la calculatrice pour voir seulement les tests)
	
		/*Test testUnit = new Test();
		testUnit.testAddition();
		testUnit.testDivision();
		testUnit.testMultiplication();
		testUnit.testSoustraction();*/
		
		//FIN DES TEST UNITAIRE
		
		//EXECUTION DE LA CALCULATRICE (Commenter les test unitaire et ..
		//.. décommenter l'execution de la calculatrice pour voir seulement l'execution du code)
		
		Calculatrice calculer = new Calculatrice();

		System.out.println("Entrer deux valeurs entier : ");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();

		System.out.println("1 - Addition\n2 - Soustraction\n3 - Multiplication \n4 - Division");
		System.out.println("Choisissez une operation entre : 1, 2, 3 ou 4 ----- ");
		Scanner scanner_a = new Scanner(System.in); 
		
		int operation = scanner_a.nextInt();

		if (operation == 1 ){
			System.out.println(calculer.addition(a, b));
		   
		}
		else if (operation == 2 ){
			System.out.println(calculer.soustraction(a, b));
		}
		else if (operation == 3 ){
			System.out.println(calculer.multiplication(a, b));
		}
		else if (operation == 4 ){
			System.out.println(calculer.division(a, b));
		}
		else {
			System.out.println("L'operation que vous avez choix n'existe pas");
		}
		
		//FIN DE L'EXECUTION DE LA CALCULATRICE

	}

}
