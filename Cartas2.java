import java.util.*;
public class Cartas {
	public static void main(String[] args) {
		// Copas Ouro Paus Espada 
	String[] nipes={"Copas", "Ouro", "Paus", "Espada" };
	String[] faces={ "A", "2", "3", "4", "5", "6", "7",
                     "8", "9", "10", "J", "Q", "K" };
    Random sorteio = new Random();
	// entrada	
	int indice_faces = sorteio.nextInt(faces.length);
	int indice_nipes = sorteio.nextInt(nipes.length);
	System.out.println(faces[indice_faces] + " de "  + 
	nipes[indice_nipes]);
	}
}

