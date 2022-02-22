package ui;

import java.util.Scanner;

import core.QuestaoComDica;
import core.QuestaoMultiplaEscolha;
import core.QuestaoSimples;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int pontos = 0;
		QuestaoSimples listaQuestoes[];
		
		listaQuestoes = new QuestaoSimples[3];
		
		listaQuestoes[0] = new QuestaoSimples("What is the capital of Japan?", "Tokyo");
		listaQuestoes[1] = new QuestaoMultiplaEscolha("What is the color of coal?", "Black", "Black","Blue", "Yellow", "Donkey on the run");
		listaQuestoes[2] = new QuestaoComDica("What is the easiest way to go up?", "Hitting the bottom", "Think up side down");
		
		System.out.println("Boa Prova!");
		
		for (QuestaoSimples q: listaQuestoes) {
			System.out.println(String.format("%s", q.aplicarQuestao()));
			String resposta = scan.nextLine();
			if(q.corrigir(resposta)) {
				System.out.println("Resposta certa!! Arrasou!\n");
				pontos++;
			} else {
				System.out.println("Errou burrao!");
			};
		}
		
		System.out.println("Parabens, voce acertou " + pontos + "/"+ listaQuestoes.length);
	}
	
	

}
