package VetoresEmAtrizes;

public class Programa17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero[] = new int[10];
		
		for (int i = 0 ; i< numero.length; i++) {
			// numero[0] = i +3;
			numero [i]= i +3;
			//numero [9] = i+3;
		}
		
		System.out.println("numero" + numero[0]); // primeiro elemento
		System.out.println("numero" + numero[9]); // ultimo elemento
		
		// 0 .. 9 
		// numero [10] = 42;
		//System.out.println(numero[10]);
		
		/*
		 * Os vetores / arrays possuem tamanho fixo e nao podem 
		 * ser aumentados / diminuidos 
		 */

	}

}
