public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static String pluralize(String a) {
		a = a.toLowerCase();
		if (a.endsWith("ey")) {
			return "eys";
		} else if (a.endsWith("y")) {
			return "ies";
		} else if (a.endsWith("ife")) {
			return "ives";
		} else {
			return "s";
		}
	}

	public static int min(int num1, int num2, int num3) {
		return (Math.min(num2, num3) < num1 ? Math.min(num2, num3) : num1);
	}

	public static boolean isLeapYear(int year) {
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					return true;
				} else {
					return false;
				}
			} else {
				return true;
			}
		} else {
			return false;
		}
	}
}
