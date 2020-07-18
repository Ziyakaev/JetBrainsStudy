import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int countCompanies = scanner.nextInt();
		int[] incomes = new int[countCompanies];
		int[] taxes = new int[countCompanies];

		for (int i = 0; i < countCompanies; i++) {
			incomes[i] = scanner.nextInt();
		}

		double maxTax = 0;
		int numberCompanieWithMaxTaxies = 0;
		for (int i = 0; i < countCompanies; i++) {
			taxes[i] = scanner.nextInt();
			double tax = incomes[i] * (taxes[i]/100.0);
			if (tax > maxTax) {
				maxTax = tax;
				numberCompanieWithMaxTaxies = i;
			}
		}

		System.out.println(++numberCompanieWithMaxTaxies);
		// write your code here
	}
}