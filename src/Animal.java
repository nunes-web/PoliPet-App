public abstract class Animal {
    // Atributos
    protected String nome;
    protected double peso = 0.0;
    protected double custoDiario = 0.0;

    // Construtor
    public Animal(String nome, double peso, double custoDiario) {
        this.nome = nome;
        this.peso = peso;
        this.custoDiario = custoDiario;
    }

    public String getNome() {
        return this.nome;
    }

    public String setNome(String nome) {
        return this.nome = nome;
    }

    public double getPeso() {
        return this.peso;
    }

    public double setPeso(double peso) {
        return this.peso = peso;
    }

    public double getCustoDiario() {
        return this.custoDiario;
    }

    // Métodos
    public abstract double calcularCustoDiario();

    public abstract String emitirSom();

    public abstract String interagir();
}
