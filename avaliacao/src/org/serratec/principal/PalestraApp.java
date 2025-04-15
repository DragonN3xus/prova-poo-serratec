package org.serratec.principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.serratec.modelo.Palestrante;
import org.serratec.modelo.Participante;
import org.serratec.modelo.Pessoa;

public class PalestraApp {
	
	private static Scanner sc = new Scanner(System.in);
	private static List<Pessoa> pessoas = new ArrayList<>();
	
	 public static void main(String[] args) {
		 int opcao;
         do {
        	 System.out.println("\n# ===== # PALESTRASAPP # ===== #");
        	 System.out.println("1. Cadastrar Palestrante e/ou Participante"
        			 + "\n2. Listar todos"
        			 + "\n3. Sair");
        	 System.out.print("Escolha uma opção: ");
        	 opcao = sc.nextInt();
        	 switch (opcao) {
        	 case 1:
        		 cadastrarPessoa();
        		 break;
        	 case 2:
        		 listarPessoas();
        		 break;
        	 case 3:
        		 System.out.println("Encerrando o sistema...");
        		 break;
        	 default:
        		 System.out.println("Opção inválida! Tente novamente.");
        	 }
         } while (opcao != 3);
	 }

	private static void cadastrarPessoa() {
		int opcao;
		do {
			System.out.println("Qual o tipo de Pessoa que deseja cadastrar?\n1. Um participante\n2. Um palestrante");
			opcao = sc.nextInt();
			if (opcao != 1 && opcao != 2) {
				System.out.println("Opção invalida, tente novamente.");
			}
			
		} while (opcao != 1 && opcao != 2);
		 sc.nextLine();
		 System.out.print("Informe o nome: ");
		 String nome = sc.nextLine();
		 System.out.print("Informe o CPF: ");
		 String cpf = sc.nextLine();
		 if(opcao == 1) {
			 System.out.print("Informe o email: ");
			 String email = sc.nextLine();
			 pessoas.add(new Participante(nome, cpf, email));
			 System.out.println("Participante " + nome + " cadastrado(a) com sucesso!");
		 } else if (opcao == 2) {
			 System.out.print("Informe o tema da palestra: ");
			 String tema = sc.nextLine();
			 pessoas.add(new Palestrante(nome, cpf, tema));
			 System.out.println("Palestrante " + nome + " cadastrado(a) com sucesso!");
		 }
	}
	
	 private static void listarPessoas() {
	     System.out.println("# ===== # Lista de Pessoas # ===== #");
	        
	        if (pessoas.isEmpty()) {
	            System.out.println("Nenhuma pessoa cadastrada!");
	            return;
	        }
	        
	        for (int i = 0; i < pessoas.size(); i++) {
	            pessoas.get(i).exibirDados();
	            
	            if (pessoas.get(i) instanceof Palestrante) {
	                System.out.println(" | Tipo: Palestrante");
	            } else if (pessoas.get(i) instanceof Participante) {
	                System.out.println(" | Tipo: Participante");
	            }
	        }
		
	}
	 
	 
}
