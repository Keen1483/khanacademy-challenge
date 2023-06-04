import java.util.HashMap;
import java.util.Map;

public class Solution {

	public static void main(String[] args) {
		System.out.println(secondDegreeEquation(2, 8, 8));
	}
	
	public static Map<String, Double> secondDegreeEquation(double a, double b , double c) {
		double delta = b*b - 4*a*c;
		if (delta < 0) {
			return null;
		} else if (delta == 0) {
			double x = (-1 * b) / (2*a);
			return new HashMap<String, Double>() {{
				put("x", x);
			}};
		} else {
			double x1 = (-1*b - Math.sqrt(delta)) / (2*a);
			double x2 = (-1*b + Math.sqrt(delta)) / (2*a);
			return new HashMap<String, Double>() {{
				put("x1", x1);
				put("x2", x2);
			}};
		}
	}

}
