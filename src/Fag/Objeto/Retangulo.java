package Fag.Objeto;

public class Retangulo {
	
	
	    private double largura;
	    private double altura;

	    // Construtor
	    public Retangulo(double largura, double altura) {
	        setLargura(largura);
	        setAltura(altura);
	    }

	    // Getter e Setter para largura
	    public double getLargura() {
	        return largura;
	    }

	    public void setLargura(double largura) {
	        if (largura <= 0) {
	            throw new IllegalArgumentException("A largura deve ser maior que zero.");
	        }
	        this.largura = largura;
	    }

	    // Getter e Setter para altura
	    public double getAltura() {
	        return altura;
	    }

	    public void setAltura(double altura) {
	        if (altura <= 0) {
	            throw new IllegalArgumentException("A altura deve ser maior que zero.");
	        }
	        this.altura = altura;
	    }

	    // Método que calcula a área
	    public double area() {
	        return largura * altura;
	    }

	    // Método que calcula o perímetro
	    public double perimetro() {
	        return 2 * (largura + altura);
	    }

	    // Método para exibir informações do retângulo
	    public void exibir() {
	        System.out.println("Retângulo -> Largura: " + largura + 
	                           ", Altura: " + altura + 
	                           ", Área: " + area() + 
	                           ", Perímetro: " + perimetro());
	    }
	}



