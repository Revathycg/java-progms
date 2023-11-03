package secondproject;

public class Exception1 {

	public static void main(String[] args) {
int age =12;
if(age<18) {
	 throw new ArithmeticException("not eligible");  
}
else {  
    System.out.println("eligible");  
}  
	}

}
