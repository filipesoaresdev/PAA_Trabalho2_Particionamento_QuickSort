package com.filipesoaresdev.quicksort;

public class QuickSortMain {

	public static void calculaTempoExecucaoLomuto(int[] vetor,  int tamanho, int pesoVariacaoValores){


			long tempInicial = System.nanoTime();
			QuickSort.quickSortLomuto(vetor, 0, tamanho - 1);
			long tempFinal = System.nanoTime();
			long dif = (tempFinal - tempInicial);
			System.out.println("Peso Variação;"+pesoVariacaoValores+";Lomuto" + tamanho + ";" + dif);

	}

	public static void calculaTempoExecucaoHoare(int[] vetor2,  int tamanho, int pesoVariacaoValores){


			long tempInicial2 = System.nanoTime();
			QuickSort.quickSortHoare(vetor2, 0, tamanho - 1);
			long tempFinal2 = System.nanoTime();
			long dif2 = (tempFinal2 - tempInicial2);
			System.out.println("Peso Variação;"+pesoVariacaoValores+";Hoare" + tamanho + ";" + dif2);

	}

	private static void executaComparacao(int tamanho, int pesoVariacaoValores, int quantExecucoes){
		for(int i = 0; i < quantExecucoes; i++) {

			int[] vetor = GeraLista.gera(tamanho, pesoVariacaoValores);
			int[] vetor2 = new int[vetor.length];

			for(int j = 0; j < vetor.length; j++){
				vetor2[j] = vetor[j];
			}

			calculaTempoExecucaoHoare(vetor2,  tamanho, pesoVariacaoValores);

			calculaTempoExecucaoLomuto(vetor,  tamanho, pesoVariacaoValores);

		}
	}

	public static void main(String[] args) {

		executaComparacao(100,1, 5);
		executaComparacao(500,1, 5);
		executaComparacao(1000,1, 5);
		executaComparacao(5000,1, 5);
		executaComparacao(30000,1, 5);
		executaComparacao(80000,1, 5);
		executaComparacao(100000,1, 5);
		executaComparacao(150000,1, 5);
		executaComparacao(200000,1, 5);


		executaComparacao(100,10, 5);
		executaComparacao(500,10, 5);
		executaComparacao(1000,10, 5);
		executaComparacao(5000,10, 5);
		executaComparacao(30000,10, 5);
		executaComparacao(80000,10, 5);
		executaComparacao(100000,10, 5);
		executaComparacao(150000,10, 5);
		executaComparacao(200000,10, 5);


		executaComparacao(100,100, 5);
		executaComparacao(500,100, 5);
		executaComparacao(1000,100, 5);
		executaComparacao(5000,100, 5);
		executaComparacao(30000,100, 5);
		executaComparacao(80000,100, 5);
		executaComparacao(100000,100, 5);
		executaComparacao(150000,100, 5);
		executaComparacao(200000,100, 5);


		executaComparacao(100,1000, 5);
		executaComparacao(500,1000, 5);
		executaComparacao(1000,1000, 5);
		executaComparacao(5000,1000, 5);
		executaComparacao(30000,1000, 5);
		executaComparacao(80000,1000, 5);
		executaComparacao(100000,1000, 5);
		executaComparacao(150000,1000, 5);
		executaComparacao(200000,1000, 5);

	}
	
	

}
