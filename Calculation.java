package oppsconcepts;

public class Calculation {

	int a;
	int b;
	
	//1) Method with no parameters
	//4) Method not returning any values
		/*void sum()
		{
			System.out.println(a+b);
		}*/
	
	//2) Method with parameters
	
		/*void sum(int x, int y)
		{
			int a=x;
			int b=y;
			System.out.println(a+b);
		}*/
	//3) Method which returns some value
	   
		int sum()
		{
			return(a+b);
		}
		
	public static void main(String[] args) {
		
	Calculation cal=new Calculation();
	
	//1) calling method with no parameters
		/*cal.a=10;
		cal.b=20;
		cal.sum();*/
	
	//2) calling method with parameters
	
		//cal.sum(20, 50);
	
	//3) calling method that returns some value
	
		cal.a=70;
		cal.b=20;
		int result = cal.sum(); // holding value in 'result' variable 
		System.out.println(result); //Printing the result
	
	}

}
