package lab1source;

public class src1 {
	public static String T(double a,double b,double c){
		double tem = Math.max(a, b);
		if(tem>c){
			if(tem==a){
				a = c;
			}else {
				b = c;
			}
			c = tem;
		}
		if(!(a+b>c&&Math.abs(a-b)<c)){
			return "not a triangle";
		}else if(a==b && a==c){
			return "equilateral triangle";
		}else if(a==b || a==c || b==c){
			return "isosceles triangle";
		}else return "scalene triangle";
		}
		public static void main(String[] args) {
			System.out.println(src1.T(3, 3, 3));
		}
}
