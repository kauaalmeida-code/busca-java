package com.buscas;
import java.util.Scanner;


public class BuscaJava {

	public static void main(String[] args) {
		
		  Scanner teclado = new Scanner(System.in);
		  
		  System.out.println("Selecione um curso para mais informações: 1-HTML 2-Lógica 3-Pacote Office");
		  
		  int escolha = teclado.nextInt();
		  
		  switch(escolha) {
		  case 1: System.out.println("O HTML é utilizado para criação de sites.");
		  break;
		  
		  case 2: System.out.println("Utilitários para rotinas administrativas.");
		  break;
		  
		  case 3: System.out.println("O HTML é utilizado para criação de sites.");
		  break;
		  
		  default: System.out.println("Dados não encontrados, tente novamente.");
		  break;
		  
		  }

	}

}
