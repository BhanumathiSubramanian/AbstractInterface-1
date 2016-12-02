interface method
{
	public void simpleprint(int i);
}

class demosimple implements method
{
	public void simpleprint(int x)
	{
		System.out.println("The value of Simple method is " + x);
		
	}
}
class squareSimple implements method
{
	public void simpleprint (int x)
	{
		System.out.println("The value of Square method is " + (x * x));
		
	}
}
public class DemoInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demosimple obj = new demosimple();
		obj.simpleprint(2);
		squareSimple obj1 = new squareSimple();
		obj1.simpleprint(2);
	}

}
