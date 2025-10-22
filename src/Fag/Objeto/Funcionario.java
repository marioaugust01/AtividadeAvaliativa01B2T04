package Fag.Objeto;

public class Funcionario {

	
	    private String nome;
	    private double salario;

	    // Construtor
	    public Funcionario(String nome, double salario) {
	        setNome(nome);
	        setSalario(salario);
	    }

	    // Getter e Setter para nome
	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        if (nome == null || nome.trim().isEmpty()) {
	            throw new IllegalArgumentException("O nome não pode ser vazio.");
	        }
	        this.nome = nome.trim();
	    }

	    // Getter e Setter para salário
	    public double getSalario() {
	        return salario;
	    }

	    public void setSalario(double salario) {
	        if (salario < 0) {
	            throw new IllegalArgumentException("O salário não pode ser negativo.");
	        }
	        this.salario = salario;
	    }

	    // Método para aumentar o salário por percentual
	    public void aumentarSalario(double percentual) {
	        if (percentual <= 0) {
	            System.out.println("O percentual deve ser maior que zero.");
	        } else {
	            double aumento = salario * (percentual / 100);
	            salario += aumento;
	            System.out.println("Salário aumentado em " + percentual + "% com sucesso!");
	        }
	    }

	    // Método para exibir informações do funcionário
	    public void exibir() {
	        System.out.println("Funcionário: " + nome + " | Salário: R$" + String.format("%.2f", salario));
	    }
	}


