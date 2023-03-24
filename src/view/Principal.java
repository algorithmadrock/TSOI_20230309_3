/*
RESUMO      : Exercicio 3, arena de competicao dos sapos
PROGRAMADORA: Luiza Felix
DATA        : 23/03/2023
 */

package view;

import controller.TS;

public class Principal {
	
	public static void main(String[] args) {

		Thread um = new TS(1000, "Sapo-Verde-Europeu", 150);
		Thread dois = new TS(1000, "Sapo-Arboreo-De-Olhos-Vermelhos", 150);
		Thread tres = new TS(1000, "Razinha-Saltadora", 150);
		Thread quatro = new TS(1000, "Ra-Touro", 44);
		Thread cinco = new TS(1000, "Ra-Golias", 300);
//		as distâncias e tamanhos de saltos estão em cm, pois a função aleatória não traria o número exato limite dos saltos

		System.out.println("A corrida vai começar! Os competidores percorrerão um percurso de 10m.");
		um.start();
		dois.start();
		tres.start();
		quatro.start();
		cinco.start();

	}
}
