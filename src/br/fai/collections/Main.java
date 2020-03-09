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
	
	
	private void start() {
		
		List<String> lista = new ArrayList<String>();
		String valorRecebido = obterDados();
		System.out.println("Valor recebido foi: "+ valorRecebido);
	}
	
	private String obterDados() {
		System.out.println("Digite o valor: ");
		
		int valor = ler.nextInt();
		
		return String.valueOf(valor);
		
		
	}
	
}
