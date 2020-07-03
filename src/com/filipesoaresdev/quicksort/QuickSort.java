package com.filipesoaresdev.quicksort;

public class QuickSort {

	static void quickSortLomuto(int[] vetor, int esquerda, int direita) {
		if (esquerda < direita) {

			int pi = particaoLomuto(vetor, esquerda, direita);

			quickSortLomuto(vetor, esquerda, pi - 1);
			quickSortLomuto(vetor, pi + 1, direita);
		}
	}
	
	static void quickSortHoare(int[] vetor, int esquerda, int direita) {
		if (esquerda < direita) {

			int pi = particaoHoare(vetor, esquerda, direita);

			quickSortHoare(vetor, esquerda, pi);
			quickSortHoare(vetor, pi + 1, direita);
		}
	}
	
	static int particaoLomuto(int[] vetor, int esquerda, int direita) {

		int pivo = vetor[direita];
		int i = (esquerda - 1);

		for (int j = esquerda; j <= direita - 1; j++) {

			if (vetor[j] <= pivo) {
				i++; 
				swap(vetor, i, j);
			}
		}
		swap(vetor, i + 1, direita);
		return (i + 1);
	}

	static int particaoHoare(int[] vetor, int esquerda, int direita) {
		int pivo = vetor[esquerda];
		int i = esquerda - 1, j = direita + 1;

		while (true) {
			do {
				i++;
			} while (vetor[i] < pivo);

			do {
				j--;
			} while (vetor[j] > pivo);

			if (i >= j)
				return j;
			
			swap(vetor, i, j);
			
		}
	}

	private static void swap(int[] array, int position1, int position2) {
		int temp = array[position1];

		array[position1] = array[position2];

		array[position2] = temp;
	}

}
