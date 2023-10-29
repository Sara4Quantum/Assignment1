package assignment;

public class Demo {

	public static void main(String[] args) {
			 
	    Demo demo = new Demo();
	    int result = demo.add(10,20);
	        
	int result1 = demo.multiply(5,2);

	    System.out.println(result);
	    System.out.println("multiplied answer is "+result1);
	    }
	    
		int add(int no1, int no2)
	    {
	     int result = no1 + no2;
	    return result;
	    }
		
		int multiply(int no1, int no2)
		{
			int result1 = no1 * no2;
			return result1;
			
		}
}
