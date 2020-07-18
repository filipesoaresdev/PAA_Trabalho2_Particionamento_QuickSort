package com.filipesoaresdev.quicksort;

import com.sun.xml.internal.bind.v2.model.annotation.Quick;

public class QuickSortMain {

	public static int count = 0;
	public static int pluscount = 0;

	public static long valorint = 0;
	public static long valorInteger = 0;


	public static void calculaTempoExecucaoLomuto(int[] vetor,  int tamanho, int pesoVariacaoValores){


			long tempInicial = System.nanoTime();
			QuickSort.quickSortLomuto(vetor, 0, tamanho - 1);
			long tempFinal = System.nanoTime();
			long dif = (tempFinal - tempInicial);
			System.out.println("Peso Variação;"+pesoVariacaoValores+";Lomuto" + tamanho + ";" + dif);
			System.out.println("Quantidade swap: "+ QuickSortMain.count);
/*
			QuickSortMain.count = 0;
			QuickSortMain.pluscount=0;*/
	}

	public static void calculaTempoExecucaoHoare(int[] vetor2,  int tamanho, int pesoVariacaoValores){


			long tempInicial2 = System.nanoTime();
			QuickSort.quickSortHoare(vetor2, 0, tamanho - 1);
			long tempFinal2 = System.nanoTime();
			long dif2 = (tempFinal2 - tempInicial2);
			System.out.println("Peso Variação;"+pesoVariacaoValores+";Hoare" + tamanho + ";" + dif2);
			System.out.println("Quantidade swap: "+ QuickSortMain.count);
			System.out.println("Quantidade swap: "+ QuickSortMain.pluscount);

			/*QuickSortMain.count = 0;
			QuickSortMain.pluscount=0;*/

	}

	private static void executaComparacao(int tamanho, int pesoVariacaoValores, int quantExecucoes){
		for(int i = 0; i < quantExecucoes; i++) {

			int[] vetor = GeraLista.gera(tamanho, pesoVariacaoValores);
			int[] vetor2 = new int[vetor.length];
			System.arraycopy(vetor, 0,vetor2 ,0 ,vetor.length);
			for(int j = 0; j < vetor.length; j++){
				vetor2[j] = vetor[j];
			}

			calculaTempoExecucaoHoare(vetor2,  tamanho, pesoVariacaoValores);

			calculaTempoExecucaoLomuto(vetor,  tamanho, pesoVariacaoValores);

		}
	}

	private static void executaComparacaoPrimitivoObject(){

		int[] vetor = GeraLista.gera(100000, 100000);

		long tempInicial2 = System.nanoTime();
		for(int j = 1; j < vetor.length; j++){
			vetor[j-1] = vetor[j];
		}
		long tempFinal2 = System.nanoTime();
		long dif2 = (tempFinal2 - tempInicial2);
		valorint += dif2;

		Integer[] vetor2 = GeraLista.geraIntegerType(100000, 100000);

		tempInicial2 = System.nanoTime();
		for(int j = 1; j < vetor2.length; j++){
			vetor2[j-1] = vetor2[j];
		}
		tempFinal2 = System.nanoTime();
		dif2 = (tempFinal2 - tempInicial2);
		valorInteger += dif2;
	}

	public static void main(String[] args) {


		for(int i =0; i < 1000; i++) {
			executaComparacaoPrimitivoObject();
		}
		System.out.println("Tempo int:" + valorint);

		System.out.println("Tempo Integer:" + valorInteger);


		/*executaComparacao(100,1, 5);
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


		executaComparacao(100,1000, 5);
		executaComparacao(500,1000, 5);
		executaComparacao(1000,1000, 5);
		executaComparacao(5000,1000, 5);
		executaComparacao(30000,1000, 5);
		executaComparacao(80000,1000, 5);
		executaComparacao(100000,1000, 5);
		executaComparacao(150000,1000, 5);
		executaComparacao(200000,1000, 5);

		*/




	}
	
	

}
