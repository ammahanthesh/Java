
public class Timeconverter {
	public static double convertToHours(int minutes) {
		double hours=(double)minutes/60;
		return hours;
	}

	public static void main(String[] args) {
		int minutes=90;
		double hours=convertToHours(minutes);
		System.out.println(hours);

	}

}
