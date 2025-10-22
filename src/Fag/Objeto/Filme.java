package Fag.Objeto;

public class Filme {
	
	    private String titulo;
	    private double avaliacao;

	    // Construtor vazio
	    public Filme() {
	        // opcional: inicializações padrão
	        this.titulo = "";
	        this.avaliacao = 0.0;
	    }

	    // Construtor com parâmetros (reutiliza setters)
	    public Filme(String titulo, double avaliacao) {
	        setTitulo(titulo);
	        setAvaliacao(avaliacao);
	    }

	    // Getter e Setter para titulo
	    public String getTitulo() {
	        return titulo;
	    }

	    public void setTitulo(String titulo) {
	        if (titulo == null || titulo.trim().isEmpty()) {
	            throw new IllegalArgumentException("O título não pode ser vazio.");
	        }
	        this.titulo = titulo.trim();
	    }

	    // Getter e Setter para avaliacao
	    public double getAvaliacao() {
	        return avaliacao;
	    }

	    public void setAvaliacao(double avaliacao) {
	        if (avaliacao < 0.0 || avaliacao > 5.0) {
	            throw new IllegalArgumentException("A avaliação deve estar entre 0 e 5.");
	        }
	        this.avaliacao = avaliacao;
	    }

	    // Método exibir conforme solicitado
	    public void exibir() {
	        System.out.println("Filme: " + titulo + " | Avaliação: " + avaliacao + " ⭐");
	    }
	}


