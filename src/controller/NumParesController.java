package controller;

public class NumParesController {

	public NumParesController() {
		super();
	}
	public int contPares(int vet[], int indice, int pares){
		if (indice<0) {
			return pares; //retorna a quantidade de números naturais encontrados no vetor
			
		}else if (vet[indice]%2==0) {//Se o valor do vetor que está sendo comparado é par
			pares ++;	//Adiciona +1 na contagem dos números naturais
		}
		pares = contPares(vet, indice-1, pares); //Chama a funçao novamente e atribui a quantidade de números naturais encontrados dos próximos índeces verificados 
		return pares;
	}

}
