package TiposDeDadosEmJava;

public class Program11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// tipos primarios / primitivos 
		
		int num1 = 4;
		short num2 = 4; 
		byte num3 = 4;
		
		// tipos nao primitivos / primarios	
		
		Integer num4 = 98;
		Short num5 = 7; 
		
		System.out.println("int -> Num1 = " + num1);
		System.out.println("short -> Num2 = " + num2);
		System.out.println("byte -> Num3 = " + num3);
		System.out.println("Integer -> Num4 = " + num4);
		System.out.println("Short -> Num1 = " + num5);
		
		System.out.println("int / Integer " + Integer.SIZE + "bits");
		System.out.println("short / Short " + Short.SIZE + "bits");
		System.out.println("byte /Byte " + Byte.SIZE + "bits");
	}

}
