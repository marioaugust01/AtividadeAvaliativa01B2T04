package Fag.Objeto;

public class Principal {

	public static void main(String[] args) {
		
		
		// 1. ContaBancaria:
		/*
		   
		        // Cria uma conta com titular e saldo inicial
		        ContaBancaria conta = new ContaBancaria("Mario", 500);

		        // Realiza um depósito
		        conta.depositar(200);

		        // Realiza um saque
		        conta.sacar(100);

		        // Exibe o saldo final
		        System.out.println("Saldo final: R$" + conta.getSaldo());
		        
			}     
	*/
		
		// 2. Filme:
		
		/*
		
		Filme filme1 = new Filme("O Poderoso Chefão", 4.9);
		Filme filme2 = new Filme();
		filme2.setTitulo("A Origem");
		filme2.setAvaliacao(4.7);

		filme1.exibir();
		filme2.exibir();
		*/
	

	

	
		
		// 3. Funcionario:
		
		
		/*
		Funcionario funcionario = new Funcionario("Carlos Silva", 2500.00);

		System.out.println("Antes do aumento:");
		funcionario.exibir();

		// Aumenta o salário em 10%
		funcionario.aumentarSalario(10);

		System.out.println("Depois do aumento:");
		funcionario.exibir();
		*/

		
		// 4. Retangulo
		
		/*
		 Retangulo  ret = new  Retangulo ( 3 , 10 );
	        System . out . println ( "Área: " + ret . area ());
	        System . out . println ( "Perímetro: " + ret . perimetro ());

	        System . out . println ();
	        
	      */  
	
		// 5. Musica
		
		
		 {
		    Musica musica1 = new Musica("Vida de Artista", 154);
		    Musica musica2 = new Musica("Hino do Gremio", 290);

		    System.out.println(musica1.getTitulo() + " - " + musica1.formatarDuracao());
		    System.out.println(musica2.getTitulo() + " - " + musica2.formatarDuracao());
		}
		
		
		// 6. Pessoa
		/*
		 {
		    Pessoa pessoa1 = new Pessoa("Mario Augusto", 83.5, 1.78);

		    double imc = pessoa1.calcularIMC();
		    String classificacao = pessoa1.classificacaoIMC();

		    System.out.printf("%s possui IMC de %.2f - %s%n", pessoa1.getNome(), imc, classificacao);
		}
		*/
		
		
	}
}
	



