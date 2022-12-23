package TiposDeDadosEmJava;

public class Programa13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char letra1 = 'a';
		char letra2 = 97;
		
		System.out.println("Letra1 = " + letra1);
		System.out.println("Letra2 = " + letra2);
		
		letra2 = (char) (letra2+1); //cast
		
		System.out.println("Letra1 = " + letra1);
		System.out.println("Letra2 = " + letra2);
		
		// tipos nao primitivos 
		Character letra3 ='A';
		String nome ="Geek Universiity";
		
		System.out.println("Letra3 = " + letra3);
		
		System.out.println("Char/Charactere " + Character.MIN_VALUE);
		System.out.println("Char/Charactere " + Character.MAX_VALUE);
		
		System.out.println("Nome " + nome);
		
		System.out.println("Tamanho da String " + nome.length());
		
		System.out.println("String " + (Character.SIZE * nome.length()) + " bits");
		
		
		
	}

}
