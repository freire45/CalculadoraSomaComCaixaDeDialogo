package br.com.erickfreire.calculadorasomacomcaixadedialogo;

import javax.swing.JOptionPane;

/**
 * Crie um programa em Java que calcula a soma de dois valores, use caixas de diálogo.
 * @author Erick Freire
 * @version 1 - Criado em 30-03-2021 as 15:30
 */

public class CalculadoraSomaComCaixaDeDialogo {

	public static void main(String[] args) {
		int numero1;
		int numero2;
		int resultado;
		String num1;
		String num2;
		String mensagem;
		
		JOptionPane.showMessageDialog(null, "Bem vindo a Calculadora de Soma");
		
		num1 = JOptionPane.showInputDialog("Digite o primeiro valor: ");
		num2 = JOptionPane.showInputDialog("Digite o Segundo valor: ");
		
		numero1 = Integer.parseInt(num1);
		numero2 = Integer.parseInt(num2);
		resultado = numero1 + numero2;
		
		mensagem = String.format("O resultado da soma é de: %d", resultado);
		
		JOptionPane.showMessageDialog(null, mensagem);

	}

}
