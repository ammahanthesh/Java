
public class FinanceCalculator {
	public double calculateSimpleInterest(double principal, double rate, double time) {
		double interest=principal*rate*time;
		return interest;
	}

	public static void main(String[] args) {
		FinanceCalculator calculator = new FinanceCalculator();
		double principal=1000.0;
		double rate=0.05;
		double time=2.0;
		double interest=calculator.calculateSimpleInterest(1000.0, 0.05, 2.0);
		System.out.printf("%.2f\n",interest);

		
	}

}
