import java.util.Scanner;
public class Array1 {
	public static void main(String[] args) {
		String[] nomes = { "João", "José", "Bruno", "Maria" };
		// indice            [0]     [1]      [2]     [3]
		// tamanho do array
		System.out.println("Tamanho do array: " + nomes.length);
	    Scanner entrada = new Scanner(System.in); 
	
		System.out.print("Digite o numero (0-3): ");
	    int indice = entrada.nextInt();
		if (indice < 4) {
		   System.out.println("Nome: " + nomes[indice]);
		}
		System.out.println("");
		System.out.println("--------------------");
		System.out.println("Todos os nomes");
		System.out.println("");
		// percorrendo o array com o laço for
		for (int i = 0; i < nomes.length; i++) {
			System.out.println(nomes[i]);
		}
	}
}
