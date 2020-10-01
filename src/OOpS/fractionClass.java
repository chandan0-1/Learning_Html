
public class fractionClass {

	//	public static void main(String[] args) {
	//		System.out.println("Hello");
	private int num;
	private int den;
	public fractionClass(int num, int den) {
		this.num=num;
		this.den=den;
		simplify();
	}

	private void simplify() {
		int gcd=1;
		int smaller = Math.min(num,den);
		for (int i=2;i<=smaller;i++) {
			if (num%i==0 && den%i==0) {
				gcd=i;
			}
		}
		num=num/gcd;
		den/=gcd;
	}
	public void print() {
		System.out.println(num+"/"+den);
	}
	public void increment() {
		num=num+den;
		simplify();
	}
	
	public void add(fractionClass f2) {
		this.num = this.den*f2.num+this.num*f2.den;
		this.den = this.den*f2.den;
		simplify();
	}
	
	public static void addFraction(fractionClass f1, fractionClass f2 ) {
		int num1=f1.den*f2.num+f1.num*f2.den;
		int den1=f1.den*f2.den;
		System.out.println(num1+"/"+den1);
		
	}

}
