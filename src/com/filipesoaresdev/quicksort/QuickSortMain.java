package com.filipesoaresdev.quicksort;

public class QuickSortMain {

	public static void calculaTempoExecucaoLomuto(int tamanho, int quantExecucoes){
		for(int i = 0; i < quantExecucoes; i++) {
			int[] vetor = GeraLista.gera(tamanho);

			long tempInicial = System.nanoTime();
			QuickSort.quickSortLomuto(vetor, 0, tamanho - 1);
			long tempFinal = System.nanoTime();
			long dif = (tempFinal - tempInicial);
			System.out.println("Lomuto - Array de tamanho " + tamanho + ": " + dif);
		}
	}
	public static void calculaTempoExecucaoHoare(int tamanho, int quantExecucoes){
		for(int i = 0; i < quantExecucoes; i++) {
			int[] vetor = GeraLista.gera(tamanho);

			long tempInicial = System.nanoTime();
			QuickSort.quickSortHoare(vetor, 0, tamanho - 1);
			long tempFinal = System.nanoTime();
			long dif = (tempFinal - tempInicial);
			System.out.println("Hoare - Array de tamanho " + tamanho + ": " + dif);
		}
	}
	public static void main(String[] args) {

		calculaTempoExecucaoLomuto(100,5);
		calculaTempoExecucaoLomuto(500,5);
		calculaTempoExecucaoLomuto(1000,5);
		calculaTempoExecucaoLomuto(5000,5);
		calculaTempoExecucaoLomuto(30000,5);
		calculaTempoExecucaoLomuto(80000,5);
		calculaTempoExecucaoLomuto(100000,5);
		calculaTempoExecucaoLomuto(150000,5);
		calculaTempoExecucaoLomuto(200000,5);

		calculaTempoExecucaoHoare(100,5);
		calculaTempoExecucaoHoare(500,5);
		calculaTempoExecucaoHoare(1000,5);
		calculaTempoExecucaoHoare(5000,5);
		calculaTempoExecucaoHoare(30000,5);
		calculaTempoExecucaoHoare(80000,5);
		calculaTempoExecucaoHoare(100000,5);
		calculaTempoExecucaoHoare(150000,5);
		calculaTempoExecucaoHoare(200000,5);


	}
	
	

}
