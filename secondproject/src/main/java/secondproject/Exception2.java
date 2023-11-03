package secondproject;

public class Exception2 {

	public static void main(String[] args) {
		
Exception2 obj=new Exception2();

try {
	
	obj.m(10,0);
	}
	catch(ArithmeticException e) {System.out.println("not possible");


}
	}
	void m(int a,int b)throws ArithmeticException{
	int sum=a/b;
System.out.println("rest of the code");
}}


