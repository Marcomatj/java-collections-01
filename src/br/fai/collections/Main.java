package br.fai.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Main app = new Main();
		app.start();
	}

	private Scanner ler = new Scanner(System.in);
	private final String VALOR_INVALIDO = "VALOR_INVALIDO";

	private void start() {

		List<String> lista = new ArrayList<String>();

		while (lista.size() < 5) {
			String valorRecebido = obterDados();
			System.out.println("Valor recebido foi: " + valorRecebido);
			if (valorRecebido.isEmpty() || valorRecebido.equals(VALOR_INVALIDO)) {
				System.out.println("Valor descartado.");
			} else {

				lista.add(valorRecebido);
			}
		}
		System.out.println("-----------------");
		for (String item : lista) {
			System.out.println("O item da lista e: " + item);

		}
	}

	private String obterDados() {
		try {
			System.out.println("Digite o valor: ");
			int valor = ler.nextInt();
			return String.valueOf(valor);
		} catch (Exception e) {
			ler.next();
			System.out.println("Valor invalido foi digitado");
			return VALOR_INVALIDO;
		}
	}
}
