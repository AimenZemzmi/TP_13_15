public class Test {
	
	public void testAddition() {
		Calculatrice calculer = new Calculatrice();
		int a, b, res;
		a = 5;
		b = 5;
		res = a+b;

		if (calculer.addition(a,b) != res) {
			System.out.println("Erreur avec l'operation addition");
		}
		else {
			System.out.println("ça fonctionne avec l'operation addition");
		}
	}

	public void testDivision() {
        Calculatrice calculer = new Calculatrice();
        int a, b, res;
        a = 8;
        b = 1;
        res = a/b;

        if (calculer.division(a,b) != res) {
            System.out.println("Erreur avec l'operation division");
        }
        else {
            System.out.println("ça fonctionne avec l'operation division");
        }
    }

    public void testMultiplication() {
        Calculatrice calculer = new Calculatrice();
        int a, b, res;
        a = 3;
        b = 3;
        res = a*b;

        if (calculer.multiplication(a,b) != res) {
            System.out.println("Erreur avec l'operation multiplication");
        }
        else {
            System.out.println("ça fonctionne avec l'operation multiplication");
        }
    }
	
	public void testSoustraction() {
		Calculatrice calculer = new Calculatrice();
		int a, b, res;
		a = 40;
		b = 5;
		res = a-b;

		if (calculer.soustraction(a,b) != res) {
			System.out.println("Erreur avec l'operation soustraction");
		}
		else {
			System.out.println("ça fonctionne avec l'operation soustraction");
		}
	}
}
