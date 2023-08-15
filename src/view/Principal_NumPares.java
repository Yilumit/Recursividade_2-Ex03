package view;

import controller.NumParesController;

//Mostra a quantidade de números pares contidadas no vetor
public class Principal_NumPares {

	public static void main(String[] args) {
		NumParesController cMet = new NumParesController();
		int []vet = {2, 4, 5, 6, -2, 9, 7, -3};
		int tamanho = vet.length -1;
		System.out.println("Quantidade de números pares contidas no vetor: "+cMet.contPares(vet, tamanho, 0));

	}

}
