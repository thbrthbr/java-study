package study1;
import java.math.BigDecimal;

public class Decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigDecimal a = new BigDecimal("0.12");
		BigDecimal b = new BigDecimal("0.1");
		BigDecimal sum = a.add(b);
		BigDecimal diff = a.subtract(b);
		BigDecimal multi = a.multiply(b);
		BigDecimal divi = a.divide(b);
		
		System.out.println(sum);
		System.out.println(diff);
		System.out.println(multi);
		System.out.println(divi);

		

	}

}
