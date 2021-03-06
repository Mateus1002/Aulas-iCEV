package br.com.somosicev.classes.aula15.interfaces.visao;

import br.com.somosicev.classes.aula15.interfaces.controle.SistemaDeControle;

/**
 * Herança de Classe
 * Herança de Tipo
 * 
 * @author alcemirsantos
 */
public class SistemaDeVigilancia extends SistemaDeControle implements EscutadorDeAlarme {

	@Override
	public void alarmar() {
		System.out.println("Vigilancia - pelos números:");
		pelosNumeros();
	}

	@Override
	protected void isolar() {
		System.out.println("   train the cameras");
	}

}
