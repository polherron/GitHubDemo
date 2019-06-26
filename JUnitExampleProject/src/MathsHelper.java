
public class MathsHelper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testAdd();
	}
	
	//manual test of add method
	public static void testAdd()
	{
		int x = 5;
		int y = 6;
		int actual = add(x,y);
		int expected = 11;
		
		if (actual == expected) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
			
	}
	
	//Accepts two integer inputs and returns their
	//sum
	public static int add(int a, int b){
		
		if(a < 100)
		{
			int answer = a + b;
			return answer;
		}
		else
		{
			int j = 30;
			return j;
		}
	}

	public static int sub(int i, int j) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public static int mult(int i, int j) {
		// TODO Auto-generated method stub
		return i * j;
	}
	
	public static double divide(double i, double j)
	{
		return i/j;
	}
	
	
	
	
	
	



}
