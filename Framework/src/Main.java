
public class Main {
	public static void main(String[] args) {
		Interface1 i1 = new ConcreteClass1();
		AbstractDemo ad = (AbstractDemo) i1;
		ConcreteClass1 cc1 = (ConcreteClass1) ad;
		cc1.method21();
		cc1.method22();
	}
}
