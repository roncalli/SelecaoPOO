package selecaoJava;

import java.security.spec.EncodedKeySpec;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	static Scanner entrada = new Scanner(System.in);
	static SimpleDateFormat formato = new SimpleDateFormat("dd/mm/yyyy");

	
	public static void imprimirClientes (List<Cliente> clientes) {
	  	  System.out.println("\n\n\n------------------IMPRIMINDO DADOS DOS CLIENTES------------------------------");
	  	  for (Cliente aux:clientes) {
	  		  System.out.println("Nome: "+aux.getNome());
	  		  System.out.println("CPF: "+aux.getCPF());
	  		  System.out.println("E-mail: "+aux.getEmail());
	  		  System.out.println("Data de Nascimento: "+formato.format(aux.getDataNascimento()));
	  		  System.out.println("Endereço: "+aux.getEndereco());
	  		System.out.println("\n\n\n------------------------------------------------");
	  	  } 
	  	System.out.println("\n\n\n------------------FIM DA IMPRESSÃO DOS DADOS DOS CLIENTES------------------------------");
		}

	public static void main(String[] args) throws ParseException {
		
		List<Cliente>clientes = new ArrayList<Cliente>();
		boolean continuar = true;
		while(continuar){
		      System.out.println("\n1. Novo Cliente");
		      System.out.println("2. Excluir Cliente");
		      System.out.println("3. Imprimir dados do Cliente");
		      System.out.println("4. Novo Funcionário");
		      System.out.println("5. Excluir Funcionário");
		      System.out.println("6. Imprimir dados do Funcionário");
		      System.out.println("7. Cadastrar Produtos");
		      System.out.println("8. Excluir Produtos");
		      System.out.println("9. Imprimir dados dos Produtos");
		      System.out.println("10. Realizar Venda");
		      System.out.println("11. Sair");
		      System.out.print("Sua opção: ");
		      int opcao = Integer.parseInt(entrada.nextLine());

		      switch(opcao){
		      case 1: 
		    	  Cliente aux = new Cliente();
		    	  System.out.println("\n\n\n------------------------------------------------");
		    	  System.out.println("Nome: ");
		    	  aux.setNome(entrada.nextLine()); 
		    	  System.out.println("CPF: ");
		    	  aux.setCPF(entrada.nextLine());
		    	  System.out.println("E-mail: ");
		    	  aux.setEmail(entrada.nextLine());
		    	  System.out.println("Data de Nascimento: ");
		    	  aux.setDataNascimento(formato.parse(entrada.nextLine()));
		    	  System.out.println("Endereço: ");
		    	  aux.setEndereco(entrada.nextLine());
		    	  clientes.add(aux);
		      case 2:
		    	  System.out.println("\n\n\n------------------------------------------------");
		    	  System.out.println("Informe o CPF do cliente a ser excluído: ");
		    	  String auxCpf = entrada.nextLine();
		    	  boolean encontrou = false;
		    	  for (Cliente cli: clientes) {
		    		  if (cli.getCPF().equals(auxCpf)) {
		    			  clientes.remove(cli);
		    			  System.out.println("Cliente Removido com Sucesso!");
		    			  encontrou = true;
		    			  break;
		    		  }  
		    	  }
		    	  if (!encontrou) {
	    			  System.out.println("Cliente Não Encontrado!");
		    	  }
		    	  System.out.println("\n\n\n------------------------------------------------");
		      case 3:
		    	  imprimirClientes(clientes);
		      case 11:
		    	  continuar = false;
		    	  break; 
		      }
		}
	}


}