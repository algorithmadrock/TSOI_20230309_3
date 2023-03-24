/*
RESUMO      : Exercicio 3, thread padrão dos sapos
PROGRAMADORA: Luiza Felix
DATA        : 23/03/2023
 */

package controller;

public class TS extends Thread {

	private long percurso;
	private float maxs;
	private String especie;
	public static int posicao = 1; // faz com que seja alocado em um mesmo espaço de memória para todos as threads

	public TS(long percurso, String especie, int maximo_salto) {
		this.especie = especie;
		this.percurso = percurso;
		this.maxs = maximo_salto; // em centímetros
	}

	@Override
	public void run() {
		progresso();
		System.err.println((posicao++) + " Lugar:  #TID " + especie);
	}

	private void progresso() {
		long progresso = 0;
		
		while (progresso < percurso) {
			int salto = (int) ((int) Math.random() * (maxs) + 1);
			progresso += salto;
			
			System.out.println("#TID " + especie + " pulou " + salto + ", percorrendo " + progresso + "/"	+ percurso);
			
			try {
				sleep(10);
//				para que os resultados saiam mais devagar!!!
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
