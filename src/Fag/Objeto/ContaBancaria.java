package Fag.Objeto;
 
public class ContaBancaria {
	
	    // Atributos privados
	    private String titular;
	    private double saldo;

	    // Construtor
	    public ContaBancaria(String titular, double saldoInicial) {
	        if (titular == null || titular.trim().isEmpty()) {
	            throw new IllegalArgumentException("O titular não pode ser vazio.");
	        }
	        if (saldoInicial < 0) {
	            throw new IllegalArgumentException("O saldo inicial não pode ser negativo.");
	        }
	        this.titular = titular;
	        this.saldo = saldoInicial;
	    }

	    // Método para depositar
	    public void depositar(double valor) {
	        if (valor <= 0) {
	            System.out.println("O valor do depósito deve ser positivo.");
	        } else {
	            saldo += valor;
	            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
	        }
	    }

	    // Método para sacar
	    public void sacar(double valor) {
	        if (valor <= 0) {
	            System.out.println("O valor do saque deve ser positivo.");
	        } else if (saldo - valor < 0) {
	            System.out.println("Saldo insuficiente para realizar o saque.");
	        } else {
	            saldo -= valor;
	            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
	        }
	    }

	    // Getters e Setters
	    public String getTitular() {
	        return titular;
	    }

	    public void setTitular(String titular) {
	        if (titular == null || titular.trim().isEmpty()) {
	            System.out.println("O titular não pode ser vazio.");
	        } else {
	            this.titular = titular;
	        }
	    }

	    public double getSaldo() {
	        return saldo;
	    }

	    public void setSaldo(double saldo) {
	        if (saldo < 0) {
	            System.out.println("O saldo não pode ser negativo.");
	        } else {
	            this.saldo = saldo;
	        }
	    }
	}



	

