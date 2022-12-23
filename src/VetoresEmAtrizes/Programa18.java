package VetoresEmAtrizes;


/*
 * Vetores / arrays / matrizes multi-dimenssionais
 * 
 * Vetor 
 * int numeros[5]
 * numeros [0] = 3;
 * numeros [1] = 3;
 * numeros [2] = 3;
 * numeros [3] = 3;
 * numeros [4] = 3;
 * 
 * Matriz 
 * 
 * [linhas] [colunas]
 * int numeros[3][3]
 * 
 * numeros [0][0] = 1;
 * numeros [0][1] = 2;
 * numeros [0][2] = 7;
 * numeros [1][0] = 4;
 * numeros [1][1] = 8;
 * numeros [1][2] = 9;
 * numeros [2][0] = 3;
 * numeros [2][1] = 6;
 * numeros [2][2] = 32;
 * 
 */

public class Programa18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaração 
		int outros_numeros [][];
		
		
	// Declaraçao e definição de matriz	
	int numeros[][]	= new int [3][3];
	
	// Declara definir o tamanho e inicializar 
		int mais_numeros[][] = { {1,2,3}, {4,5,6}, {7,8,9}};
	
	//Declarar uma matriz informando somente as linhas 
	int matriz [][]= new int [2][];
	matriz [0] = new int [5];
	matriz [1] = new int [3];

	System.out.println("Matriz " + matriz[0][5]);
	System.out.println(mais_numeros[0][0]);
	System.out.println(mais_numeros[0][1]);
	System.out.println(mais_numeros[0][2]);
	System.out.println(mais_numeros[1][0]);
	
		
	}

}
