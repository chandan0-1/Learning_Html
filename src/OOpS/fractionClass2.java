
public class fractionClass2 {
	public static void main(String[] args) {
		fractionClass f=new fractionClass(4,6);
		f.print();
//		f.increment();
//		f.print();
		fractionClass f1=new fractionClass(4,8);
//		f.add(f1);
		f1.print();
		fractionClass.addFraction(f1,f);
//		fractionClass f1=new fractionClass(4,8);
	}

}
